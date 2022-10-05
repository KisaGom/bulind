package com.inzisoft.bulind.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.inzisoft.bulind.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	@Override
	public List<BoardDto> getArticle() throws Exception {
		return boardRepository.findAll();
	}

	@Override
	public BoardDto writeArticle(BoardDto boardDto) throws Exception {
		return boardRepository.save(boardDto);
	}

	@Override
	public List<BoardDto> getArticleOnPage(Pageable pageable) throws Exception {
		return boardRepository.findAll(pageable).getContent();
	}


}
