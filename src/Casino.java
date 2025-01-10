import java.util.Scanner;

public class Casino {
    private int numGold;
    private String guess;
    private int die1;
    private int die2;
    private Hunter hunter;

    public Casino (Hunter hunter){
        this.numGold =  hunter.getGold();
        Scanner s = new Scanner(System.in);
        System.out.println("Make your wager player (Enter a number 1-12: ");
        guess = s.nextLine();
        die1=0;
        die2=0;
        this.hunter = hunter;
    }
    public void checkGuess(){
        int numGuess = Integer.parseInt(guess);
        if (numGuess==roll()){
            System.out.println("YOU WON You get double the amount of gold");
            hunter.changeGold(numGuess);
        } else if (((numGuess <= (roll()+2)) && ((roll()-2) <= numGuess))) {

        }
        else{

            hunter.changeGold(-1*numGuess);

        }
    }
    public int roll(){
        die1 = (int)(Math.random()*6+1);
        die2 = (int)(Math.random()*6+1);
        return die1+die2;
    }
}

