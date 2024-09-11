import java.util.*;
public class assign7_6 {
    
public static void main(String[] args) {
int[] a= {1,2,3,5,6,7,8,9,10,11};
int sum=0;
//int m=a.length;
int n=a.length+1;
int sumn=n*(n+1)/2;
for(int i=0;i<a.length;i++) {
	sum+=a[i];
}
System.out.println("missing num is "+(sumn-sum));
	}

}

