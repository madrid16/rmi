package com.system.finance;

import com.system.common.FinanceInterface;
import com.system.common.Utils;
import com.system.server.Connect;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FinanceServer {

    public static Connect connect;
    public static int port = 8888;
    public static Finance finance;

    public void connectFinance() throws RemoteException {
        Utils.setCodeBase(Finance.class);
        finance = new Finance();
        connect = new Connect();
        FinanceInterface financeInterface = (FinanceInterface) UnicastRemoteObject.exportObject(finance, port);
        connect.startConnect(finance.getParseObject(finance), "finance", port);
        try {
            System.in.read();
            connect.stopConnect("finance");
            UnicastRemoteObject.unexportObject(finance, true);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
