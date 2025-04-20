/* sum of all odd and even n no

import java.util.*;
class fifth{

    public static void main(String[] args){

int n, sum=0;

System.out.println(" enter the no of term");
 
Scanner Sc = new Scanner(System.in);
n= Sc.nextInt();
 sum= 0;

for(int i=1; i<=n; i++){
    if (i%21==0)
    sum = sum + i;
}

System.out.println(" sum of all odd number from 1 to "+n+" is "+sum);



}}
*/