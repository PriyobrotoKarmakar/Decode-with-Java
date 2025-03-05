class WordEntry {
    private String word;

    public WordEntry(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        WordEntry wordEntry = (WordEntry) obj;
        return this.word.replaceAll("\\s+", "").equalsIgnoreCase(wordEntry.word.replaceAll("\\s+", ""));
    }
}

class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        WordEntry word1 = new WordEntry(input1);
        WordEntry word2 = new WordEntry(input2);

        if (word1.equals(word2)) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }
}

public class q4 {
    
}
