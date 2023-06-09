package src.ProgrammersSchool.CodingTest;

public class ExamTest {
    public static void main(String[] args) {
        int num1 = 32;
        int num2 = 48;
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
            System.out.println("n1 : " + num1 + " n2 : " + num2 + " t : " + temp);
        }

    }
}
