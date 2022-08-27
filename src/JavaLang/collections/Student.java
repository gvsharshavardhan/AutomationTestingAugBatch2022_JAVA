package JavaLang.collections;

public class Student {

    public String name;
    public int rollNum;

    public Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }

    public String toString() {
        return "Name: " + this.name + " Roll Num: " + this.rollNum;
    }

    @Override
    public boolean equals(Object o) {
        return ((Student) o).name.equals(this.name);
    }

}