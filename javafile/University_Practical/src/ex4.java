class ex4{
public static void main(String a[]){
	int arr[][]= 	{{2,5,6},
					{8,9,5},
					{4,3,1},
					};
	minmax(arr);
}
static void minmax(int [][]a) {
	int min=100;
	int max=0;
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[0].length; j++) {
			if(a[i][j]<=min) {
				min=a[i][j];
			}
			if(a[i][j]>=max) {
				max=a[i][j];
			}
		}
	}
	System.out.println("Min : " + min);
	System.out.println("Max : " + max);
}
}