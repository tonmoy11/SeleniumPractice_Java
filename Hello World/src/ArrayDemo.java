import java.util.*;
public class ArrayDemo {
 public static void main(String[] args) {
	
int[]myIntArray1;

myIntArray1 = new int [10];

myIntArray1[0] =100;
myIntArray1[1] = 20;

System.out.println("0st index is:" + myIntArray1[0]);
System.out.println("1st index is:" + myIntArray1[1]);
System.out.println("2nd index is:" + myIntArray1[2]);

String[] myStringArray1 = {"bmw", "Audi", "toyota", "hyundai"};

System.out.println("0 index is:" + myStringArray1[0]);
System.out.println("1st index is:" + myStringArray1[1]);
System.out.println("2nd index is:" + myStringArray1[2]);
System.out.println("3rd index is:" + myStringArray1[3]);


int len1 = myIntArray1.length;
int len2 = myStringArray1.length;

System.out.println("int array length:" + len1 +"----"+  "String array length:"+ len2);
 
Arrays.sort(myIntArray1);

for (int i=0; i< len1; i++){
	System.out.println(myIntArray1[i]);
	
}

 
 }
}
