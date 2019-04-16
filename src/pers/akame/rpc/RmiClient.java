package pers.akame.rpc;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
    public static void main(String[] args){
        if(System.getSecurityManager()==null)
            System.setSecurityManager(new SecurityManager());

        try{
            Registry registry= LocateRegistry.getRegistry("localhost",8088);

            //在远程查找名为student的对象
            StudentI student=(StudentI)registry.lookup("student");

            System.out.println(student.getStudentInfo());

        }catch (RemoteException | NotBoundException e){
            e.printStackTrace();
        }
    }
}
