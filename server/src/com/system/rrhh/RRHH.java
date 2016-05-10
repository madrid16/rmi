package com.system.rrhh;


import com.system.common.RRHHInterface;

import java.rmi.RemoteException;
import java.sql.SQLException;

public class RRHH implements RRHHInterface {

    public RRHHInterface getParseObject(RRHH rrhh){
        return (RRHHInterface)rrhh;
    }

    @Override
    public void addClient(String name) throws RemoteException, SQLException {
        RRHHCrud rrhhCrud = new RRHHCrud();
        rrhhCrud.insert(name);
    }

    @Override
    public void updateClient(String originalName, String newName) throws RemoteException, SQLException {
        RRHHCrud rrhhCrud = new RRHHCrud();

        rrhhCrud.edit(originalName, newName);
    }

    @Override
    public String getClient(String name) throws RemoteException, SQLException {
        RRHHCrud rrhhCrud = new RRHHCrud();

        return rrhhCrud.get(name);
    }

    @Override
    public void deleteClient(String name) throws RemoteException, SQLException {
        RRHHCrud rrhhCrud = new RRHHCrud();

        rrhhCrud.delete(name);
    }
}
