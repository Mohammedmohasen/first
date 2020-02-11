/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication96;

import java.util.Scanner;

/**
 *
 * @author jit
 */
public class itstudent extends student{

  private double grade;
   private  double mid;
   private  double project;
   private  double Final;
    
   public itstudent(String name,int id) {
         super.setName(name);
         super.setId(id);
         super.setMajor("IT");
         grade();
    }

    public itstudent(String name,int id,double mid, double project, double Final) {
        this.mid = mid;
        this.project = project;
        this.Final = Final;
        grade=mid*.30+project*.30+Final*40;
        super.setGrade(grade);
        super.setName(name);
         super.setId(id);
         super.setMajor("IT");
    }
   
    private void grade(){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the mid grade : ");
        this.mid=in.nextInt();
        System.out.println("enter the project grade ");
        this.project=in.nextInt();
        System.out.println("enter the final grade ");
        this.Final=in.nextInt();
        grade=mid*.30+project*.30+Final*40;
        super.setGrade(grade);
    }

   @Override
    public int compareTo(student o) {
        return (int) (this.getGrade()-o.getGrade());
    }
    
}
