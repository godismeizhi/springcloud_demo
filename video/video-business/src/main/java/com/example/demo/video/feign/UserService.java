package com.example.demo.video.feign;


import com.example.demo.user.entity.SysUser;
import com.exapmle.demo.common.response.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user")
public interface UserService {

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    R<SysUser> getSysUserInfo(@PathVariable("id") Long id);
}
