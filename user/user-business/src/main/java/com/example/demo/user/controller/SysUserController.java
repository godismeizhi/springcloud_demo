package com.example.demo.user.controller;


import com.example.demo.user.entity.SysUser;
import com.example.demo.user.response.UserCode;
import com.example.demo.user.service.ISysUserService;
import com.exapmle.demo.common.response.CommonCode;
import com.exapmle.demo.common.response.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author blue&fat
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("/{id}")
    public R<SysUser> getUserInfo(@PathVariable("id") Long id) {

        if (id == null) {
            return R.getInstance(CommonCode.PARAM_ERROR);
        }

        SysUser sysUser = sysUserService.getById(id);

        log.info(sysUser + "====================");

        return sysUser == null ? R.getInstance(UserCode.USER_NOT_EXAIT) : R.getInstance(sysUser);
    }
}
