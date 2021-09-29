package com.mosi.springMvc.model;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Person {
    private String firstName;
    private String lastName;
   private String login;

    List<Person> personList;
}
