package com.company.dao;

import com.company.entity.Student;

import java.util.List;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName StudentDao
 * @company 公司
 * @Description StudentDao接口类
 * @createTime 2021年10月21日 16:29:29
 */
public interface StudentDao {

    /**
     * insertStudent是新增学生
     * @param student
     * @return Student
     */
    int insertStudent(Student student);

    /**
     * selectStudents是查询数据
     * @return Student
     */
    List<Student> selectStudents();
}
