package org.example;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class nwt {
        public nwt(){

        }
    public static void mylookup(String name){
        try {
            InetAddress[] addresses = InetAddress.getAllByName(name);
            if (addresses != null && addresses.length > 0) {
                int index = 1;
                for (InetAddress address : addresses) {
                    String hostname = address.getHostName();
                    if (addresses.length > 1) {
                        hostname = name + "-" + index;
                        index++;
                    }
                    String ip = address.getHostAddress();
                    System.out.println(hostname + " -> " + ip);
                }
            } else {
                InetAddress address = InetAddress.getByName(name);
                String hostname = address.getHostName();
                String ip = address.getHostAddress();
                System.out.println(hostname + " -> " + ip);
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host " + name);
        }
    }
    }



