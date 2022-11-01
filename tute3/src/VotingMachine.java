import java.util.Random;

import static java.lang.Math.random;

public class VotingMachine {
    private int lab;
    private int cons;

    public VotingMachine() {
        lab = 0;
        cons = 0;
    }

    public void voteLab() {
        this.lab = lab + 1;
    }

    public void voteCons() {
        this.cons = cons + 1;
    }

    public int getLab() {
        return lab;
    }

    public int getCons() {
        return cons;
    }

    public void voteCheatLab(){
        Random random = new Random();
        this.lab = random.nextInt(1,500);
    }

}
