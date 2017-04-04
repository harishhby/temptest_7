package com.ta3s.baseclass;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAd {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		
		InetAddress IP=InetAddress.getLocalHost();
		System.out.println(IP.toString());
		
		 InetAddress iAddress = InetAddress.getLocalHost();
		  String currentIp = iAddress.getHostAddress();
		  System.out.println(currentIp);

	}

}
