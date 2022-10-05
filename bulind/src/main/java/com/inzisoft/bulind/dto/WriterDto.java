package com.inzisoft.bulind.dto;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Entity
@Data
@ToString
@Getter
public class WriterDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seq;
	private String writer_id;
	private String writer_password;
	private String writer_name;
	@Transient
	private Date reg_date;
}
