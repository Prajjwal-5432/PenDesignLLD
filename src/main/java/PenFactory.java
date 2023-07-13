public class PenFactory {
    public static GellPen.Builder createGellPen() {
        return new GellPen.Builder();
    }
    public static BallPen createBallPen() {
        return null;
    }

    public static FountainPen.Builder createFountainPen() {
        return new FountainPen.Builder();
    }
}
