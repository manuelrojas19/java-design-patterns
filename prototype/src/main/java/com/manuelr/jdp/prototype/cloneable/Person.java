package com.manuelr.jdp.prototype.cloneable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Person
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Person implements Cloneable {
    private String firstName;
    private String lastName;
    private Address address;

    /**
     * This is incorrect beacuse we are just copying references and we are going to be referring to the
     * same object over again.
     * */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(firstName, lastName, address);
    }
}
