package hw;

public class Home {

    public int homeNumber;
    private int numberRoom;
    private int numberTenants;
    private String nameHome ;

    Home(){
        this.homeNumber  = 13;
        this.numberRoom = 245;
        this.numberTenants = 502;
        this.nameHome = "GloryToTheQueen";

    }
    @Override
    public String toString(){

        return this.homeNumber+" "+this.numberRoom+" "+this.numberTenants+" "+this.nameHome;

    }
    private void newTenants(int numberTenants){
        System.out.println(numberTenants+1);
    }
}
