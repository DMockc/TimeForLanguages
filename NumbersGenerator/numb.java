package NumbersGenerator;
public class numb {

    public static void main(String[] args){
        long start = System.currentTimeMillis(); //Starts time
        int count = 0;
        while (count < 100000){
            count++;
            System.out.println(count);
        }
        long end = System.currentTimeMillis(); //Ends time
        double time = (end-start)/1000; //Divide time by 1000 (ms)
        System.out.println("\nCurrent time: " + time + " seconds.");
    }
}
