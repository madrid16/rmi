package com.system.common;


public class Utils {

    public static final String CODEBASE = "java.rmi.server.codebase";

    public static void setCodeBase(Class<?> c){
        String fullPath = c.getProtectionDomain().getCodeSource().getLocation().toString();
        String path = System.getProperty(CODEBASE);
        if(path != null && !path.isEmpty()){
            fullPath = path + " " + fullPath;
        }
        System.setProperty(CODEBASE, fullPath);
    }
}

