package Com.Tutorial.Java;

public class FindDuplicateString {

	public static void main(String[] args) {
		
		String s1 ="Sakkeektt";
		
		char[] c1= s1.toCharArray();
		boolean[] visited = new boolean[c1.length];
		
		for(int i=0; i<c1.length;i++) {
			
			int count=1;
			
			if(visited[i]) continue;

		for(int j=i+1; j<c1.length;j++) {
			if(c1[i]==c1[j]) {
				count++;	
				visited[j]=true;
			}
		}
		
		if(count>1) {
		System.out.println(c1[i]+"="+count);
		}
		}
	}
}
