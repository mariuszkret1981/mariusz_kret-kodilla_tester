public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(500);
        System.out.println( notebook.price);
        notebook.chekPrice();


        Notebook notebook1 = new Notebook( 700);
        System.out.println(notebook1.price);
        notebook1.chekPrice();



        Notebook notebook2 = new Notebook(2000);
        System.out.println( notebook2.price);
        notebook2.chekPrice();



        if (notebook.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (notebook.price > 600 && notebook.price < 1000) {
            System.out.println("The price is very good");
        } else {
            System.out.println("This notebook is expensive");
        }


        }

    }

