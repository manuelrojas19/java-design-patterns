package com.manuelr.jdp.prototype.cloneable;

import com.manuelr.jdp.prototype.cloneable.*;

/**
 *
 * Shallow copying, when we take the references and copy those refereces over and over.
 * */
public class App {
    public static void main( String[] args ) throws Exception {
    // Implementation of clonable it is not recommend
        Person manuel = Person.builder()
            .firstName("Manuel Antonio")
            .lastName("Rojas Ramos")
            .address(Address.builder()
                    .streetName("Sur 161")
                    .houseNumber(2435)
                    .build())
            .build();
        Person get = (Person) manuel.clone();
        get.getAddress().setHouseNumber(12);;
        System.out.println(manuel);
        System.out.println(get);
    }
}
