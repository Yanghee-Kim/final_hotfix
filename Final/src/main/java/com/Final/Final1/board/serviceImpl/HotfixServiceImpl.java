package com.Final.Final1.board.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Final.Final1.board.model.BoardDTO;
import com.Final.Final1.board.model.HotfixDAO;
import com.Final.Final1.board.model.HotfixDTO;
import com.Final.Final1.board.service.HotfixService;

@Service
public class HotfixServiceImpl implements HotfixService{
	
	@Autowired
	HotfixDAO HotfixDao;
	
	@Override
	public void insert(HotfixDTO dto) {
		HotfixDao.insert(dto);
	}

	@Override
	public List<BoardDTO> list(HotfixDTO dto) {
		// TODO Auto-generated method stub
		return HotfixDao.list(dto);
	}
	
	
	


}
