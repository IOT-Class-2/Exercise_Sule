package com.suleyalcin.Day2;

public class Main {

    public static void main(String[] args) {

        Engineer employeeOne = new Engineer ("Sule Yalcin", 9500,24);
        Salesperson employeeTwo = new Salesperson ("Nevcan Soycan", 8500,25 , .32);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getComissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getComissionPercentage());

    }

    }
