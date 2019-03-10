package com.sff.spring.cloud.provider.service.impl;

import com.sff.spring.cloud.api.Dept;
import com.sff.spring.cloud.provider.dao.DeptMapper;
import com.sff.spring.cloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }
}
