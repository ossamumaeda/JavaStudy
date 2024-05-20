package challenges.salles;

public class Product {
    private String name;
    private float value;

    public Product(String name,float value){
        this.setName(name);
        this.setValue(value);
    }

    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return this.getName() + " - " + "Price: " + this.getValue();
    }
}
