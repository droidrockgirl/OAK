package com.willowtreeapps.android.shared.lv;

/**
 * User: mlake Date: 10/13/11 Time: 3:31 PM
 */

// START SNIPPET: sectionable

public class Person extends AbstractSectionable {

    private String name;

    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String getSection() {
        return city;
    }

    //when filtering occurs, it is doing a case-insensitive search on toString()
    @Override
    public String toString() {
        return name + " " + city;
    }
}
// END SNIPPET: sectionable