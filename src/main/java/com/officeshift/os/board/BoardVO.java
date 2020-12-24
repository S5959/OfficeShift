package com.officeshift.os.board;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class BoardVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	private String title;
	private String writer;
	private String contents;
	@Column(updatable = false)
	@CreationTimestamp
	private String regDate;
	private String hit;
}
