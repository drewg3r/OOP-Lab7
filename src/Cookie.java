public class Cookie extends PresentComponent {
    private int kcal;
    private boolean expired;
    private boolean crunchy;

    public Cookie(double weight, int kcal, boolean expired, boolean crunchy){
        super(weight);
        this.kcal = kcal;
        this.expired = expired;
        this.crunchy = crunchy;
    }

    public String toString() {
        return "Cookie{" +
                "class=" + this.getClass().getSimpleName() +
                ", crunchy=" + crunchy +
                ", kcal=" + kcal +
                ", expired=" + expired +
                '}';
    }
}
