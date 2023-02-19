package one.javaprojects;

import java.util.*;

@FunctionalInterface
interface MyInterface {
   int add(int x, int y);
}


MyInterface add = new MyInterface(){
    public int add(int a, int b){
    return a + b ;
    }

   int result = add.apply(3,4);

 }


    




