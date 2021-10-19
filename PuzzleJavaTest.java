public class PuzzleJavaTest {
public static void main(String[] args) {
    PuzzleJava tester = new PuzzleJava();

    System.out.println(tester.getTenRolls()); // getTenRolls
    System.out.println(tester.getRandomLetter()); // getRandomLetter
    System.out.println(tester.getPassword()); // generatePassword
    System.out.println(tester.getNewPasswordSet(4)); // getNewPasswordSet

    int [] array = {-2,-5,-8,-7,-9,-25};

    System.out.println(tester.shuffleArray(array)); // shuffleArray
}

}