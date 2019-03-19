package com.sff.spring.cloud.grpc;


import com.sff.spring.cloud.grpc.entity.PersonBuilder;

public class TestPersonDemo {


    public static void main(String[] args) {

        PersonBuilder.Person person = PersonBuilder.Person.newBuilder()
                .setEmail("aaaa")
                .setId(1)
                .setName("kate")
                .build();

        System.out.println(person);
    }

}
