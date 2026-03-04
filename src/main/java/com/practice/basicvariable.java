package com.practice;

public class basicvariable {
              public static void main(String[] args){
             int x = 45;
             int y = 50;
             int Sum = x+y;
            System.out.println("Sum is "+ Sum);                 //sum 95 (first line will be print)
                        

            System.out.println("Call that parent Method");    // print this line (second line)
            basicvariable1 m = new basicvariable1 ();        //classobject.methodname 
            //m.validateHeader();
            System.out.println(2);                          //print this sting value on 3rd line
            System.out.println(m.validateHeader());         //call the child methods values from here;
             }
}