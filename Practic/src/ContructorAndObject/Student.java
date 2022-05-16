package ContructorAndObject;

public class Student {
	String name;
	int Mathscore;
	int Englishscore;
	int Sciencescore;
	
	public Student(String name, int mathscore, int englishscore, int sciencescore) {
		this.name = name;
		Mathscore = mathscore;
		Englishscore = englishscore;
		Sciencescore = sciencescore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Mathscore=" + Mathscore + ", Englishscore=" + Englishscore
				+ ", Sciencescore=" + Sciencescore + "]";
	}
	
	
	
}
