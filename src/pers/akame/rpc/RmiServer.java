package pers.akame.rpc;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**需要修改policy否则无法获取读写权限*/

public class RmiServer {
    public static void main(String[] args){
        if(System.getSecurityManager()==null){
            System.setSecurityManager(new SecurityManager());
        }

        try {
            Student student=new Student("a",20);

            //创建注册表
            Registry registry= LocateRegistry.createRegistry(8088);
            System.out.println("创建注册表成功.");

            //将对象注册到服务器上并绑定到student
            registry.bind("student",student);
            System.out.println("对象绑定成功");
        }catch (RemoteException | AlreadyBoundException e){
            e.printStackTrace();
        }
    }
}
