package com.tedu.mapper;

import java.util.List;

import com.tedu.pojo.Dongyang;
import org.apache.ibatis.annotations.*;


public interface UserMapper {
	//查询
	@Select("SELECT * FROM dongyang")
	public List<Dongyang> findAll();
	

}
