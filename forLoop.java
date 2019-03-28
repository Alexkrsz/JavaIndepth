public class forLoop {
	public static void main(String [] args) {
		int []iArray = {0,1,2,3,4,5,6,7,8};
			for (int i=0, j = iArray.length-1, middle= iArray.length >>> 1; i < middle; i++,j--) {  // Shift right is same as division by two
					int temp;
					temp = iArray[i];
					iArray[i] = iArray[j];
					iArray[j] = temp;
			}
			
			/*for (int i=0, j = iArray.length-1, middle= iArray.length/2; i < middle; i++,j--) {  // if the computation is long bettter to use this way for optimization than divideb by 2
					int temp;
					temp = iArray[i];
					iArray[i] = iArray[j];
					iArray[j] = temp;
			}*/
			
			
			System.out.println("The Reverse order by spwaping the 1st and last vise versa is: " );

			for (int i=0;i<=iArray.length-1;i++) {
			System.out.print(iArray[i] + " " );
			}
			
			int dice1 [] = new int [] {1,2,3,4,5,6};
			int dice2 [] = new int [] {1,2,3,4,5,6};
			
			System.out.println();
			
			for (int i=0, j = 0; i < dice1.length && j < dice2.length; i++,j++) { 
				//System.out.println(i + " " + j);
				//System.out.println(dice1[i] + " " + dice2[j]);
			}
			
			for (int k : dice1) {
				for(int m : dice2){
					System.out.println(k + " " + m);
				}
				
			}
					
			
			
	}
}