package com.system.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

public interface FinanceInterface extends Remote{

    public void addClient(String name) throws RemoteException, SQLException;

    public void updateClient(String name) throws RemoteException;

    public String getClient(String name) throws RemoteException;

    public void deleteClient(String name) throws RemoteException;
}
