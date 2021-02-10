package com.example.DesignPatterns.model;

public interface Role { // It should be interface not class
    public void setName(String name);

    String getName();

    String getRole();

    void checkAccess();

}
