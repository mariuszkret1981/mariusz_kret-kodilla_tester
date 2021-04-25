 public class Book {

     private String tytul;
     private String autor;

     public Book(String tytul, String autor){
         this.tytul = tytul;
         this.autor = autor;
     }


    public static Book of(String tytul,String autor){
        return new Book(tytul, autor);
    }

}


