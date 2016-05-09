package com.system.server;


import com.system.common.RRHHInterface;
import com.system.common.Utils;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) throws Exception{
        Utils.setCodeBase(RRHHInterface.class);

        Server Server = new Server();
        RRHHInterface remote = (RRHHInterface) UnicastRemoteObject.exportObject(Server, 8989);

        Registry registry = LocateRegistry.getRegistry();
        registry.rebind("Servidor", remote);

        System.in.read();

        registry.unbind("Servidor");
        UnicastRemoteObject.unexportObject(Server, true);
    }
}
