package com.system.rrhh;


import com.system.common.RRHHInterface;

import java.rmi.RemoteException;
import java.sql.SQLException;

public class RRHH implements RRHHInterface {

    @Override
    public void addClient(String name) throws RemoteException, SQLException {
        RRHHCrud rrhhCrud = new RRHHCrud();
        rrhhCrud.insert(name);
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
