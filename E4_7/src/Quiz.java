import java.util.Random;

public class Quiz implements QuizInterface {

	private int numberQuestion;
	@Override
	public void createQuiz(int numberQuestion) {
		// TODO Auto-generated method stub
		this.setNumberQuestion(numberQuestion);
		Random rand = new Random();
		for (int i =0; i < this.numberQuestion; i++) {
			leftNumber.add( rand.nextInt(100));
			rightNumber.add( rand.nextInt(100));
		}
		
	}

	@Override
	public int gradeQuiz() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void administerQuiz() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.numberQuestion; i++) {
			
		}
	}

	public int getNumberQuestion() {
		return numberQuestion;
	}

	public void setNumberQuestion(int numberQuestion) {
		this.numberQuestion = numberQuestion;
	}

}
