
import java.util.Arrays;
import java.util.Scanner;

public class LenearSearchAlgo {
	public static void main(String[] args) {
		int a[]= {2,3,5,1,19,32,23,17};
		System.out.println("before sort");
		for(int show:a) {
			System.out.println(show);
		}
		Arrays.sort(a);
		System.out.println("after sorting");
		for(int show:a) {
			System.out.println(show);
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ele to search");
		int ele=sc.nextInt();
		int flag=0;
		int i=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==ele) {
				flag=1;
				break;
			}
			else {
				flag=0;
				
			}
			
		}
			if(flag==1) {
				System.out.println("element is found at the location "+(i+1));
			}
			else {
				System.out.println("element not found");
			}
		
	}

}
