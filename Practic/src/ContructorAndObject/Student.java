package ContructorAndObject;

public class Student {
	String name;
	int Mathscore;
	int Englishscore;
	int Sciencescore;
	int totalMarks;
	
	public Student(String name, int mathscore, int englishscore, int sciencescore) {
		this.name = name;
		this.Mathscore = mathscore;
		this.Englishscore = englishscore;
		this.Sciencescore = sciencescore;
		this.totalMarks = this.Englishscore + this.Mathscore + this.Sciencescore;
	}

	public int getTotalMarks() {
		return totalMarks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", Mathscore=" + Mathscore + ", Englishscore=" + Englishscore
				+ ", Sciencescore=" + Sciencescore + "]";
	}
		
}
