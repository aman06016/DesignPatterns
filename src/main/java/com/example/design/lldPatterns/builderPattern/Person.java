package com.example.design.lldPatterns.builderPattern;

public class Person {
    private String id;
    private String name;
    private String address;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    private Person(String id, String name, String address, Integer age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Person() {
    }

    public static class Builder{

        private Person person ;

        public Builder withId(String id){
            this.person = new Person();
            this.person.id = id;
            return this;
        }
        public Builder withAge(Integer age){
            this.person.age = age;
            return this;
        }
        public Builder withAddress(String address){
            this.person.address = address;
            return this;
        }
        public Person build(){
            return this.person;
        }
    }
}
