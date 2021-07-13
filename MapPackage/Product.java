package MapPackage;

import java.util.Objects;

public class Product {
    private String name;
    private int num;

    public Product(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
// 同时重写equals方法和哈市code方法：
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return num == product.num && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }
}
