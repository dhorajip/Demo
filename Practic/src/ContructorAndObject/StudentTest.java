package ContructorAndObject;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Parth", 95,85,75);
		Student s2 = new Student("Pathik", 94,84,74);
		Student s3 = new Student("Piyush", 93,83,73);
		Student s4 = new Student("Jaydeep", 92,82,72);
		Student s5 = new Student("Sujay", 91,81,71);
		
		// Code for Maximum marks in English
		
		
		Student[] s = {s1,s2,s3,s4,s5};
		int MaxEnglishscore = 0;
		Student MaxEnglishscoreStudent = null;
		for(Student a : s) {
			if(MaxEnglishscore < a.Englishscore) {
				MaxEnglishscore = a.Englishscore;
				MaxEnglishscoreStudent = a;
			}
		}
		
		System.out.println("Maximum Score in English: ");
		System.out.println(MaxEnglishscoreStudent.name + " scored " + MaxEnglishscoreStudent.Englishscore + " marks which is maximum in English");
		//System.out.println(MaxEnglishscoreStudent.Englishscore + " is the maximum marks in English");
		System.out.println("-----------------------------------------------");
		
		//Code for Total score
		
		int Totalscore = 0;
		for(Student a : s) {
				Totalscore = Totalscore  + (a.Englishscore + a.Mathscore + a.Sciencescore);			
		}
		System.out.println(Totalscore + " is the Totalscore of all the students");
		System.out.println("----------------------------------------------------");
	
		//Code for First and Last rank
		//Student[] s = {s1,s2,s3,s4,s5};
		int maxmarks = 0, subtotal = 0;
		Student d = null;
		for(Student b: s) {
			subtotal = (b.Englishscore + b.Mathscore + b.Sciencescore);
			if(subtotal > maxmarks ) {
				maxmarks = subtotal;
				d = b;
			} 
		}
		System.out.println(maxmarks + " is the highest total amongst all.");
		System.out.println(d.name + " has scored the highgest marks and scored 1st rank.");
		System.out.println("--------------------------------------------------------------");
		{
		int leastmarks = 10000;
		Student e = null;
		for(Student b: s) {
			subtotal = (b.Englishscore + b.Mathscore + b.Sciencescore);
			if (leastmarks > subtotal){
			leastmarks = subtotal;
			e=b;
			}
		}
		
		System.out.println(leastmarks + " is the lowest total amongst all.");
		System.out.println(e.name + " has scored the lowest marks and scored 5th rank.");
		}	
	}
}
