package com.company.service;

import com.company.entity.Student;

import java.util.List;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName StudentService
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月22日 14:59:59
 */
public interface StudentService {

    /**
     * 增加用户接口
     * @param student
     * @return
     */
    int addUsers(Student student);

    /**
     * 查询用户接口
     * @return queryStudents
     */
    List<Student> queryStudents();
}
