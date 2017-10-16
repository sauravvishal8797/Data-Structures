package graphs;
import java.util.Scanner;
public class Graphs {
	Scanner sc = new Scanner(System.in);
	int a[] = new int[10];
	int b[]= new int[10];
	void matrix (int v, int e){
		int i,j;
		for(i= 1; i<=e;i++){
			a[i] = sc.nextInt();
			b[i]= sc.nextInt();
		}
		int arr[][] = new int[10][10];
		i= 1;
		while(i<=e){
			arr[a[i]][b[i]]= 1;
			i++;
		}
		System.out.println("Adjacency Matrix is");
		for(i =1;i<=v;i++){
			for(j =1; j<=v; j++){
				System.out.print(arr[i][j]+" ");
			}
			
		System.out.println();
	}}
	/*void BFS(int v, int e){
		int i;
		int mat[] = new int[15];
		for(i=1;i<=e;i++){
			mat = 
			
		}
	}*/
}
