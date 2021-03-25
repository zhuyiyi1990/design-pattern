package com.github.zhuyiyi1990.designpattern.dataaccessobjectpattern;

import java.util.List;

public interface StudentDao {

    public abstract List<Student> getAllStudents();

    public abstract Student getStudent(int rollNo);

    public abstract void updateStudent(Student student);

    public abstract void deleteStudent(Student student);

}
