package com.inzisoft.bulind.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name="Board")
@Entity
@ToString
@Getter
@Setter
public class BoardDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seq;
	private String title;
	private String content;
	private String writer;
	@Transient
	private Date reg_date;
}
