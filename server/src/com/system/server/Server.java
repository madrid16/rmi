package com.system.server;


import com.system.common.RRHHInterface;

import java.rmi.RemoteException;

public class Server implements RRHHInterface {

    @Override
    public void addClient(String name) throws RemoteException {
        System.out.println(name);
    }

    @Override
    public void updateClient(String name) throws RemoteException {

    }

    @Override
    public String getClient(String name) throws RemoteException {
        return null;
    }

    @Override
    public void deleteClient(String name) throws RemoteException {

    }
}
