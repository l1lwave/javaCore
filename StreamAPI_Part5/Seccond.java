package StreamAPI_Part5;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Seccond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose difficult option: ");
        System.out.println("1) Easy");
        System.out.println("2) Medium");
        System.out.println("3) Hard");
        int choice = sc.nextInt();
        DifficultyLevel difficultyLevel;
        if(choice == 1) {
            difficultyLevel = DifficultyLevel.EASY;
        } else if(choice == 2) {
            difficultyLevel = DifficultyLevel.MEDIUM;
        } else if(choice == 3) {
            difficultyLevel = DifficultyLevel.HARD;
        } else {
            difficultyLevel = null;
            System.out.println("Wrong choice");
            System.exit(0);
        }

        ProgrammingLanguage lang1 = new ProgrammingLanguage ("Haskell", DifficultyLevel. HARD);
        ProgrammingLanguage lang2 = new ProgrammingLanguage ("Python", DifficultyLevel.EASY) ;
        ProgrammingLanguage lang3 = new ProgrammingLanguage ("Java", DifficultyLevel.MEDIUM) ;
        ProgrammingLanguage lang4 = new ProgrammingLanguage ("C++", DifficultyLevel. HARD);
        ProgrammingLanguage lang5 = new ProgrammingLanguage("JS", DifficultyLevel.EASY);

        List<ProgrammingLanguage> languages = List.of(lang1, lang2, lang3, lang4, lang5);

        Stream<ProgrammingLanguage> stream = languages.stream()
                .filter(lang -> lang.getComplexity() == difficultyLevel);
        Optional<ProgrammingLanguage> optional = stream.findFirst();

        System.out.println(optional.get());

    }
}

enum DifficultyLevel {
    EASY, MEDIUM, HARD;
}

class ProgrammingLanguage {
    private String name;
    private DifficultyLevel complexity;

    public ProgrammingLanguage(String name, DifficultyLevel complexity) {
        super();
        this.name = name;
        this.complexity = complexity;
    }

    public String getName() {
        return name;
    }

    public DifficultyLevel getComplexity() {
        return complexity;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage [name=" + name + ", complexity=" + complexity + "]";
    }
}
