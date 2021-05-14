package service;

import com.sun.corba.se.impl.javax.rmi.CORBA.StubDelegateImpl;
import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {

    public static Map<String, Student> studentMap;

    public StudentServiceImpl(){
        if (studentMap != null){
            return;
        }
        studentMap = new HashMap<>();
        studentMap.put("1", new Student("1","Hoang",10,"Da Nang"));
        studentMap.put("2", new Student("2","Hoan",20,"Nghe An"));
        studentMap.put("3", new Student("3","Hog",30,"Quang Nam"));
        studentMap.put("4", new Student("4","Hoag",7,"Ha Tinh"));
        studentMap.put("5", new Student("5","Hang",15,"Ha Noi"));

    }

    @Override
    public Student getStudentById(String id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void saveStudent(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void updateStudent(Student student) {
        if (studentMap.get(student.getId()) != null){
            studentMap.put(student.getId(),student);
        }
    }

    @Override
    public void deleteStudent(String id) {
        if (studentMap.get(id) != null){
            studentMap.remove(id);
        }
    }
}
