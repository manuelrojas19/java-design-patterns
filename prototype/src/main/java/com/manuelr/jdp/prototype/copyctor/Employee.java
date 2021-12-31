package com.manuelr.jdp.prototype.copyctor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Employee
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Employee {
    private String name;
    private Address address;

    public Employee(Employee other) {
        name = other.getName();
        address = new Address(other.getAddress());
    }
}
