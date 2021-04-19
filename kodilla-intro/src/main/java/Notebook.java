public class Notebook {
    int year;
    int price;
    int weight;

    public Notebook(int year, int price, int weight) {
        this.year = year;
        this.price = price;
        this.weight = weight;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if ( this.price <= 1000) {
            System.out.println("The price is very good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkYearPrice() {
        if (this.price >= 1000 && this.year > 2018) {
            System.out.println("Notebook is a new device");
        } else if (this.price > 500 && this.price < 1000 && this.year > 2015 && this.year <= 2018) {
            System.out.println("Notebook is a good device");
        } else {
            System.out.println("Notebook is a old device");
        }
    }

    public void checkWeight() {
        if (this.weight <= 500) {
            System.out.println("The notebook is light");
        } else if (this.weight < 1000) {
            System.out.println("notebook not too heavy");
        } else {
            System.out.println("very heavy notebook");
        }
    }

}
