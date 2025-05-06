package LambdaExpre;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface  
interface Drawable{  
    public void draw();  
}  


public class LambdaImpl {

	public static void main(String[] args) {  
        int width=10;
          
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };
        d2.draw();
        
        List<Integer> list = Arrays.asList(43,65,67,6);
        int sum = list.stream().reduce(0,(x,y) -> x*y);
        System.out.println("sum = "+sum);
        
        

        List<Integer> list2 = Arrays.asList(43, 66, 67, 42, 10, 100);
//        int sum = list.stream().map(x -> x.);
//        System.out.println("sum = "+sum);
    }
}
