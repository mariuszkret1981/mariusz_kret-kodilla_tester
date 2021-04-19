public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(2020, 1200, 400);
        System.out.println(notebook.year);
        System.out.println(notebook.price);
        notebook.checkYearPrice();
        notebook.checkWeight();
        notebook.checkPrice();


        Notebook notebook1 = new Notebook(216, 600, 600);
        System.out.println(notebook1.year);
        System.out.println(notebook1.price);
        notebook1.checkYearPrice();
        notebook1.checkWeight();
        notebook1.checkPrice();

        Notebook notebook2 = new Notebook(2016, 550, 1100);
        System.out.println(notebook2.year);
        System.out.println(notebook2.price);
        notebook2.checkYearPrice();
        notebook2.checkWeight();
        notebook2.checkPrice();


    }


}










