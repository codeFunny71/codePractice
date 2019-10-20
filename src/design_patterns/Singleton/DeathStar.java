package design_patterns.Singleton;

public class DeathStar {
    //fields
    private int numTroopers;
    private boolean commanderOnBoard;
    private boolean isSuperLaserArmed;

    //
    private static DeathStar instance;

    private DeathStar(int numTroopers, boolean commanderOnBoard, boolean isSuperLaserArmed){
        this.numTroopers = numTroopers;
        this.commanderOnBoard = commanderOnBoard;
        this.isSuperLaserArmed = isSuperLaserArmed;

    }

    public static DeathStar getInstance() {
        return instance;
    }

    public void fireSuperLaser(String target){
        if(isSuperLaserArmed){

        }
    }
}
