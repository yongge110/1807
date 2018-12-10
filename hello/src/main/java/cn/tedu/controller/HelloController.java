package cn.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //身份标识
public class HelloController {
	//SpringCloud中采用RESTFul+json返回
	@RequestMapping("hello/{name}")
	@ResponseBody
	public String hello(@PathVariable String name) {
		return "hello springboot "+name;
	}
}
