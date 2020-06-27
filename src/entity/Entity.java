package entity;

public interface Entity {
    String getName();
    void reduceLife(double quantity);
    double percentageLife();
    boolean hasDied();
    String getImagePath();
}
