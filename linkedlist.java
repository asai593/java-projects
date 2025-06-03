package xyt;

import java.util.*;
public class linkedlist {
	public static void main(String[] args) {
		  TreeMap<Integer,String> ts = new TreeMap<>();
	        ts.put(90,"vishnu");
	        ts.put(80,"mukka");
	        ts.put(88,"amanchi");
	        ts.put(50,"jumangi");
	        ts.put(75,"rock");
	        ts.put(64,"mani");
	        System.out.println(ts);
	        System.out.println(ts.containsKey(88));
	        System.out.println(ts.containsValue("vishnu"));
}
}
