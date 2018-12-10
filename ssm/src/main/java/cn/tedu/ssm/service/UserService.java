package cn.tedu.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.tedu.ssm.pojo.User;

public interface UserService {
	public List<User> findAll();

	// 查询某个用户，使用注解方式
	public User get(Integer id);

	// 新增用户
	public void add(User user);

	// 修改用户信息
	public void update(User user);

	// 删除某个用户
	public void delete(Integer id);
}
