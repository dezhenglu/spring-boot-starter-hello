package com.wisely.spring_boot_starter_hello;

import org.springframework.stereotype.Service;

public class HelloService {

	private String msg;
	public String sayHello(){
		return "Hello " + getMsg();
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
