
  public class Notebook {
      int weight;

      public Notebook(int weight) {
          this.weight = weight;
      }

          public void chekweight(){
              if (this.weight < 500) {
                  System.out.println("The notebook is light");
              } else if (this.weight > 500 && this.weight < 1000) {
                  System.out.println("notebook not too heavy");
              } else {
                  System.out.println("very heavy notebook");
              }
          }

      }
