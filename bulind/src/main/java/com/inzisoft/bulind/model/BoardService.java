package com.inzisoft.bulind.model;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.inzisoft.bulind.dto.BoardDto;

public interface BoardService {
	public List<BoardDto> getArticle() throws Exception;
	public List<BoardDto> getArticleOnPage(Pageable pageable) throws Exception;
	public BoardDto writeArticle(BoardDto boardDto) throws Exception;
}
