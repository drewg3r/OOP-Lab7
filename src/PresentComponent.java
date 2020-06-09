public class PresentComponent {
    private double weight;

    public PresentComponent(double weight){
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        PresentComponent presentComponent = (PresentComponent) o;
        return weight == presentComponent.weight;
    }
}