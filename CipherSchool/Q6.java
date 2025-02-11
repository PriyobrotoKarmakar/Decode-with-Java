// package CipherSchool;

/*Write a program that takes a sentence as input and finds the longest word in the sentence. If there are multiple words with the same maximum length, return the first one. Use String class methods and loops to solve the problem.

Input: Coding is a fun challenge.
Ouput: challenge */
public class Q6 {
    public static void main(String[] args) {
        String sentence = "Coding is a fun challenge.";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
    }
}
