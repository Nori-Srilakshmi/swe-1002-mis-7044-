importjava.util*;
public class NS{
	public static void main (String[] args){
		Scanner sc=newScanner(System.in);
		int n=sc.nextInt();
		int p=n+1;
		int arr[]=newint[p];
		for(int i=0;i<p;i++){
			arr[i]=i;
		}
		int sum=0;
		for(int i=0;i<p;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
	        }
	        }
