package com.codegym.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employee")
public class Employee implements Validator {
    private static final String PHONE_REGEX="090\\d{7}|091\\d{7}|\\(84\\)\\+91\\d{7}|\\(84\\)\\+90\\d{7}";
    private static final String ID_CARD_REGEX="\\d{9}|\\d{12}";
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    //private static final String BIRTHDAY_REGEX="([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name must not be Blank")
    private String name;

    //@NotBlank(message = "Name must not be Blank")
    private int age;

    @Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")
    private String email;

    @NotBlank(message = "Name must not be Blank")
    private String address;

    @ManyToOne
    @JoinColumn(name = "employeeid")
    private EmployeeTyph employeeTyph;

    public Employee(int id, @NotBlank(message = "Name must not be Blank")String name,   int age
            ,@Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$") String email , @NotBlank(message = "Name must not be Blank" )String address, EmployeeTyph employeeTyph ) {
            this.id = id;
            this.name=name;
            this.address=address;
            this.age=age;
            this.email = email;
            this.employeeTyph =employeeTyph;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeTyph getEmployeeTyph() {
        return employeeTyph;
    }

    public void setEmployeeTyph(EmployeeTyph employeeTyph) {
        this.employeeTyph = employeeTyph;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Employee.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        //int  age = employee.getAge();
        //int id =  employee.getId();
//        String birthDay = employee.getBirthDay();
        String email = employee.getEmail();

        //if(!id.matches(ID_CARD_REGEX)){
         //   errors.rejectValue("idCard","idCard.form");
        //}
        if(!email.matches(EMAIL_REGEX)){
            errors.rejectValue("email","email.form");
        }

    }
}

