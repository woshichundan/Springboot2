package com.tedu.controller;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.Dongyang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("find")
    @ResponseBody
    public List<Dongyang> find(){
        return userMapper.findAll();
    }

}






