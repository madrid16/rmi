package com.system.server;

import com.system.rrhh.RRHHServer;

import java.rmi.RemoteException;

public class Main {

    public static RRHHServer rrhhServer;

    public static void main(String[] args) throws RemoteException {
        rrhhServer = new RRHHServer();
        try {
            rrhhServer.connectRRHH();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
