package com.sff.spring.cloud.provider.service;

import com.sff.spring.cloud.api.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> selectAll();

}
