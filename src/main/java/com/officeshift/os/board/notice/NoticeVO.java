package com.officeshift.os.board.notice;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.officeshift.os.board.BoardVO;

import lombok.Data;

@Data
@Entity
@Table(name="notice")
public class NoticeVO extends BoardVO {

}
