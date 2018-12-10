package cn.tedu.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.ssm.pojo.User;

public interface UserMapper {
	public List<User> findAll();

	// 查询某个用户，使用注解方式
	@Select("select * from user where id = #{id}")
	public User get(Integer id);

	// 新增用户
	@Insert("insert into user (name,birthday,address) values(#{name},#{birthday},#{address})")
	public void add(User user);
	
	//修改用户信息
	@Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
	public void update(User user);
	
	//删除某个用户
	@Delete("delete from user where id = #{id}")
	public void delete(Integer id);
}
