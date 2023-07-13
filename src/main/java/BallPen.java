import strategies.writeStrategies.SmoothWriteBehaviour;

public class BallPen extends Pen implements RefillPen {
    public BallPen() {
        super(PenType.BALL, new SmoothWriteBehaviour());
    }
    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public Refill getRefill() {
        return null;
    }

    @Override
    public boolean canChangeRefill() {
        return false;
    }

    @Override
    public void changeRefill(Refill newRefill) {

    }
}
