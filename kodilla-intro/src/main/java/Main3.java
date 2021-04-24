public class Main3 {

    public static void main(String[] args) {
         User user= new User ("Krzysztof", 40);
         User user1 = new User("Lars", 28);
         User user2 = new User("Mariusz", 39);
         User user3 = new User("Patryk", 33);
         User user4 = new User("Stefan", 29);

         User[] users= {user,user1,user2,user3,user4};
         int sum =0;
         for (int i =0; i<users.length; i++){
             sum = sum + users[i].getAge();

        }
        double average = sum / users.length;
        System.out.println(average);
         for (int i = 0; i< users.length; i++){

             if (users[i].getAge()<average){
                 System.out.println( users[i].getName());
             }

         }

    }







}

