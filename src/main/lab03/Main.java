package main.lab03;

public class Main {

    public static void main(String []args) {

        // Set our text
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        // Set an Instance of our Class
        StringTool Test = new StringTool(text);

        System.out.println("The number of sentences: " + Test.getSentences());
        System.out.println("The number of words: " + Test.getWords());
        System.out.println("The number of letters: " + Test.getLetters());
        System.out.println("The number of vowels: " + Test.getVowels());
        System.out.println("The number of consonants: " + Test.getConsonants());
        System.out.println("The most used words: " + Test.getMostUsedWords(5));
    }

}
