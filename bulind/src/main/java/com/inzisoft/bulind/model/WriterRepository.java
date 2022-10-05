package com.inzisoft.bulind.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inzisoft.bulind.dto.WriterDto;

public interface WriterRepository extends JpaRepository<WriterDto, Integer> {

}
