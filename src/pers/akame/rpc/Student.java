package pers.akame.rpc;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Student extends UnicastRemoteObject implements StudentI {
    private String name;
    private int age;

    protected Student(String name,int age) throws RemoteException {
        this.name=name;
        this.age=age;
    }


    @Override
    public String getStudentInfo() throws RemoteException {
        System.out.println(name+" "+age);
        return name+" "+age;
    }
}
