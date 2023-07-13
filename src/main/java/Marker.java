import strategies.writeStrategies.SmoothWriteBehaviour;

public class Marker extends Pen implements RefillPen {
    public Marker() {
        super(PenType.MARKER, new SmoothWriteBehaviour());
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
