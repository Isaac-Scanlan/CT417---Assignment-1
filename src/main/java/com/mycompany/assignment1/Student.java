/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

import java.util.*;

/**
 *
 * @author isaac.scanlan
 */
public class Student {
    
    String name, dob, username;
    HashMap<String,CourseProgramme> courses;
    HashMap<String,Module> modules;
    int age, id;
    
    public Student(String n, int a, String bDay){
        name = n;
        age = a;
        dob = bDay;
        
        courses = new HashMap<String,CourseProgramme>();
        modules = new HashMap<String,Module>();
    }
    
    public String getUsername(){ 
        username = name + String.valueOf(age);
        System.out.println("username ===> " + username);
        return username = name + String.valueOf(age); 
    }
    
    public String getName(){ return name; }
    public String getDoB(){ return dob; }
    public int getAge(){ return age; }
    public int getId(){ return id; }
    public HashMap<String,CourseProgramme> getCourses(){ return courses; } 
    public HashMap<String,Module> getModules(){ return modules; }
    
    public void setName(String newName){ name = newName; }
    public void setDoB(String newDoB){ dob = newDoB; }
    public void setAge(int newAge){ age = newAge; }
    public void addCourse(CourseProgramme newCP){ courses.put(newCP.getProgrammeName(), newCP); } 
    public void addModule(Module newMod){ modules.put(newMod.getName(), newMod); }
    
}
