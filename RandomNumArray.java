import java.util.Random;
public class RandomNumArray
{  
    public static void main(String args[]){
        Random r = new Random();
        int array [] = new int[10];
        if(array.length==0)
        System.out.print("not possible");
        for(int d = 0; d <array.length; d++){
            array[d] = r.nextInt(32768) ;
        }  
        int max = array[0];
        System.out.println("Random Array........");
        for( int q = 0; q < array.length; q++ ){
            System.out.println(array[q]);
            if(array[q] > max){
                max =  array[q];
            }
        }
        System.out.println("Maximum Number is: "+ max);
    }
}
