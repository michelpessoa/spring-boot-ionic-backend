package com.michelpessoa.cursomc.resources.exception;

import java.io.Serializable;
import java.util.Date;

public class StandardErro implements Serializable{
	
	private static final long serialVersionUID = -2547749884040212968L;
	
	private Integer status;
	private String msg;
	private Date timeStamp;
	
	public StandardErro(Integer status, String msg, Date timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	

}
