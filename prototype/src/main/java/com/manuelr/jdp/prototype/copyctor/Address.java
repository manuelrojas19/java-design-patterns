package com.manuelr.jdp.prototype.copyctor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Address
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Address {
    private String streetAddress;
    private String city;
    private String country;

    public Address(Address other) {
        this(other.getStreetAddress(), other.getCity(), other.getCountry());
    }
}
