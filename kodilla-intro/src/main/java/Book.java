 public class Book{

    private String tytul;
    private String autor;

     public String getTytul(){
         return tytul;
     }


     public void setTytul(String tytul){
         this.tytul= tytul;
     }



    public void displayTytul(){
         System.out.println("Tytuł książki:" + tytul);
     }


     public String getAutor(){

         return autor;
     }

     public void setAutor(String autor){

         this.autor= autor;
     }


      public void displayAuthor(){

         System.out.println("Autor książki:" + autor);
       }
}

