package StreamAPI_Part2;

import java.util.Objects;

public class Cat {
    private String name;
    private int weight;

    public Cat(String name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    public Cat(){
        super();
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    public String toString() {
        return "Cat{" +
                "name='" + name +
                ", age=" + weight +
                '}';
    }
}

