class student
{
	public String ID;
	private String courseIds[] = {"CSC101S3","CSC102S2"};
	private String examType[] = {"ICA1", "ICA2", "EC"};
	private double marks [][] = new double[2][3];
	private String grade;

	public student(String id)
	{
		ID=id;
	}
	public int getIndex(String [] arr, String ele){
		int ind =-1;
		for(int i=0; i<arr.length; i++){
			if(arr[i].equals(ele))
			{
				ind = i;
			}
		}
			if(ind==-1){
				System.out.println("Error");
				System.exit(0);
			}
			return ind;


	}

	public void setMarks(String cid, String exType, double m)
	{
		int ind_c=getIndex(courseIds, cid);
		int ind_e=getIndex(examType, exType);
		marks[ind_c][ind_e]=m;
	}

	public double fMark(String course) {
		double sum=0;
		for(int i=0; i<examType.length; i++) {
			if(i<=1) {
			sum=sum+(0.15)*marks[getIndex(courseIds, course)][i];
			}
			else {
				sum=sum+(0.7)*marks[getIndex(courseIds, course)][i];
			}
		}

		return Math.round(sum);
	}
	public void grade(double d) {
		if(d<45) 		{grade="F";}
		else if(d<55) 	{grade="S";}
		else if(d<65) 	{grade="C";}
		else if(d<75) 	{grade="B";}
		else if(d<100) 	{grade="A";}
		else 			{grade="Error";}

	}


	public void print()
	{
		System.out.print(ID+"\t");
		for(int i=0; i<courseIds.length; i++){
			System.out.print("\n\t\t"+courseIds[i] + "\t");
			for(int j=0; j<examType.length; j++){
				System.out.print(marks[i][j] + "\t");
				if(j==examType.length-1){
					System.out.print(fMark(courseIds[i]));
					grade(fMark(courseIds[i]));
					System.out.print("\t\t    "+grade);
				}

			}



		}
		System.out.println("\n\n");
	}


}

class ArrayMarks
{
	static void print(student[] s)
	{
		for(int i=0; i<s.length; i++)
			s[i].print();
	}
	public static void main(String [] args)
	{
		student students[] = new student[2];

		students[0]=new student(" 2018/CSC/001");
		students[0].setMarks("CSC101S3","ICA1",34);
		students[0].setMarks("CSC101S3","ICA2",56);
		students[0].setMarks("CSC101S3","EC",67);
		students[0].setMarks("CSC102S2","ICA1",34);
		students[0].setMarks("CSC102S2","ICA2",56);
		students[0].setMarks("CSC102S2","EC",67);



		students[1]=new student(" 2018/CSC/002");
		students[1].setMarks("CSC101S3","ICA1",57);
		students[1].setMarks("CSC101S3","ICA2",78);
		students[1].setMarks("CSC101S3","EC",80);
		students[1].setMarks("CSC102S2","ICA1",34);
		students[1].setMarks("CSC102S2","ICA2",56);
		students[1].setMarks("CSC102S2","EC",67);



		System.out.print(" RegNo\t\t" + "Course\t\t" + "ICA1\t " + "ICA2\t " + "EC\t" + "Final Marks\t" + "Final Grade"+ "\n");
		System.out.println("=====================================================================================================");
		print(students);



	}

}
