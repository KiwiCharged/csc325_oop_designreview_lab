package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
    protected String name;
    protected String address;
    protected short age;

    // constructor that takes only two paras
    public Human(String name, short age) {
            this.name = name;
            this.age = age;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public abstract String getAddress() ;

    public abstract void setAddress(String address);


    public short getAge() {
            return age;
    }

    public void setAge(short age) {
            this.age = age;
    }
}
