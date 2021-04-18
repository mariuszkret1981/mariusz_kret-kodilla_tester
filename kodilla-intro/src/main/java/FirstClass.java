public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(400);
        System.out.println( notebook.weight);
        notebook.chekweight();


        Notebook notebook1 = new Notebook( 700);
        System.out.println(notebook1.weight);
        notebook1.chekweight();



        Notebook notebook2 = new Notebook(2000);
        System.out.println( notebook2.weight);
        notebook2.chekweight();



        if (notebook.weight < 500) {
            System.out.println("The notebook is light");
        } else if (notebook.weight > 600 && notebook.weight < 1000) {
            System.out.println("notebook not too heavy");
        } else {
            System.out.println("very heavy notebook");
        }


        }

    }

