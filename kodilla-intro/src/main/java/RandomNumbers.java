import java.util.Random;

public class RandomNumbers {
    int min;
    int max;

    public void getRandom() {
        Random random = new Random();
        int sum = 0;
        int max = 5000;
        int first = random.nextInt(30);
        this.min = first;
        this.max = first;
        sum = sum +first;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;

            if (temp < this.min) {
                this.min = temp;
            }
            if (temp>this.max){
                this.max = temp;
            }
            System.out.println("min: " +this.min);
            System.out.println("max: " +this.max);
            System.out.println("randomNumber: "+ temp);
        }


    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

}
