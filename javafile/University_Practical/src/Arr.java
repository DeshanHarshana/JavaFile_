class Arr extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
    ht(3); 
  }  
 }  
 public static void main(String args[]){  
  Arr t1=new Arr();
 
   
  t1.start();  
  
 }  
 static void ht(int N) {
	// set output size
			

			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= 4 * N; j++) {
					double d1 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - N, 2));
					double d2 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - 3 * N, 2));

					if (d1 < N + 0.5 || d2 < N + 0.5) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
				System.out.print(System.lineSeparator());
			}

			for (int i = 1; i < 2 * N; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(' ');
				}

				for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
					System.out.print('*');
				}

				System.out.print(System.lineSeparator());
			}
		}
	}
 