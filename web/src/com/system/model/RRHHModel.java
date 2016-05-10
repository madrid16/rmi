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

    public String getDataFromServer(String name) throws RemoteException{
        try {
            this.connect.registryStart("localhost", 8888);
            this.rrhhInterface = (RRHHInterface) this.connect.getRegistry().lookup("rrhh");
            return this.rrhhInterface.getClient(name);
        }catch (Exception e){
            e.printStackTrace();
            return "Not action complete";
        }
    }

    public boolean deleteUserToServer(String name) throws RemoteException{
        try {
            this.connect.registryStart("localhost", 8888);
            this.rrhhInterface = (RRHHInterface) this.connect.getRegistry().lookup("rrhh");
            this.rrhhInterface.deleteClient(name);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateUserToServer(String originalName, String newName) throws RemoteException{
        try {
            this.connect.registryStart("localhost", 8888);
            this.rrhhInterface = (RRHHInterface) this.connect.getRegistry().lookup("rrhh");
            this.rrhhInterface.updateClient(originalName, newName);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
