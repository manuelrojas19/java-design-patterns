package com.manuelr.jdp.prototype.copyctor;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Employee manuel = Employee.builder()
            .name("Manuel")
            .address(Address.builder()
                    .streetAddress("Sur 161")
                    .city("Mexico City")
                    .country("Mexico")
                    .build())
            .build();
        Employee get = new Employee(manuel);
        get.setName("Get");
        System.out.println(manuel);
        System.out.println(get);
    }
}
