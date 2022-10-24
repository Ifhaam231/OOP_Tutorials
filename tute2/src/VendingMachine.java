public class VendingMachine {

    private int canNo;
    private int tokenNo;

    public void fillUp(int cans){
        this.canNo = cans;
    }

    public void insertToken(){
        tokenNo+= 1;
        canNo -= 1;
    }

    public int getTokenCount(){
        return tokenNo;
    }

    public int getCanCount(){
        return canNo;
    }
}
