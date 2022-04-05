package com.cognizant.passvalueCons;

public class StudentInfo {
    private int registerNo;
    private String name;

    public StudentInfo(int registerNo) {
        this.registerNo = registerNo;
    }

    public StudentInfo(String name) {
        this.name = name;
    }

    public StudentInfo(int registerNo, String name) {
        this.registerNo = registerNo;
        this.name = name;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printData()
    {
        System.out.println("Register No "+getRegisterNo()+" Name is "+getName());
    }
}
