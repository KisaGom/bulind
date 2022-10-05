package com.inzisoft.bulind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inzisoft.bulind.dto.BoardDto;
import com.inzisoft.bulind.model.BoardService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@ApiOperation(value = "Get All Articles", response = BoardDto.class)
	@GetMapping("/article")
	public ResponseEntity<?> getArticle(Pageable pageable) throws Exception {
		System.out.println(pageable.toString());
		System.out.println(pageable.getPageNumber());
		System.out.println(pageable.getPageSize());
		System.out.println("getArticles");
//		List<BoardDto> result = boardService.getArticle();
		List<BoardDto> result = boardService.getArticleOnPage(pageable);
		
		if(result != null) 
			return new ResponseEntity<List<BoardDto>>(result, HttpStatus.OK);
		else 		
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@ApiOperation(value = "Write All Articles", response = BoardDto.class)
	@PostMapping("/article")
	public ResponseEntity<?> writeArticle(@RequestBody BoardDto boardDto) throws Exception {
		System.out	.println("Write Articles");
		System.out.println(boardDto);
		BoardDto result;
		try {
			result = boardService.writeArticle(boardDto);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<BoardDto>(result, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Test API", response = HttpStatus.class)
	@GetMapping("/test")
	public ResponseEntity<?> getTest() {
		System.out.println("get test");
		return new ResponseEntity<String>("OK", HttpStatus.OK);
//			return new ResponseEntity<Void>(HttpStatus.BAD_GATEWAY);
		
	}
	
	
}
