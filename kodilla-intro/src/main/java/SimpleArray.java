public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "Pies";
        animals[1] =  "Kot";
        animals[2] = "Koń";
        animals[3] = "kogut";
        animals[4] = "żyrafa";

        System.out.println(animals.length);
        System.out.println(animals[3]);
        System.out.println(" Moja tablica zawiera 5 elementów ");

        for (int i=0; i< animals.length; i++){
            System.out.println("i");
        }
    }
}
