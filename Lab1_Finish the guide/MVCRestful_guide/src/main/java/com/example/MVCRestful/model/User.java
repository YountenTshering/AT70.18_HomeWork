package com.example.MVCRestful.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private int eid;
    private String name;
    private String nationlity;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationlity() {
        return nationlity;
    }

    public void setNationlity(String nationlity) {
        this.nationlity = nationlity;
    }

    @Override
    public String toString() {
        return "User [eid=" + eid + ", name=" + name + ", nationlity=" + nationlity + "]";
    }

}
