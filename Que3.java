package com.company.InueronMockTest;

public class Que3 {
    public static void main(String[] args) {
        Person object = new Person("sonu" , 20 , "Saoner");

        System.out.println(object.getName());
        object.setName("prayas");
        System.out.println(object.getName());

        System.out.println(object.getAge());
        object.setAge(18);
        System.out.println(object.getAge());

        System.out.println(object.getAddress());
        object.setAddress("burgaon");
        System.out.println(object.getAddress());
    }
}


class Person {
    private String name ;
    private  int age;
    private String address;

    public Person() {
        name = "sukant";
        age = 21;
        address = "nagpur";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
