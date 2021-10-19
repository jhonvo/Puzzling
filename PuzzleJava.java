import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{
    Random randMachine = new Random();

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 

    public ArrayList <Integer> getTenRolls(){
        ArrayList <Integer> y = new ArrayList <Integer> ();
        for(int i = 0; i < 10; i++){
            int roll = randMachine.nextInt(21);
            y.add(roll);
        } 
        return y;
    }

    // Write a method that will:
    // 1. Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
    // 2. Generate a random index between 0-25, and use it to pull a random letter out of the array.
    // 3. Return the random letter.

        // METHOD TO GENERATE THE ALPHABET - Taken from internet
        // public ArrayList <Character> alphabet(){
        //     ArrayList <Character> y = new ArrayList <Character> ();
        //     for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
        //         {
        //             y.add(ch);
        //         }   
        // }

    public char getRandomLetter(){
        ArrayList <Character> y = new ArrayList <Character> ();
        for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
            {
                y.add(ch);
            }   
        int roll = randMachine.nextInt(26);
        return y.get(roll);
    }

    // Write a method that uses the previous method to create a random string of eight characters, and return that string.

    public String getPassword(){
        String pw = "";
        for (int i = 0; i < 8; i ++){
            pw = pw + getRandomLetter();
        }
        return pw;
    }

    // Write a method that takes an int length as an argument and creates an array of random eight character words. 

    public ArrayList<String> getNewPasswordSet(int number){
        ArrayList <String> y = new ArrayList <String> ();
        for (int i = 0; i < number; i ++){
            String pw = getPassword();
            y.add(pw);
        }
        return y;
    }

    // Write a method that takes an array and and mixes up all the values in a pseudo-random way.  NOT SURE IF THIS IS WORKING APRROPIATELY

    public ArrayList<Integer> shuffleArray(int[] array){
        ArrayList <Integer> y = new ArrayList <Integer> ();
        
        for (int value : array){
            int index = randMachine.nextInt(array.length);
            y.add(array[index]);
        }
        return y;
    }
}