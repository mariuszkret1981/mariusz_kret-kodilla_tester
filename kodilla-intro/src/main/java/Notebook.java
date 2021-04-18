
  public class Notebook {
      int price;

      public Notebook(int price) {
          this.price = price;
      }

      public void chekPrice() {
          if (this.price < 600) {
              System.out.println("This notebook is very cheap");
          } else if (this.price > 600 && this.price < 1000) {
              System.out.println("The price is very good");
          } else {
              System.out.println("This notebook is expensive");
          }
      }


  }