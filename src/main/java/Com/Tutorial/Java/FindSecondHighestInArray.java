package Com.Tutorial.Java;

public class FindSecondHighestInArray {

	public static void main(String[] args) {

		int[] a = {10,90,95,97,96,10,101,1};
		
//		a[i] | largest secondlargest
//		a[i] | 		   secondlargest
		
		int largest = 0;
		int secondlargest=0;
		
		for(int i=0; i<a.length;i++) {
			if(a[i]>largest) {
			secondlargest=largest;
			largest=a[i];
				
			}
			else if(a[i]>secondlargest){
			secondlargest=a[i];
			}
		}
		
		System.out.println("largest: "+largest);
		System.out.println("secondlargest: "+secondlargest);
		
		
	}

}
