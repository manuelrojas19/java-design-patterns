package com.manuelr.jdp.builder;

import com.manuelr.jdp.builder.fluent.EmployeeBuilder;
import com.manuelr.jdp.builder.fluent.Person;
import com.manuelr.jdp.builder.simple.HtmlBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello");
        builder.addChild("li", "world");
        System.out.println(builder);

        HtmlBuilder builderFluent = new HtmlBuilder("ul");
        builderFluent.addChild("li", "hello").addChild("li", "fluently").addChild("li", "world");
        System.out.println(builderFluent);

        // Fluent
        EmployeeBuilder pb = new EmployeeBuilder();
        Person person = pb.withName("Manuel").worksAt("Developer").build();
        System.out.println(person);
    
        Person person2 = Person.builder().build();
    }
}
