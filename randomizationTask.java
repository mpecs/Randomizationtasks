public class randomizationTask {

    static void task1(){

        //30 random words with a random length (nested loop of length and letters)

        String Final = "";
         
        int k = (int) (Math.random() * 10);
        System.out.println(k);

        for (int i = 0; i < k; i++ ){ //randomize length of the word
            char randomChar = (char) + ((int) ((Math.random() * 25) + 97));
            
        Final = Final + randomChar;
    }
    System.out.println(Final);
}

    static void task2(){

        // calculate occurence of 1s and 0s, out of 1000 numbers

        double occur = 0;

        for (int i = 0; i < 1000; i++){
            int a = (int) (Math.random() + 0.5);
            if (a == 1){
                occur += 1;
            }       
        }

        System.out.println("The percentage of 1's in a 1000 number sequence is " + (occur/1000)*100  + "%");

        

    }

    static void task3(){

        String space = " ";

        for (int i = 1; i < 10; i++){
            int random = (int) (Math.random() * 10);

            System.out.println(space.repeat(random) + "*");
            try {
                Thread.sleep(1000);// time is in ms (1000 ms = 1 second)
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
        }
    }
    public static void main (String []args){
        task3();
    }


}