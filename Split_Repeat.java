package array_concepts;

import java.util.Arrays;

public class Split_Repeat {
	public static void main(String[] args) {
		
		String s1= "manish kumar";
			String s2=	s1.replace('m', 'D');
			System.out.println(s2);
			
			String s5 = "I am a boy";
			
			String s3[] = s5.split(" ",3);
			System.out.println(Arrays.toString(s3));
	}

}
