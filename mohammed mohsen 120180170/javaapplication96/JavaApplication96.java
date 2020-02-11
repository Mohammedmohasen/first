/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication96;

import java.lang.reflect.Array;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 *
 * @author jit
 */
public class JavaApplication96 {

    
     
    public static void main(String[] args) throws FileNotFoundException {
     File file=new File("C:\\Users\\jit\\Desktop\\file");
     file.mkdir();
     FileOutputStream x=new FileOutputStream(file);
     PrintWriter x1=new PrintWriter(x, true);
     
     student [] student = new student[5];
        student[0]=new itstudent("mohammed", 1,1, 1, 1);
        student[1]=new itstudent("ahmad", 2, 2,2, 2);
        student[2]=new itstudent("ali", 3,5,5,5);
        student[3]=new artstudent("mohgammed", 4,3,3,3);
        student[4]=new artstudent("khalil", 5, 0, 0, 0);
        
       
       
        
/////////////////////////////////////////////////////////////////////////////////////////////        
//this way by lembda use method sort and student name of array and we make two object from the class and we need to know the sign by method and change the return    
//Arrays.sort(student,(student x1, student x2) -> 
//            { return Integer.signum(x2.getGrade()- x1.getGrade());});
//     for(student x:student)
//            System.out.println(x);
/////////////////////////////////////////////////////////////////////////////////////////
//same way but we dont write the body bloke {} and the return statment direct write body of return statment 
//Arrays.sort(student, (student x1, student x2) -> x1.getGrade()-x2.getGrade());
/////////////////////////////////////////////////////////////////////////////////////////////
Arrays.sort(student,new Comparator<student>(){
     @Override
      public int compare(student x1,student x2){
      return x1.getGrade()-x2.getGrade();}});
       for(student any: student)
          x1.println(any);
    
    }}
