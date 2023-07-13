import strategies.writeStrategies.SmoothWriteBehaviour;

public class GellPen extends Pen implements RefillPen {
    private Refill refill;
    private boolean canChangeRefill = false;
    private GellPen() {
        super(PenType.GELL, new SmoothWriteBehaviour());
    }

    public static class Builder {
        private Refill refill;
        private boolean canChangeRefill = false;

        public Builder setRefill(Refill refill) {
            this.refill = refill;
            return this;
        }

        public Builder setCanChangeRefill(boolean canChangeRefill) {
            this.canChangeRefill = canChangeRefill;
            return this;
        }

        public GellPen build() {
            GellPen gellPen = new GellPen();
            gellPen.refill = this.refill;
            gellPen.canChangeRefill = this.canChangeRefill;

            return gellPen;
        }
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
        return this.refill;
    }

    @Override
    public boolean canChangeRefill() {
        return this.canChangeRefill;
    }

    @Override
    public void changeRefill(Refill newRefill) {

    }
}
