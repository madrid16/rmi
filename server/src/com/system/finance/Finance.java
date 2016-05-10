package com.system.finance;

import com.system.common.FinanceInterface;
import com.system.rrhh.RRHHCrud;

import java.rmi.RemoteException;
import java.sql.SQLException;

public class Finance implements FinanceInterface {

    public FinanceInterface getParseObject(Finance finance){
        return (FinanceInterface) finance;
    }

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
