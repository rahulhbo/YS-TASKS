package com.spring.ystask.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.ystask.enums.SuccessCodes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResponseDto {

    private List<String> msg = new ArrayList<String>();
    private boolean status = true;
    private SuccessCodes successCode;
    private int statusCode = 200;
    private Map<String, Object> extraData = new HashMap<String, Object>();
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
	public SuccessCodes getSuccessCode() {
		return successCode;
	}
	public void setSuccessCode(SuccessCodes successCode) {
		this.successCode = successCode;
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