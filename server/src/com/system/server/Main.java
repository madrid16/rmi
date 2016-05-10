package com.system.server;

import com.system.finance.FinanceServer;
import com.system.rrhh.RRHHServer;

import java.rmi.RemoteException;

public class Main {

    public static RRHHServer rrhhServer;
    public static FinanceServer financeServer;

    public static void main(String[] args) throws RemoteException {
        rrhhServer = new RRHHServer();
        financeServer = new FinanceServer();
        try {
            rrhhServer.connectRRHH();
            financeServer.connectFinance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
