package com.manuelr.jdp.builder.fluent;

/**
 * EmployeeBuilder
 */
public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder worksAt(String position) {
        person.setPosition(position);
        return this;
    }
   
    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
