package com.spring.ystask.dto;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.ystask.enums.YsTaskException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponseDto {

    private List<String> msg = new ArrayList<String>();
    private boolean status = false;
    private YsTaskException exception;
    private int statusCode = 404;
    Map<String, Object> extraData = new HashMap<String, Object>();
	public List<String> getMsg() {
		return msg;
	}
	public void setMsg(List<String> msg) {
		this.msg = msg;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public YsTaskException getException() {
		return exception;
	}
	public void setException(YsTaskException exception) {
		this.exception = exception;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Map<String, Object> getExtraData() {
		return extraData;
	}
	public void setExtraData(Map<String, Object> extraData) {
		this.extraData = extraData;
	}
}
