package classesJavaOpps;

public class Cricket {
    String playerName;
    boolean isRetired;
    int jerseyNumber;

    public Cricket(){
        System.out.println("This is non args constructor");
    }

    public Cricket(String playerName, int jerseyNumber, boolean isRetired){
        this.playerName = playerName;
        System.out.println("Constructor Player name "+ playerName);
        this.jerseyNumber = jerseyNumber;
        System.out.println("Constructor Player's Jersey number "+ jerseyNumber);
        this.isRetired = isRetired;
        if (this.isRetired) {
            System.out.println("Constructor Player is retired ");
        } else {
            System.out.println("Constructor Player is playing ");
        }
    }

//    public Cricket(int jerseyNumber){
//        this.jerseyNumber = jerseyNumber;
//        System.out.println("Constructor Player's Jersey number "+ jerseyNumber);
//    }
//
//    public Cricket(boolean isRetired){
//        this.isRetired = isRetired;
//        if(this.isRetired){
//            System.out.println("Constructor Player is retired ");
//        } else {
//            System.out.println("Constructor Player is playing ");
//        }
//    }

    public int odiRuns(int runs){
        return runs;
    }

    public void display(){
        System.out.println("Player Name " + playerName);
        System.out.println("Player's Jersey number " + jerseyNumber);
        System.out.println("Retired " + isRetired);
    }



}
