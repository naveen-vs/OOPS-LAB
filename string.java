
public class string
{
	public static void main(String args[])
	{
		String s1="sngcee";
		String s2="sngce";
		System.out.println("String is:"+s2);
		int len=s2.length();
		System.out.println("Length: " + len);
		System.out.println();
		
		String s3="college";
		String joinedString = s2.concat(s3);
        System.out.println("Joined String: " + joinedString);
		System.out.println();
		
		int res=s1.compareTo(s2);
        System.out.println("Compared:"+res);
		System.out.println();
		
		String s="bat ball";
		System.out.println("Replaced string:");
		System.out.println(s.replace('b', 'c'));
		System.out.println();
		
		String str = "Learn\nJava Programming\n\n   ";
		System.out.println("Trimmed string:");
		System.out.println(str.trim());
		System.out.println();
		
		String str1 = "Java Programming";
		System.out.println("CharAt:");
        System.out.println(str1.charAt(2));
		System.out.println();
		
		String str2 = "java is fun";
		System.out.println("Substring is:");
 		System.out.println(str2.substring(0, 4));
		System.out.println();


	}
}