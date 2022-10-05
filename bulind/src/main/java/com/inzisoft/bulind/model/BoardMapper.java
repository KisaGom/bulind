package com.inzisoft.bulind.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.inzisoft.bulind.dto.BoardDto;

@Mapper
public interface BoardMapper {
	public List<BoardDto> getArticles() throws Exception;
	public int writeArticle(BoardDto boardDto) throws Exception;
}
