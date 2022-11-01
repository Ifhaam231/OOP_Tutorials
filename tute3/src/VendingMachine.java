public class VendingMachine {

    private int canNo;
    private int tokenNo;

    public VendingMachine() {
        canNo = 10;
        tokenNo = 0;
    }

    public VendingMachine(int cans) {
        this.canNo = cans;
        tokenNo = 0;
    }

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
