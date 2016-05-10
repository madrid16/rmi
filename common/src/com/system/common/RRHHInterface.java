package com.system.common;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

public interface RRHHInterface extends Remote{

    public void addClient(String name) throws RemoteException, SQLException;

    public void updateClient(String originalName, String newName) throws RemoteException, SQLException;

    public String getClient(String name) throws RemoteException, SQLException;

    public void deleteClient(String name) throws RemoteException, SQLException;

}
