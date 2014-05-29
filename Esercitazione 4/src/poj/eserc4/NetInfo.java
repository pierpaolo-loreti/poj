package poj.eserc4;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class NetInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
			for (NetworkInterface ni : Collections.list(nets)) {
				System.out.println(ni.getDisplayName());
				System.out.println(ni.getName());
				Enumeration<InetAddress> addrs = ni.getInetAddresses();
				for (InetAddress addr : Collections.list(addrs)) {
					System.out.print(addr.getHostAddress()+" - ");
					System.out.println(addr.getAddress());
				}
				
				
				
					
			}
			
			
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
