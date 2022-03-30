//Print Alternate element of an array.

/*
public class AlternativeElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for (int i=0; i<=arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
*/

/*
public class AlternativeElement {
    public static void main(String[] args) {
        int aa[]={1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<= aa.length; i=i+3){
            System.out.println(aa[i]);
        }
    }
}
*/


//Print alternative element of an array by user input

/*
import java.util.Scanner;

public class AlternativeElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your array size");
        int size= s.nextInt();
        int arr[]=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=s.nextInt();
        }
        for (int i=0; i<arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}*/

/*
class Aa{
    public void findAE(){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<=arr.length; i=i+3){
            System.out.println(arr[i]);
        }
    }
}
public class AlternativeElement {
    public static void main(String[] args) {
        Aa obj=new Aa();
        obj.findAE();
    }
}
*/