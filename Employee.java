package com.suleyalcin.Day2;

public class Employee { // "public" bu sınıfın erişilebilir olduğunu gösterir.
    private String name; // "private" bu değişkenin sadece bu sınıfın içinden eirişlebilir olduğunu göserir.
    // çalışanın adını tutan bir metin değişkenidir

    //çalışanın maaşını tutan ondalıklı sayı değişkeni
    protected double salary; // bu değişkenin aynı paket içerisinden yada alt sınıflardan erişilebilir.



    // çalışanın yaşını tutan tam sayı değişkeni
    private int age; // "private" bu değişkenin sadece bu sınıfın içinden erşilebilir olduğunu belirtir

    public Employee(String name, double salary, int age) { // bu sınıfın bir örneği oluşturulurken çağrılan metot
        this.name = name; //"name" parametresini sınıfın "name" değişkenine atar
        this.salary = salary; // "salary" parametresini sınıfın "salary" değişkenine atar
        this.age = age; // "age" parametresini sınıfın "age" değişkenine atar
    }


    // Getter ve Setter metotlar: bu metotlar,özel değişkenlerin değerlerini dış dünyaya (başka sınıflara yani) vermek için kullanılır
    public String getName() { //
        return this.name; //
    }


    public int getAge() { //
        return this.age; //
    }

    public void raiseSalary() { // Çalışanın maaşını arttıran metot
        this.salary = this.salary * 1.2; // %20 değerinde maaşı arttırır


    }
}

