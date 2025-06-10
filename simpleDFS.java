package xyz;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class simpleDFS {
	
	private Map<String, List<String>> homeMap=new HashMap<String, List<String>>();
	private Set<String> visited=new HashSet<String>();
	
	public void addRomm(String room,String connectedRoom) {
		homeMap.computeIfAbsent(room, k->new ArrayList<>()).add(connectedRoom);
		homeMap.computeIfAbsent(connectedRoom, k->new ArrayList<>()).add(room);
	}
		
	public void dfs(String currentRoom) {
		if(visited.contains(currentRoom)) return;
		visited.add(currentRoom);
		System.out.println("visited: "+ currentRoom);
		
		for(String neighbor : homeMap.getOrDefault(currentRoom, new ArrayList<>())) {
			dfs(neighbor);
		}

			
		}

	public static void main(String[] args) {
		simpleDFS home=new simpleDFS();
		
		
		home.addRomm("Living Room", "Kitchen");
		home.addRomm("Living Room", "Bedroom");

		home.addRomm("Bedroom", "Bathroom");
		
		
		System.out.println("DFss Traversal starting from Living Room \n");
		home.dfs("Living Room");
	}

}
Arr
