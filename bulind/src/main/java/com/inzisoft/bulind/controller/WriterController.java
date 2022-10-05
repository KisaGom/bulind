package com.inzisoft.bulind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inzisoft.bulind.dto.WriterDto;
import com.inzisoft.bulind.model.WriterService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/writer")
public class WriterController {
	
	@Autowired
	private WriterService writerService;
	
	
	@GetMapping("/")
	@ApiOperation(value = "Get All Writers", response = WriterDto.class)
	public ResponseEntity<?> getAllWriters() {
		
		List<WriterDto> result;
		
		try {
			result = writerService.getAllWriters();
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<WriterDto>>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<WriterDto>>(result, HttpStatus.OK);
	}

	
	@PostMapping("/")
	@ApiOperation(value = "Insert New Writer", response = HttpStatus.class)
	public ResponseEntity<?> insertWriter(@RequestBody WriterDto writerDto) {
		WriterDto result;
		try {
			result = writerService.insertWriter(writerDto);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<WriterDto>(result, HttpStatus.OK);
	}
}
