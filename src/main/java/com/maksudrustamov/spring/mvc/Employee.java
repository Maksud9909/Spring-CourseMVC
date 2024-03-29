package com.maksudrustamov.spring.mvc;

import com.maksudrustamov.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min=2,message = "name must be min 2 symbols" )
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500,message = "salary must be greater than 499")
    @Max(value = 1000,message = "salary must be less than 1001")
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String carBrand;
    private Map<String,String> carBrands;
    private String languages;
    private Map<String,String> languagesList;
    @Pattern(regexp = "\\d{2}\\d{3}\\d{2}\\d{2}", message = "please use pattern XX-XXX-XX-XX,without '-'") // 998525858
    private String phoneNumber;
    @CheckEmail (value = "gmail.com",message = "email must ends with abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology","IT");
        departments.put("Human Resources","HR");
        departments.put("Sales","Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Mersedez-benz","MB");
        carBrands.put("Audi","Audi");
        carBrands.put("Chevrolet","Malibu");

        languagesList = new HashMap<>();
        languagesList.put("English","EN");
        languagesList.put("Deutch","DE");
        languagesList.put("Russian","RU");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
