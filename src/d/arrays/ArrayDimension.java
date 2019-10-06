package d.arrays;

import java.lang.reflect.Array;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class ArrayDimension {
	
	private static List<String> list = new ArrayList<String>();
	private static String str = null;
	public static void main(String[] args) {

		
		
		
	}
	
	private static Array[] drawSingleDimensionArray(int n) throws NoSuchAlgorithmException {
		Array[] arr = new Array[n];
		for(int i=0; i < n; i++) {
			str = ArrayUtil.hashString(i);
			list.add(str);
			System.out.println(arr[i]);  
		}
		return arr;
	}
	
	private static Array[][] draw2DimensionArray(int i1, int i2) {
		Array[][] arr = new Array[i1][i2];
		
		return arr;
	}

}
