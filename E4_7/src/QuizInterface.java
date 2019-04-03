import java.util.ArrayList;

public interface QuizInterface {
	public ArrayList<Integer> userAnswers = new ArrayList<Integer>();
	public ArrayList<Integer> leftNumber = new ArrayList<Integer>();
	public ArrayList<Integer> rightNumber = new ArrayList<Integer>(); 
	
	public void createQuiz(int numberQuestion);
	public int gradeQuiz();
	public void administerQuiz();
}
