package com.system.model;

import com.system.common.RRHHInterface;
import com.system.connect.Connect;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RRHHModel {

    private Connect connect;
    private static RRHHInterface rrhhInterface;
    private static RRHHModel rrhhModel;

    public RRHHModel() throws RemoteException, NotBoundException {
        this.connect = new Connect();
    }

    public static RRHHModel rrhhModel() throws RemoteException, NotBoundException {
        if (RRHHModel.rrhhModel== null){
            RRHHModel.rrhhModel = new RRHHModel();
        }
        return RRHHModel.rrhhModel;
    }

    public void addUserToServer(String name) throws RemoteException{
        try {
            this.connect.registryStart("localhost", 8888);
            this.rrhhInterface = (RRHHInterface) this.connect.getRegistry().lookup("rrhh");
            this.rrhhInterface.addClient(name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
