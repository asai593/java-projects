package xyz;

public class reversesring {
	  public static void main(String[] args) {
	        String input = "arun";
	        String[] words = input.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            
	            String reversedWord = new StringBuilder(word).reverse().toString();
	            result.append(reversedWord).append(" ");
	        }

	        
	        System.out.println("Reversed words: " + result.toString().trim());
	    }
	}

