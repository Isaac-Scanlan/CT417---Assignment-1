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
public class Module {
    
    String name, id;
    HashMap<String,String> studentList, courseList;
    
    public Module(String n, String newID){
        name = n;
        id = newID;
        
        studentList = new HashMap<String,String>();
        courseList = new HashMap<String, String>();
                
    }
    
    public String getName(){ return name; }
    public String getID(){ return id; }
    public HashMap<String,String> getStudentList(){ return studentList; }
    public HashMap<String,String> getCourseList(){ return courseList; }
    
    public void setName(String n){  }
    public void setID(String newID){  }
    public void setStudentList(HashMap<String,String> sl){ studentList = sl; }
    public void setCourseList(HashMap<String,String> cl){ courseList = cl; }
    
    public void addStudent(String s){ studentList.put(s, s); }
    public void addCourse(String s){ courseList.put(s, s); }
}
