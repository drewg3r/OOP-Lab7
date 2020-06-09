public class Waffle extends PresentComponent {
    private int chocolatePercentage;
    private int kcal;
    private boolean expired;

    public Waffle(double weight, int chocolatePercentage, int kcal, boolean expired){
        super(weight);
        this.chocolatePercentage = chocolatePercentage;
        this.kcal = kcal;
        this.expired = expired;
    }

    public String toString() {
        return "Waffle{" +
                "class=" + this.getClass().getSimpleName() +
                ", chocolatePercentage=" + chocolatePercentage +
                ", kcal=" + kcal +
                ", expired=" + expired +
                '}';
    }
}
