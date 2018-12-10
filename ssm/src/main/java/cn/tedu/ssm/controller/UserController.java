package cn.tedu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.ssm.pojo.User;
import cn.tedu.ssm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	//springClound采用RESTFul，SpringBoot它@PathVariable必须写后面变量@PathVariable("id")
	@RequestMapping("/get/{id}")
	public User get(@PathVariable Integer id) {
		return userService.get(id);
	}
	
	@RequestMapping("/add/{name}/{birthday}/{address}")
	public String add(User user) {
		try {
			userService.add(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "add error";
		}
		
		return "add success";
	}
	
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user){
		try {
			userService.update(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "update error";
		}
		
		return "update success";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		try {
			userService.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return "delete error";
		}
		
		return "delete success";
	}
}
