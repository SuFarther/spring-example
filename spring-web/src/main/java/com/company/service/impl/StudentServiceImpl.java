package com.company.service.impl;

import com.company.dao.StudentDao;
import com.company.entity.Student;
import com.company.service.StudentService;

import java.util.List;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName StudentServiceImpl
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月22日 15:05:05
 */
public class StudentServiceImpl implements StudentService {

    /**
     * 引用类型
     */
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addUsers(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }


}
