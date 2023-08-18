
public class StringJoiner {
public static void main(String[] args) {
	String str1="Hello, ";
	String str2 ="world";
	String res = joinStrings(str1,str2);
	System.out.println(res);
}

public static String joinStrings(String str1, String str2) {
	return str1+str2;
}
}
