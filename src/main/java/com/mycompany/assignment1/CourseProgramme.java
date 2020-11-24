/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

import org.joda.time.*;
import java.util.*;
import com.mycompany.assignment1.Module;
/**
 *
 * @author isaac.scanlan
 */

/* - - Edit has been made here - - */
public class CourseProgramme {
    
    String programmeName;
    LocalDate start, end;
    HashMap<String,Module> moduleList;
    HashMap<String,Student> studentList;
    
    public CourseProgramme(String n, LocalDate startDate, LocalDate endDate){
        programmeName = n;
        start = startDate;
        end = endDate;
        
        moduleList = new HashMap<String,Module>();
        studentList = new HashMap<String,Student>();
    }
    
    public HashMap<String, Module> getModuleList() { return moduleList; }
    public Module getModule(String mod) { return moduleList.get(mod); }
    public HashMap<String, Student> getStudentList() { return studentList; }
    public Student getStudent(String student) { return studentList.get(student); }
    public LocalDate getStart() { return start; }
    public LocalDate getEnd() { return end; }
    public String getProgrammeName(){ return programmeName; }
    
    public void setModuleList(HashMap<String, Module> moduleList) { this.moduleList = moduleList; }
    public void setStudentList(HashMap<String, Student> studentList) { this.studentList = studentList; }
    public void setStart(LocalDate start) { this.start = start; }
    public void setEnd(LocalDate end) { this.end = end; }
    public void setProgrammeName(String name) { programmeName = name; }
    
    public void addModule(Module m){ moduleList.put(m.getName(),m); }
    public void addStudent(Student s){ studentList.put(s.getName(),s); }
}
