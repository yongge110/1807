package cn.tedu.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ssm.mapper.UserMapper;
import cn.tedu.ssm.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAll(){
		return userMapper.findAll();
	}

	@Override
	public User get(Integer id) {
		
		return userMapper.get(id);
	}

	@Override
	public void add(User user) {
		userMapper.add(user);
		
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
		
	}

	@Override
	public void delete(Integer id) {
		userMapper.delete(id);
		
	}
}
