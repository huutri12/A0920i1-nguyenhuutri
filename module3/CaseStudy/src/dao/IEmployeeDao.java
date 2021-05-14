package dao;

import model.*;

import java.util.List;

public interface IEmployeeDao {
    void insertEmployee(employee employee);
    employee getEmployee(int id);
    List<employee> getAllEmployee();
    boolean updateEmployee(employee employee);
    boolean deleteEmployee(int id);

    position getPosition(int id);
    education_degree getEducationDegree(int id);
    division getDivision(int id);

    //user
    void insertUser (user user);

    //user role
    void insertUserRole (user_role user_role);
}
