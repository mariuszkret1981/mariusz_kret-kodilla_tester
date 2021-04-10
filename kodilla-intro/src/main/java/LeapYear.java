public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        int firstNumber = 4;
        int secondNumber = 100;
        int threeNumber = 400;
        System.out.println(year);
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(threeNumber);



        if (year % firstNumber == 0 && year % secondNumber == 0 && year % threeNumber == 0) {
            System.out.println("Rok jest przestepny");

        }else {
            System.out.println(" rok nie jest przestepny");

        }

    }

}












