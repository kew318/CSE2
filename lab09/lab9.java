////////////////////////////////////////////////////////////
//Kelly Wu
//March 26, 2015
//lab09
//
// practice the use of methods
// to generate basic random sentences

import java.util.Random;
import java.util.Scanner;

public class lab9 {
    
    public static String Adjectives(int a) {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        String adj = "";
        switch (x) {
            case 0:
                adj = "bored";
                break;
            case 1:
                adj = "happy";
                break;
            case 2:
                adj = "sad";
                break;
            case 3:
                adj = "excited";
                break;
            case 4:
                adj = "lazy";
                break;
            case 5:
                adj = "angry";
                break;
            case 6:
                adj = "fast";
                break;
            case 7:
                adj = "slow";
                break;
            case 8:
                adj = "pretty";
                break;
            case 9:
                adj = "adorable";
                break;
        }
        return adj;
    }
    
    public static String subject(int a) {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        String sub = "";
        switch (x) {
            case 0:
                sub = "snake";
                break;
            case 1:
                sub = "girl";
                break;
            case 2:
                sub = "boy";
                break;
            case 3:
                sub = "dog";
                break;
            case 4:
                sub = "cat";
                break;
            case 5:
                sub = "fox";
                break;
            case 6:
                sub = "rabbit";
                break;
            case 7:
                sub = "tiger";
                break;
            case 8:
                sub = "elephant";
                break;
            case 9:
                sub = "lion";
                break;
        }
        return sub;
    }
    
    public static String verb(int a) {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        String ver = "";
        switch (x) {
            case 0:
                ver = "laughed with";
                break;
            case 1:
                ver = "passed";
                break;
            case 2:
                ver = "smiled at";
                break;
            case 3:
                ver = "talked to";
                break;
            case 4:
                ver = "liked";
                break;
            case 5:
                ver = "ran with";
                break;
            case 6:
                ver = "walked with";
                break;
            case 7:
                ver = "sat with";
                break;
            case 8:
                ver = "spoke with";
                break;
            case 9:
                ver = "hung out with";
                break;
        }
        return ver;
    }
    
    public static String object(int a) {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        String obj = "";
        switch (x) {
            case 0:
                obj = "puppy";
                break;
            case 1:
                obj = "fish";
                break;
            case 2:
                obj = "groundhog";
                break;
            case 3:
                obj = "squirrel";
                break;
            case 4:
                obj = "bear";
                break;
            case 5:
                obj = "deer";
                break;
            case 6:
                obj = "moose";
                break;
            case 7:
                obj = "cow";
                break;
            case 8:
                obj = "pig";
                break;
            case 9:
                obj = "mouse";
                break;
        }
        return obj;
    }
    
    public static void main(String[ ] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        boolean run = true;
        while (run) {
            String a1 = Adjectives(1);
            String a2 = Adjectives(2);
            String a3 = Adjectives(3);
            String s = subject(1);
            String v = verb(1);
            String o = object(1);
            System.out.println("The "+a1+" "+a2+" "
            +s+" "+v+" the "+a3+" "+o+".");
            System.out.print("Generate another sentence?(Y/N) ");
            String answer = scan.next();
            if(answer.equals("Y")) {
                run = true;
            }
            else {
                run = false;
                break;
            }
        }
    }
}