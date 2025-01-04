package lessonComparable_third;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Cat(){
        super();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cat other = (Cat) obj;
        return this.name.length() == other.name.length();
    }

    @Override
    public int compareTo(Cat cat) {
        if (cat == null) {
            throw new NullPointerException();
        }

        if (this.name.length() > cat.name.length()) return 1;
        if (this.name.length() < cat.name.length()) return -1;
        return Integer.compare(this.age, cat.age);
    }

    public String toString() {
        return "Cat{" +
                "name='" + name +
                ", age=" + age +
                '}';
    }
}
