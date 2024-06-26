package com.suleyalcin.Day2;



    public class Salesperson extends Employee {
         private double comissionPercentage;

         public Salesperson (String name,double salary,int age,double comissionPercentage) {

             super(name, salary, age);
             this.comissionPercentage = comissionPercentage;

         }
         public double getComissionPercentage () {
             return this.comissionPercentage;

         }
         public void  raiseComission() { // Komisyon yüzdesi %10un altındaysa arttırma işlemi döndürür
             if (this.comissionPercentage < .38) {

                 this.comissionPercentage =
                 this.comissionPercentage*1.2;
             }
         }
    }

