package org.example;


public class App 
{
    public static void main( String[] args )
    {

        Furniture compChair = new Chair(2019, 978.30);
        Furniture compChair2  = new Chair(2019, 978.30);

       Furniture pianoChair1 = new PianoChair(2020, 789, 45);
       Furniture pianoChair2 = new PianoChair(2020, 789, 45);


        System.out.println("******************************************");
        System.out.println("The are furniture's:");

        System.out.println(compChair);
        System.out.println(compChair2);
        System.out.println(pianoChair1);
        System.out.println(pianoChair2);

        System.out.println("******************************************");

    }
}
