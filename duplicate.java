package strings;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print duplicate characters from a string
		
		String s="Java is a programming language";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==(ch[j])) {
					System.out.print(ch[i]);
					break;
				}
			
			}
			
		}
	}

}
/*
Output:
aa i a rgamngag
*/
