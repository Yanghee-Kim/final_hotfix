package com.Final.Final1.board.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Final.Final1.board.model.CommentDTO;
import com.Final.Final1.board.service.CommentService;


@Controller
public class CommentController {
	
	@Autowired
	CommentService commentService; 
	
	@ResponseBody
	@RequestMapping("comment/insert")
	public void insert(CommentDTO dto) {
		commentService.insert(dto);
	}
	
	@RequestMapping("comment/list")
	public ModelAndView list(int Post_num, ModelAndView mv) {
		List<CommentDTO> list = commentService.list(Post_num);
		
		System.out.println(list.toString());
		mv.setViewName("board/comment_list");
		mv.addObject("list", list);
		
		return mv;
	}
	
}












