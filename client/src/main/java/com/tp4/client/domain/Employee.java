package com.tp4.client.domain;

public class Employee {

    private String uuid;
    private String name;

    public Employee() {}

    public Employee(String id, String name) {
        this.uuid = id;
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
