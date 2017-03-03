package data.dao;

import vo.Student;

public interface StudentsDao {
    void addStudent(Student student);
    public Student getStudentById(int id);
}