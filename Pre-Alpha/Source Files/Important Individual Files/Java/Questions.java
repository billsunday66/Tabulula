package comp433.tabulula;

import java.util.Random;
import java.util.Arrays;

//        Random random = new Random();
//                int rnd = random.nextInt(21);

public class Questions {

//    private Random random = new Random();

    private String questionList [] = {

            "What declension does 'ab' take?",
            "What is the 3rd person singular active indicative conjugation of 'esse'?",
            "What declension does 'ad' take?",
            "What declension does 'ante' take?",
            "What word means 'finally'?",
            "What declension does 'apud' take?",
            "What declension does 'contra' take?",
            "What declension does 'de' take?",
            "When should you use 'igitur'?",
            "What declension does 'erga' take?",
            "What declension does 'ex' take?",
            "What declension does 'in' take, when the meaning is 'in or on'?",
            "If you are a 'quondam' student, what does that likely mean to you?",
            "What declension does 'in' take, when the meaning is 'into, toward, or against'?",
            "What declension does 'inter' take?",
            "What declension does 'per' take?",
            "What declension does 'post' take?",
            "What declension does 'prae' take?",
            "What does 'ut' indicate?",
            "What declension does 'praeter' take?",
            "What declension does 'propter' take?",
            "What declension does 'pro' take?",
            "What declension does 'sine' take?",
            "What declension does 'sub' take?",
            "Complete the missing section of this sentence: 'Carthago dele___ est",
            "What declension does 'trans' take?",
            "What declension does 'ultra' take?",
            "What declension does 'vae' take?",

    };

    private String choiceList [][] = {

            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Es", "Est", "Sumus", "Estis", "Sunt"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Postremium", "Quondam", "Unde", "Primo", "Postea"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"At the end of a sentence", "At the beginning of a sentence", "Only in the vocative case", "With cheese", "Never"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"You are an upperclassman", "You have graduated", "You are currently a Latin student", "You like studying", "You are a dinosaur"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Sunjunction", "Induction", "Deduction", "A dinsoaur", "Either/or"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"-ndens", "-ndo", "nda", "ndus", "ndomini"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},
            {"Nominative", "Genitive", "Dative", "Ablative", "Accusative"},

    };

    private String correctAnswer [] = {"Ablative", "Est", "Accusative", "Accusative", "Postremium", "Accusative", "Accusative",
            "Ablative", "At the beginning of a sentence", "Accusative", "Ablative", "Ablative", "You have graduated", "Accusative",
            "Accusative", "Accusative", "Accusative", "Ablative", "Subjunction", "Accusative",
            "Accusative", "Ablative", "Ablative", "Ablative", "-nda", "Accusative",
            "Accusative", "Dative",};

    public String getQuestion(int a) {

        String question = questionList[a];
        return question;

    }

    public String getChoice1(int a) {

        String choice0 = choiceList[a][0];
        return choice0;

    }

    public String getChoice2(int a) {

        String choice1 = choiceList[a][1];
        return choice1;

    }

    public String getChoice3(int a) {

        String choice2 = choiceList[a][2];
        return choice2;

    }

    public String getChoice4(int a) {

        String choice3 = choiceList[a][3];
        return choice3;

    }

    public String getChoice5(int a) {

        String choice4 = choiceList[a][4];
        return choice4;

    }

    public String getChoice6(int a) {

        String choice5 = choiceList[a][5];
        return choice5;

    }

    public String getChoice7(int a) {

        String choice6 = choiceList[a][6];
        return choice6;

    }

    public String getChoice8(int a) {

        String choice7 = choiceList[a][7];
        return choice7;

    }

    public String getChoice9(int a) {

        String choice8 = choiceList[a][8];
        return choice8;

    }

    public String getChoice10(int a) {

        String choice9 = choiceList[a][9];
        return choice9;

    }

    public String getChoice11(int a) {

        String choice10 = choiceList[a][10];
        return choice10;

    }

    public String getChoice12(int a) {

        String choice11 = choiceList[a][11];
        return choice11;

    }

    public String getChoice13(int a) {

        String choice12 = choiceList[a][12];
        return choice12;

    }

    public String getChoice14(int a) {

        String choice13 = choiceList[a][13];
        return choice13;

    }

    public String getChoice15(int a) {

        String choice14 = choiceList[a][14];
        return choice14;

    }

    public String getChoice16(int a) {

        String choice15 = choiceList[a][15];
        return choice15;

    }

    public String getChoice17(int a) {

        String choice16 = choiceList[a][16];
        return choice16;

    }

    public String getChoice18(int a) {

        String choice17 = choiceList[a][17];
        return choice17;

    }

    public String getChoice19(int a) {

        String choice18 = choiceList[a][18];
        return choice18;

    }

    public String getChoice20(int a) {

        String choice19 = choiceList[a][19];
        return choice19;

    }

    public String getChoice21(int a) {

        String choice20 = choiceList[a][20];
        return choice20;

    }

    public String getChoice22(int a) {

        String choice21 = choiceList[a][21];
        return choice21;

    }

    public String getChoice23(int a) {

        String choice21 = choiceList[a][22];
        return choice21;

    }

    public String getChoice24(int a) {

        String choice21 = choiceList[a][23];
        return choice21;

    }

    public String getChoice25(int a) {

        String choice21 = choiceList[a][24];
        return choice21;

    }

    public String getChoice26(int a) {

        String choice21 = choiceList[a][25];
        return choice21;

    }

    public String getChoice27(int a) {

        String choice21 = choiceList[a][26];
        return choice21;

    }

    public String getCorrect(int a) {
        String answer = correctAnswer[a];
        return answer;

    }

}
