package com.system.rrhh;

import com.system.common.RRHHInterface;
import com.system.common.Utils;
import com.system.server.Connect;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RRHHServer {
    public static Connect connect;
    public static int port = 8888;
    public static RRHH rrhh;

    public void connectRRHH() throws RemoteException {
        Utils.setCodeBase(RRHH.class);
        rrhh = new RRHH();
        connect = new Connect();
        RRHHInterface rrhhInterface = (RRHHInterface) UnicastRemoteObject.exportObject(rrhh, port);
        connect.startConnect(rrhh, "rrhh", port);
        try {
            System.in.read();
            connect.stopConnect("rrhh");
            UnicastRemoteObject.unexportObject(rrhh, true);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
