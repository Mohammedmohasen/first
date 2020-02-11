/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication96;

/**
 *
 * @author jit
 */
public abstract class student implements Comparable<student>{
    private int id;
    private double grade;
    private String name;
    private String major;
    public student(){}

    @Override
    public int compareTo(student o) {
        
        
        
        
        return (int) (this.getGrade()-o.getGrade());
    }
   
   
    
    @Override
    public String toString() {
        return "student{" + "id=" + id + ", grade=" + grade + ", name=" + name + ", major=" + major + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return (int) grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
}
