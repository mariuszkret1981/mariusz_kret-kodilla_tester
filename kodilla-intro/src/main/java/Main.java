public class Main {

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(7);
        grades.add(8);


        int lastGrade = grades.getLastGrade();
        System.out.println(lastGrade);
        grades.add(15);
        grades.add(133);
        System.out.println(grades.getLastGrade());
        System.out.println(grades.getAverage());

        grades.add(3);
        grades.add(3);
        grades.add(3);
        grades.add(3);
        grades.add(3);
        grades.add(3);
        grades.add(7);
        System.out.println(grades.getLastGrade());




    }


}