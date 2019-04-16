package pers.akame.rpc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentI extends Remote {

    public String getStudentInfo() throws RemoteException;
}