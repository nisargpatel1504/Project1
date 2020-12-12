import java.util.*;

public class App {
	public static void main(String args[])
	{
		
		int choice=0; 
		char quit = 'Y';
		String input;
		Scanner s= new Scanner(System.in);
		while(quit!='N')
		{
		System.out.println("*********************M E N U*******************");
		System.out.println("Choose your interest");
		System.out.println("1. Car");
		System.out.println("2. Science");
		System.out.println("3. Sports");
		System.out.println("4. G.K.");
		System.out.println("Please enter your choice [1-4]: ");
		choice=s.nextInt();
			switch(choice) {		
			case 1:
					String q1="1) What is generally considered to be the first \"pony car\"?\n" + "(a)Ford Mustang \n(b) Camaro ";
					String q2="2) What was the first Japanese car to be produced in the United States?\n" + "(a)HONDA ACCORD  \n(b) TOYOTA CAMRY ";
					String q3="3) What car sold more than one million units in 1965, setting a record that still stands today?\n" + "(a) PONTIAC GTO  \n(b) CHEVROLET Impala";
					String q4="4) What was the first car to break the sound barrier??\n" + "(a) BUGATTI VEYRON  \n(b) ThrustSSC";
					String q5="5) What year was the Corvette first introduced?\n" + "(a) 1953  \n(b) 1943";
					
					
		
					Question [] questions = {
					new Question(q1, "a"),
					new Question(q2,"a"),
					new Question(q3,"b"),
					new Question(q4,"b"),
					new Question(q5,"a")
					};
					
					takeTest(questions);
			break;
			case 2:
				String a1="1) When was the idea of the atom first introduced?\n" + "(a)1050 \n(b) 450 B.C. ";
				String a2="2) An earthquake that measures 8 on the Richter Scale would be how many times stronger than an earthquake that measures 4 on the same scale?\n" + "(a)4 times stronger  \n(b) 10,000 times stronger ";
				String a3="3) What physicist discovered that a wave's frequency changes when the source and the observer are in motion relative to one another?\n" + "(a) Christian Johann Doppler  \n(b) MAX PLANCK";
				String a4="4) What is the gestation period of a Hippopotamus?\n" + "(a) 4 MONTHS  \n(b) 8 MONTHS";
				String a5="5) In what type of matter are atoms most tightly packed?\n" + "(a) SOLIDS  \n(b) GASES";
				
				
	
				Question [] aquestion = {
				new Question(a1, "b"),
				new Question(a2,"b"),
				new Question(a3,"a"),
				new Question(a4,"b"),
				new Question(a5,"a")
				};
				takeTest(aquestion);
			break;
			case 3:
				String b1="1) What does LBW stand for?\n" + "(a)LEG BEFORE WICKET \n(b) LONG BALL WIDE ";
				String b2="2) Who did England beat in the final of the 2019 Cricket World Cup?\n" + "(a)NEW ZEALAND  \n(b) AUSTRALIA ";
				String b3="3) Which of these places is cricket NOT a popular sport?\n" + "(a) INDIA  \n(b) MYANMAR";
				String b4="4) What is the gestation period of a Hippopotamus?\n" + "(a) 4 MONTHS  \n(b) 8 MONTHS";
				String b5="5) In what type of matter are atoms most tightly packed?\n" + "(a) SOLIDS  \n(b) GASES";
				
				
	
				Question [] bquestion = {
				new Question(b1, "a"),
				new Question(b2,"b"),
				new Question(b3,"a"),
				new Question(b4,"b"),
				new Question(b5,"a")
				};
				takeTest(bquestion);
			break;
			case 4:
				System.out.println("4th option");
				String t1="1) Which country in the world is believed to have the most miles of motorway?\n" + "(a)China \n(b)Canada";
				String t2="2) What is the capital city of Australia?\n" + "(a)sweden  \n(b) canberra ";
				String t3="3) What language is spoken in Brazil?\n" + "(a) Portuguese  \n(b) Hindi";
				String t4="4) How many notes are there in a musical scale??\n" + "(a) 4  \n(b) 7";
				String t5="5) What is the tallest mountain in the world?\n" + "(a) Mount Everest  \n(b) Lhotse";
				
				
	
				Question [] cquestion = {
				new Question(t1,"a"),
				new Question(t2,"b"),
				new Question(t3,"a"),
				new Question(t4,"b"),
				new Question(t5,"a")
				};
				takeTest(cquestion);
			break;
			default : System.out.println("please select between [1-4]");
			System.out.println("\n");
			break;
		}
		
		System.out.println("Do you want to continue? <Y/N>");
		input = s.next().toUpperCase();
		quit = input.charAt(0);
		
				
		
		}
		System.out.println("Thank you");
		
	}
		
	public static void takeTest(Question [] questions) {
			
			int score = 0;
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i < questions.length; i++) {
				System.out.println(questions[i].que);
				String answer = sc.nextLine();
				if(answer.equals(questions[i].answer)) {
					score++;
					
				}
				else {
					System.out.println("Correct answer: " + questions[i].answer);
				}
			
			}
			System.out.println("You got : "+score + "/" + questions.length);
			
			
			
	}
}
