package xyt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
class A
{
	public A()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
	}
}
class B extends A
{
	public B()
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sai");
		ll.add("ravi");
		ll.add("ram");
		ll.add("janu");
		System.out.println(ll);
	}
}
class C extends B
{
	public C()
	{
	HashSet<String> hs=new HashSet<String>();
	hs.add("sai");
	hs.add("ravi");
	hs.add("ram");
	hs.add("siva");
	System.out.println(hs);
}
}
class D extends C
{
	public D()
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(3340, "sai");
		hm.put(3341, "ravi");
		hm.put(3342, "ram");
		hm.put(3343, "janu");
		System.out.println(hm);
	}
}
class E extends D
{
	public E()
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("fun");
		ts.add("king");
		ts.add("janu");
		ts.add("guna");
		ts.add("ganu");
		System.out.println(ts);
		System.out.println(ts.add("guna"));
	}
}
class F extends E
{
	public F()
	{
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("sai",24);
		tm.put("ravi",23);
		tm.put("ram",23);
		tm.put("janu",25);
		tm.put("rani",993456789);
		tm.put("ganu", 89234596);
		tm.put("fun", 638920184);
		System.out.println(tm);
		System.out.println(tm.containsKey("sai"));
	}
}
public class allexample {

	public static void main(String[] args) {
		
		
		F f=new F();
		
	}

}
