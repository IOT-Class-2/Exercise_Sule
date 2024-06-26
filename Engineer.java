package com.suleyalcin.Day2;


public class Engineer extends Employee { // "public" bu sınıfın erişilebilir olduğunu gösterir.
   //  "extends" employee engineer classını (sınıfının) employee sınıfından miras aldığını belirtir
    // "employee" sınıfından miras aldığını belirtir.Yani "engineer" sınıfının tüm özelliklerine ve metotolarına sahip olur

    public Engineer(String name, double salary, int age) { // bu sınıfın örneğini oluşturulurken çağrılan metodudur (mainden çağrılan metot)
        super(name, salary, age); // bu sınıfın yapıcı metodunu çağırır ve  " employee" sınıfının yapıcı metodunu çağırır. "name","salary","age" parametrelerini "employee" sınfıına iletir


    }
// contructure yapıcı metottur
    public double getAnnualBonus() { // Engineer 'in yıllık bonusunu hesaplayan metot ve bu metotu döndürür
        return super.salary * .05; // bu metot employee sınıfından alınan maaş/salary değişkenine erişir,NE İLE ERİŞİR? super anahtar kelimesi ile erişir.Metodun genel işlebi ise maaşın %5'ini hesaplar ve döndürür.Bu engineer
        // n yıllık bonusunu belirler
    }
}

