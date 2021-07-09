package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
/*
remove方法也重写了equals方法，和contains方法类似
 */
public class RemoveTest01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Animal animal1 = new Animal("大喵");
        c1.add(animal1);
        Animal animal2 = new Animal("大喵");
        c1.remove(animal2);
        System.out.println(c1.size());

    }
}
class Animal{
    private String name;
    public Animal(){}
    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

}
