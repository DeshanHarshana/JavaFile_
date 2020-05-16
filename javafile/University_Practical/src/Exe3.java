class Exe3{
	public static void main(String a[]){
		int arr[]={2,4,5,7,8};
		
		int arr3[][][]={{{1,2},{3,4}},{{5,6},{7,8}},{{1,2},{3,15}}};
		System.out.println("Size "+arr2.length);
		
		test3(arr3,15);
		
	}
	static void test3(int [][][] a, int value){
		int x=0;
		int y=0;
		int z=0;
		System.out.println(a.length);//thala gaana
		System.out.println(a[0].length);//row gaana
		System.out.println(a[0][0].length);//colomn gana
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				for(int k=0; k<a[0][0].length; k++) {
					if(a[i][j][k]==value){
					x=i;
					y=j;
					z=k;
					}
				}
			}
			
		}
		System.out.println(x + " : " + y + " : " + z);
	}
	static int test1(int [] a, int value){
		int x=0;
		for(int i=0; i<a.length; i++){
			if(a[i]==value){
				x=i;
			}
		}
		return x;
	}
}