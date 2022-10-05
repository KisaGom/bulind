package com.inzisoft.bulind.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inzisoft.bulind.dto.WriterDto;

@Service
public class WriterServiceImpl implements WriterService {

	@Autowired
	private WriterRepository writerRepo;
	
	@Override
	public List<WriterDto> getAllWriters() {
		return writerRepo.findAll();
	}

	@Override
	public WriterDto insertWriter(WriterDto writerDto) {
		return writerRepo.save(writerDto);
	}

}
