using System;

public class numb{

    public static void Main(){
        DateTime start = DateTime.Now;
        int count = 0;
        while(count<=100000){
            Console.WriteLine(count);
            count++;
        }
        DateTime end = DateTime.Now;
        TimeSpan time = end - start;
        Console.WriteLine("Current time: " + time + " secods.");
    }
    
}
