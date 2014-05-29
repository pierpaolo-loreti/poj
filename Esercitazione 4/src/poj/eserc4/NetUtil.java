package poj.eserc4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetUtil {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		byte[] bytes = {(byte)10,(byte)200,(byte)144,(byte)229};
		
		for (byte b : bytes) {
			System.out.print(String.format("%8s", Integer.toBinaryString(b & 0xFF))
					.replace(" ", "0")+".");
		}
		
		System.out.println("\n\n");
		String s = "127.0.0.1";
		NetUtil.printByte(s);
		System.out.println("\n\n");
		
		String mioip=InetAddress.getLocalHost().getHostAddress();
		System.out.println(mioip);
		NetUtil.printByte(mioip);
		
		
		System.out.println("\n\n");
		
		
		InetAddress inet = InetAddress.getByName("www.repubblica.it");
		String pojip= inet.getHostAddress();
		System.out.println(pojip);
		NetUtil.printByte(pojip);
		
		
	}
	
	
	public static void printByte(String ip){
		String[] pezzi =ip.split("\\.");
		
		System.out.println(bytetoString((byte)Integer.parseInt(pezzi[0]))+"."+
							bytetoString((byte)Integer.parseInt(pezzi[1]))+"."+
							bytetoString((byte)Integer.parseInt(pezzi[2]))+"."+
							bytetoString((byte)Integer.parseInt(pezzi[3]))			
				
				);
		
	}
	
	public static String bytetoString(byte b){
		return String.format("%8s", 
				Integer.toBinaryString(b & 0xFF))
						.replace(" ", "0");
		
	}

}










