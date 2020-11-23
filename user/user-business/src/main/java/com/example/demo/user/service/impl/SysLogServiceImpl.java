package com.example.demo.user.service.impl;

import com.example.demo.user.entity.SysLog;
import com.example.demo.user.mapper.SysLogMapper;
import com.example.demo.user.service.ISysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author blue&fat
 * @since 2020-11-19
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
