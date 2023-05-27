package by.academiapvt.task2;

public class ComparingProducts <K extends Product,V extends Product>{
    K key;
    V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public ComparingProducts(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public ComparingProducts() {
    }

    public void toCompareProducts(K k, V v) {
        if (k.toSeePrice() > v.toSeePrice()) {
            System.out.println("Большая цена = " + k.toSeePrice() + " , меньшая цена = " + v.toSeePrice());
        } else if (k.toSeePrice() < v.toSeePrice()) {
            System.out.println("Большая цена = " + v.toSeePrice() + " , меньшая цена = " + k.toSeePrice());
        } else {
            System.out.println("Цены товаров равны");
        }
    }
}
