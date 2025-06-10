package xyt;

import java.util.*;

public class iter {
    private Map<String, List<String>> homemap = new HashMap<>();

    public void connectRooms(String room, String crooms) {
        homemap.computeIfAbsent(room, k -> new ArrayList<>()).add(crooms);
        homemap.computeIfAbsent(crooms, k -> new ArrayList<>()).add(room);
    }

    // Recursive DFS helper to collect connected component
    private void dfsRecursive(String node, Set<String> visited, List<String> component) {
        if (visited.contains(node)) return;
        visited.add(node);
        component.add(node);
        for (String neighbor : homemap.getOrDefault(node, Collections.emptyList())) {
            dfsRecursive(neighbor, visited, component);
        }
    }

    // Iterative DFS helper to collect connected component
    private List<String> dfsIterative(String start, Set<String> visited) {
        List<String> component = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            String node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                component.add(node);
                for (String neighbor : homemap.getOrDefault(node, Collections.emptyList())) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return component;
    }

    // Returns a list of connected components using recursive DFS
    public List<List<String>> getAllConnectedComponentsRecursive() {
        Set<String> visited = new HashSet<>();
        List<List<String>> allComponents = new ArrayList<>();

        for (String node : homemap.keySet()) {
            if (!visited.contains(node)) {
                List<String> component = new ArrayList<>();
                dfsRecursive(node, visited, component);
                allComponents.add(component);
            }
        }
        return allComponents;
    }

    // Returns a list of connected components using iterative DFS
    public List<List<String>> getAllConnectedComponentsIterative() {
        Set<String> visited = new HashSet<>();
        List<List<String>> allComponents = new ArrayList<>();

        for (String node : homemap.keySet()) {
            if (!visited.contains(node)) {
                List<String> component = dfsIterative(node, visited);
                allComponents.add(component);
            }
        }
        return allComponents;
    }

    public static void main(String[] args) {
        iter obj = new iter();
        obj.connectRooms("A", "B");
        obj.connectRooms("A", "C");
        obj.connectRooms("B", "D");
        obj.connectRooms("B", "E");
        obj.connectRooms("C", "F");
        obj.connectRooms("C", "G");

        // Adding a disconnected component
        obj.connectRooms("X", "Y");

        System.out.println("Connected components (recursive):");
        List<List<String>> componentsRec = obj.getAllConnectedComponentsRecursive();
        componentsRec.forEach(component -> System.out.println(component));

        System.out.println("\nConnected components (iterative):");
        List<List<String>> componentsIter = obj.getAllConnectedComponentsIterative();
        componentsIter.forEach(component -> System.out.println(component));
    }
}
