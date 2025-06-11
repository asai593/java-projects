package xyz;


public class bubblesort {
    public static void main(String[] args) {
        String input = "bubble";
        char[] chars = input.toCharArray();

        // Bubble sort logic
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    // Swap characters
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        String sorted = new String(chars);
        System.out.println("Sorted string: " + sorted);
    }
}
