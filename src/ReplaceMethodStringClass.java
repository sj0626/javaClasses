
public class ReplaceMethodStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* .replacxce()
		 * this method returns anew string resulting
		 * from replacing all occurrences of oldChar
		 * in this string with newChar
		 */
 String str="Hello Dear Dan, how are you Dan?";
 System.out.println((str.replace('e', 'z')));
 System.out.println( str.replace("Dear","Respected"));
 System.out.println(str.replace("Dan", "Ben"));
 System.out.println(str.replaceFirst("Dan" ,"Ben"));
 System.out.println(str.replaceAll("Dan" ,"Ben"));
 // regex means regular expression it is combination of weird characters
	}

}
