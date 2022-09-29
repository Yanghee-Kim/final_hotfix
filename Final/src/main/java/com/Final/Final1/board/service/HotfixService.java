package com.Final.Final1.board.service;

import java.util.List;

import com.Final.Final1.board.model.BoardDTO;
import com.Final.Final1.board.model.HotfixDTO;

public interface HotfixService{
	void insert(HotfixDTO dto);

	
	List<BoardDTO> myRequestlist(HotfixDTO dto);
	
	void resolveMember(HotfixDTO dto);
	
	List<HotfixDTO> resolveMemberlist(HotfixDTO dto);

	int count(String keyword);

	// List<BoardDTO> list(String keyword, String select, int start, int end);


	List<BoardDTO> list(HotfixDTO dto);
}
