
public class Schedule 
{
	public static void main(String[] args)
	{
		MAT mat = new MAT("Mathematical Structures", 21640, "Seidenberg", "MAT 113 taught by R. Nemes");
		JPN jpn = new JPN("Elementary Japanese II", 21286, "Dyson", "JPN 102 taught by M. Sakura");
		CIS cis = new CIS("Computer Programming II", 20131, "Seidenberg", "CIS 122 taught by T. Brooks");
		AOK aok1 = new AOK("Intro to Anthropology", 23643, "Dyson", "ANT 101 taught by J. Pajo");
		AOK aok2 = new AOK("Euro History", 22287, "Dyson", "HIS 206 taught by M. Antoniou");
		
		System.out.println(mat);
		System.out.println();
		System.out.println(jpn);
		System.out.println();
		System.out.println(cis);
		System.out.println();
		System.out.println(aok1);
		System.out.println();
		System.out.println(aok2);
	}
}
