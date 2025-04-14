package Snack_Strategy;

public class Cobra implements ISnack {
private IBiteBehavior iBiteBehavior;
    public Cobra() {
        this.iBiteBehavior = new NonPoison();
    }


    @Override
    public String details() {
    return "Cobra";
    }

    @Override
    public String performBite() {
        return iBiteBehavior.bite();
    }

    @Override
    public void setBehavior(IBiteBehavior behavior) {

    }



}
