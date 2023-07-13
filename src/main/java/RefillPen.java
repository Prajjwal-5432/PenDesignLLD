public interface RefillPen {
    Refill getRefill();
    boolean canChangeRefill();
    void changeRefill(Refill newRefill);
}
