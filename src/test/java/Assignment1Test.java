/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.assignment1.CourseProgramme;
import com.mycompany.assignment1.Module;
import com.mycompany.assignment1.Student;
import java.util.logging.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.joda.time.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isaac.scanlan
 */
public class Assignment1Test {
    
    CourseProgramme ece;
    Student s1;
    
    @Test
    public void test1(){
        ece = new CourseProgramme("Electronic and Computer Engineering",(new LocalDate( 2020 , 9 , 28 )), (new LocalDate( 2021 , 1 , 15 )));
        ece.addModule(( new Module("Machine Learning","CT4101") ));
        ece.addModule(( new Module("Software Engineering III","CT417") ));
        ece.addModule(( new Module("Digital Signal Processing","EE445") ));
        ece.addModule(( new Module("System on Chip Design I","EE451") ));
        ece.addModule(( new Module("Telecommunications Software Applications","EE453") ));
        
        for(String s: ece.getModuleList().keySet())
            ece.getModuleList().get(s).addCourse(ece.getProgrammeName());
        
        s1 = new Student("Pat", 22, "23-07-1998");
        s1.addCourse(ece);
        for(String s: ece.getModuleList().keySet())
            s1.addModule(ece.getModuleList().get(s));
        
        ece.addStudent(s1);
        
        assertEquals(s1.getUsername(), "Pat22");
        assertEquals(s1.getModules().get("Machine Learning").getName(), "Machine Learning");
        assertEquals(s1.getModules().get("Software Engineering III").getID(), "CT417");
        assertEquals(s1.getCourses().get("Electronic and Computer Engineering").getProgrammeName(),
                "Electronic and Computer Engineering");
        
        assertEquals(ece.getStart(), (new LocalDate( 2020 , 9 , 28 )));
        assertEquals(ece.getEnd(), (new LocalDate( 2021 , 1 , 15 )));
        assertEquals(ece.getStudent("Pat").getName(),"Pat");
        
       
    }
    
    public Assignment1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {

        
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
