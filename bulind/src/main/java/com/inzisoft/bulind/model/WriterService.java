package com.inzisoft.bulind.model;

import java.util.List;

import com.inzisoft.bulind.dto.WriterDto;

public interface WriterService {
	List<WriterDto> getAllWriters();
	WriterDto insertWriter(WriterDto writerDto);
}
