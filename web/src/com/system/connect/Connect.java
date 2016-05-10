package com.system.connect;


import com.system.common.RRHHInterface;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Connect {

    private Registry registry;

    private RRHHInterface rrhhInterface;

    public Connect() {
        this.registry = null;
        this.rrhhInterface = null;
    }

    public boolean registryStart(String ip, int port) throws RemoteException {
        try {
            java.security.AllPermission allPermision = new java.security.AllPermission();
            System.setProperty("java.security.policy", "rmi.policy");

            try {
                registry = LocateRegistry.getRegistry(ip, port);
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
            rrhhInterface = (RRHHInterface) registry.lookup("rrhh");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    public RRHHInterface getRrhhInterface() {
        return rrhhInterface;
    }

}
