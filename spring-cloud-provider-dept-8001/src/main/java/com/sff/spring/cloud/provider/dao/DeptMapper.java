package com.sff.spring.cloud.provider.dao;

import com.sff.spring.cloud.api.Dept;

import java.util.List;

public interface DeptMapper {

    List<Dept> selectAll();

}
