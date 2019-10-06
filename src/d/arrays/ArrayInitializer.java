package d.arrays;

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class ArrayInitializer {
	private static String key= "abcdefghijklmnopqrstuvwxyz123456789";
	
	public static void main(String[] args) throws NumberFormatException, NoSuchAlgorithmException {
		System.out.println("Starting ...");
		String size = args[0];
		Array[] arr = ArrayInitializer.arrayInitializer(Integer.valueOf(size));
		loopArray(arr);
		
		Array[] arrHash = hashNValues(Integer.valueOf(size));
		loopArray(arrHash);
		System.out.println("Complete");
	}
	
	private static Array[] arrayInitializer(int size) {
		Array [] arr = new Array[size];
		return arr;
	}
	
	private static void loopArray(Array[] arr) {
		//traversing array  
		for(int i=0;i<arr.length;i++)//length is the property of array  
		System.out.println(arr[i]);  
	}
	
	private static Array[] hashNValues(Integer n) throws NoSuchAlgorithmException {
		String str = null;
		Array [] arr = ArrayInitializer.arrayInitializer(Integer.valueOf(n));
		List<String> list = new ArrayList<>();
		
		for(int i=0; i < n; i++) {
			str = hashString(i);
			list.add(str);
			System.out.println(arr[i]);  
		}
		arr = list.toArray(new Array[list.size()]);
		return arr;
		
	}
	
	private static String hashString(int i) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(key.getBytes());
		byte[] digest = md.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(String.format("%02x", b & 0xff));
		}
		System.out.println("key:" + key);
		System.out.println("digested(hex):" + sb.toString());
		return sb.toString();
	}

}
