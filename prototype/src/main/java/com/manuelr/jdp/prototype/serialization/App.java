package com.manuelr.jdp.prototype.serialization;

import org.apache.commons.lang3.SerializationUtils;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Foo foo = new Foo(4, "Life");
        Foo foo2 = SerializationUtils.roundtrip(foo);
        foo2.setWhatever("Success");
        System.out.println(foo);
        System.out.println(foo2);
    }
}
