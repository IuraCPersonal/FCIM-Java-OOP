package main.lab03;

import java.util.*;

public class StringTool {

    public String input;

    // The Constructor Method.
    public StringTool(String input) {
        this.input = input;
    }

    // Return the number of sentences.
    public int getSentences() {
        return input.split("[!?.:]+").length;
    }

    // Return the number of words.
    public int getWords() {
        return input.split("\\s+").length;
    }

    // Return the number of letters.
    public int getLetters() {
        // Initialize count to 0.
        int count = 0;
        // Iterate through every character in the input.
        for (int i = 0; i < input.length(); ++i) {
            // Check if the character at index i is a letter.
            if (Character.isLetter(input.charAt(i))) count++;
        }
        return count;
    }

    // Return the number of vowels.
    public int getVowels() {
        // Transform the input to lowercase.
        String lowerInput = this.input.toLowerCase();
        // Initialize count to 0.
        int count = 0;
        // Iterate through every character in the input.
        for (int i = 0; i < lowerInput.length(); ++i) {
            // Check if the character at index i is 'a', 'e', 'i', 'o', 'u' or 'w'.
            // NOTE: The 'w' and 'y' can sometimes be considered as vowels, but not always.
            // So the answer may vary from the ones given by an online counter.
            if (input.charAt(i) == 'a' ||
                    input.charAt(i) == 'e' ||
                    input.charAt(i) == 'i' ||
                    input.charAt(i) == 'o' ||
                    input.charAt(i) == 'u' ||
                    input.charAt(i) == 'w') {
                count++;
            }
        }
        return count;
    }

    // Return the number of consonants. Letters - vowels :D
    public int getConsonants() {
        return this.getLetters() - this.getVowels();
    }

    // Return an array of n most used words
    public List<String> getMostUsedWords(int nTopWords) {
        // Initialize a map to count the freq of every word.
        Map<String, Integer> map = new HashMap<String, Integer>();
        // Iterate through every word in the input.
        for (String word : this.input.split("\\W+")) {
            // If the word exists, increase its value.
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            // Otherwise, initialize it to 1.
            else {
                map.put(word, 1);
            }
        }

        // Sort the map in descending order.
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        // Get only the keys.
        Set<String> keys = reverseSortedMap.keySet();

        // Convert the keys set in an array
        List<String> keys2 = new ArrayList<>(keys);

        // Return only the first nTopWords elements.
        return keys2.subList(0, nTopWords);
    }
}
