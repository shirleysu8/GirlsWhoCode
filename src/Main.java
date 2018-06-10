import java.util.Scanner;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    String q1 = "Pick a movie to watch: \n (A) The Avengers \n (B) The Notebook \n (C) Sleepless in Seattle \n (D) The History Channel \n (E) Alvin and the Chipmunks ";
    String q2 = "What is your favorite part of school? \n (A) Art class \n (B) Lunch \n (C) Field trips \n (D) History Class \n (E) Recess";
    String q3 = "You ask someone on a date...What activity do you do? \n (A) Go to Comic Con \n (B) Go Shopping \n (C) Go to dinner \n (D) Go to a museum \n (E) Go rollerskating";
    String q4 = "What is your favorite part of summer vacation? \n (A) Outdoor Movies \n (B) Eating out \n (C) Instagramming your trips. My blog is practically a full time job. \n (D) Exploring new places \n (E) Going to the beach because I love the water";
    String q5 = "What is your favorite hobby? \n (A) Art \n (B)  Shopping  \n (C) Does Social Media count? I spend more time with my followers than I do with my family \n(D) Reading a Book \n (E) Swimming all day, every day";
    String q6 = "What is your favorite season? \n (A) Fall \n (B) Spring \n (C) All Seasons: Every season as instagrammable elements! \n (D) Winter \n (E) Summer. No school!";
    String q7 = "What do you fear? \n (A) Trends \n (B) People \n (C) Heights: I get dizzy just looking off a ladder \n (D) Close spaces \n (E) Drowning. I watched Jaws and had nightmares for a week \n";
    String q8 = "How much time are you willing to spend outside? \n (A) 1 mi. The bare minimum. \n (B) 2 mi  \n (C) A little bit at a time \n (D) All Day. I have the stamina of a bull on steroids. \n (E) < 1 mile. You mean you want me to walk?!! \n";
    String q9 = "How much are you willing to spend? \n (A) $20-30 \n (B) Nothing \n (C) As much as it takes \n (D) $10-25 \n (E) $35-40. Not too much, not too little";
    String q10 = "How much time do you have? \n (A) A couple of hours \n (B) All day \n (C) 15 minutes \n (D) An hour \n (E) 90 minutes. Enough time to do something fun. \n";
    
    Questions[] questions = { new Questions(q1), new Questions(q2), new Questions(q3), new Questions(q4), new Questions(q5), new Questions(q6), new Questions(q7), new Questions(q8), new Questions(q9), new Questions(q10)};
  	takeTest(questions);
    
  }
  public static void takeTest(Questions[] questions){
  	ArrayList<Integer> scores = new ArrayList<Integer>();
    scores.add(0);
    scores.add(0);
    scores.add(0);
    scores.add(0);
    scores.add(0); 
    Scanner console = new Scanner(System.in);
    for(int i = 1; i <= questions.length - 1; i++){
      System.out.println(questions[i]);
      String answer = console.nextLine();
      int increment = 1;
      if(i == 7){
      	increment = -1;
      }
      
      if(answer.toUpperCase().equals("A")){
      	int count = scores.get(0) + increment;
      	scores.add(0,count);
      } 
      else if(answer.toUpperCase().equals("B")){
      	int count = scores.get(1) + increment;
      	scores.add(1,count);
      }
      else if(answer.toUpperCase().equals("C")){
      	int count = scores.get(2) + increment;
      	scores.add(2,count);;
      }
      else if(answer.toUpperCase().equals("D")){
      	int count = scores.get(3) + increment;
      	scores.add(3,count);;
      }
      else{
      	int count = scores.get(4) + increment;
      	scores.add(4,count);
      }
    }
    
    int maxScore = 0; 
    int result = 0;
  	for (int j = 1; j <= scores.size() - 1; j++){
    	if (scores.get(j) > maxScore){
      		result = j;
      }
    }
    if (result == 1) {
    	System.out.println("You should go to the EMP!");
      System.out.println("The Experience Music Project is the perfect place to take a look into pop culture such as musical artifacts from handwritten lysrics to personal instruments. Like many museums, there are also feature exhibits for modern arts and music features such as Marvel, Star Trek, and video gae franchisese.");
      System.out.println("You are also able to take a peek into Seattle's rich music history with memorabilia from local legends such as Nirvana, Jimi Hendrix and Pearl Jam."); 
    } else if (result == 2) {
    	System.out.println("You should go to Pike Place Market!"); 
      System.out.println("Pike Place Market is Seattle's original farmers market, established in 1907. Pike Place has a variety of foods and vendors. Popular breakfast and brunch stops include the Crumpet Shop, Biscuit Bitch, and the original Starbucks! Its rich culture and food will provide a new, memorable experience");
      
    } else if (result == 3){
    	System.out.println("You should go to the Space Needle");
      System.out.println("The Space Needle is Seattle's most iconic landmark. Take the elevator to the top, 605 feet above the ground, and enjoy a spectacular view of Seattle's mountains, Elliot Bay, and more! ");
    } else if (result == 4){
    	System.out.println("You should go to the Seattle Underground");
      System.out.println("The Seattle Underground Tour takes you through the forgotten remains of old Seattle after the Great Seattle Fire. Learn about , and potentially see ");
    } else if (result == 5) {
    	System.out.println("You should go on the Duck Tour!");
      System.out.println("Experience Seattle from both land and water by taking a tour on an amphibious vehicle ");
    }
  }
}
