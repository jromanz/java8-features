package com.mycompany.cap01;

import com.mycompany.cap01a.PrimitiveAnnTest;

public class Manager extends Employee{
    
    @Override
    public void setSalary(double salary) {
        System.out.println("Employee.setSalary():" + salary);
    }
    
    @PrimitiveAnnTest(a=1, b=2, c=3, d=4, e=12.34F, f=1.89, g=true, h='Y')
    public void printData(){
    }
}
