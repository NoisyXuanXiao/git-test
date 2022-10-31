package com.xuanxiao.oop.demo03;

public class Pet {

    public String name;
    public int age;
    public char aaa;

    public void shout(){
        System.out.println("叫了一声");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (age != pet.age) return false;
        if (aaa != pet.aaa) return false;
        return name != null ? name.equals(pet.name) : pet.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (int) aaa;
        return result;
    }

    public static void main(String[] args) {
        Pet p1 = new Pet();
        Pet p2 = new Pet();
        System.out.println(p1.equals(p2));
    }
}
