package d.arrays;

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class ArrayInitializer {
	
	public static void main(String[] args) throws NumberFormatException, NoSuchAlgorithmException {
		System.out.println("Starting ...");
		String size = args[0];
		Array[] arr = ArrayUtil.arrayInitializer(Integer.valueOf(size));
		ArrayUtil.loopArray(arr);
		
		Array[] arrHash = ArrayUtil.hashNValues(Integer.valueOf(size));
		ArrayUtil.loopArray(arrHash);
		System.out.println("Complete");
	}
	
}
