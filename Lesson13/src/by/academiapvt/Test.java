package by.academiapvt;

public class  Test <T,V> {
    T test;
    V value;

    public T getTest() {
        return test;
    }

    public void setTest(T test) {
        this.test = test;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Test(T test, V value) {
        this.test = test;
        this.value = value;
    }
    public void Information(){
        System.out.println(getTest());
        System.out.println(getValue());

    }
}
