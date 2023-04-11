package seminar6.tasks;

import java.util.Objects;

//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//        а) информационной системой ветеринарной клиники
//        б) архивом выставки котов
//        в) информационной системой Театра кошек Ю. Д. Куклачёва
//        Можно записать в текстовом виде, не обязательно реализовывать в java.
public class Cat {
    public String name;
    public int age;
    public boolean isIll;
    public String diagnoses;
    public Owner owner;

    public Cat(String name, int age, boolean isIll, String diagnoses, Owner owner) {
        this.name = name;
        this.age = age;
        this.isIll = isIll;
        this.diagnoses = diagnoses;
        this.owner = owner;
    }

    public Cat(String simba, int age, boolean isIll, String linyaet, String name) {
    }

    @Override
    public String toString() {
        return String.format("Cat {name = %s, age = %s, isIll = %s, diagnosis = %s, " +
                "owner = %s}", name, age, isIll, diagnoses, owner.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cat cat = (Cat) obj;
        return cat.name.equals(this.name) && cat.age == this.age && cat.diagnoses.equals(this.diagnoses) &&
                cat.isIll == this.isIll;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((diagnoses == null) ? 0 : diagnoses.hashCode());
        return result;
    }
    //        return this.name.equals(((Cat)obj).name) && this.age == ((Cat)obj).age && this.isIll == ((Cat)obj).isIll &&
//                this.diagnoses.equals(((Cat)obj).diagnoses && this.owner.name.equals(((Cat)obj).owner.name);
}
