package com.vmoksha.recycleviewdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AbakashaP on 30-12-2015.
 */
public class Person {
    String name;
    String age;
    int photoId;

    Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }


    private List<Person> persons;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData() {

    }

}
