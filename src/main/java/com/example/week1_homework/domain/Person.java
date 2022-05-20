package com.example.week1_homework.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Person {
        @Id // ID값, name을 키로 사용하겠다
        @GeneratedValue(strategy = GenerationType.AUTO) // 자동증가명령
        private String name;
        @Column(nullable = false) // 컬럽 반드시 값이 존재해야됨
        private String address;
        @Column(nullable = false)
        private int age;
        @Column(nullable = false)
        private String job;

        //기본생성자 noargsconstructor로 없앰

    public Person(String name, String address, int age, String job){
            this.name = name;
            this.address = address;
            this.age = age;
            this.job = job;
    }

    //getter
    public String getName(){
            return this.name;
    }
    public String getAddress(){
            return  this.address;
    }
    public int getAge(){
            return this.age;
    }
    public String getJob(){
            return this.job;
    }

    //setter
}
