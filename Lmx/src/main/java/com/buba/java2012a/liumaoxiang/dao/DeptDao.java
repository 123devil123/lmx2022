package com.buba.java2012a.liumaoxiang.dao;

import com.buba.java2012a.liumaoxiang.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * InterfaceName：DeptDao
 * autho："祥"
 * Package： com.buba.java2012a.liumaoxiang.dao
 * data：2022/6/1
 */
/*
    部门dao
 */
@Mapper
public interface DeptDao {

    //添加部门信息
    int insertDept(Dept dept);

    //删除部门信息
    int deleteDept(@Param("id") Integer id);


    //删除所有部门信息
    int delp(@Param("id") Integer[] id);
//    void deleteLanguageBatch(List<Integer> list);

    //查询部门信息
    List<Dept> selectDept();

    //更改部门信息
    int updateDept(Dept dept);

    //通过id查
    Dept seleteid(Integer id);



}
