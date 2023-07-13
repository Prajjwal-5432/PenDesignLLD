import strategies.writeStrategies.SmoothWriteBehaviour;

public class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;
    private FountainPen() {
        super(PenType.FOUNTAIN, new SmoothWriteBehaviour());
    }

    public static class Builder {
        private Ink ink;
        private Nib nib;

        public Builder setInk(Ink ink) {
            this.ink = ink;
            return this;
        }

        public Builder setNib(Nib nib) {
            this.nib = nib;
            return this;
        }

        public FountainPen build() {
            FountainPen fountainPen = new FountainPen();
            fountainPen.ink = this.ink;
            fountainPen.nib = this.nib;

            return fountainPen;
        }
    }
    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
