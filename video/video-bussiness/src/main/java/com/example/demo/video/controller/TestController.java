package com.example.demo.video.controller;

import com.example.demo.user.entity.SysUser;
import com.example.demo.video.feign.UserService;
import com.exapmle.demo.common.response.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test/{id}")
    public R<SysUser> getUserInfos(@PathVariable("id") Long id) {

        return userService.getSysUserInfo(id);
    }
}
