package com.system.server;


import com.system.common.RRHHInterface;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Connect {

    private Registry registry;

    public Connect(){
        this.registry = null;
    }

    public void stopConnect(String name) throws RemoteException, NotBoundException {
        registry.unbind(name);
    }

    public void setRegistry(Registry registry){
            this.registry = registry;
    }

    public Registry getRegistry(int port) throws RemoteException{
        if (this.registry == null){
            this.startRegistry(port);
        }
        return this.registry;
    }

    public boolean startConnect(Object object, String name, int port){

        try {
            this.registry = getRegistry(port);
            registry.rebind(name, (Remote) object);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void startRegistry(int port) throws RemoteException{
        try {
            registry = LocateRegistry.getRegistry(port);
            registry.list();
        }catch (RemoteException e){
            registry = LocateRegistry.createRegistry(port);
            registry.list();
        }

    }

}
