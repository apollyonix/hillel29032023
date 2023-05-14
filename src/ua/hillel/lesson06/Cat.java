package ua.hillel.lesson06;

import java.util.Objects;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Cat {
  private String color;
  private String name;
  private int age;
  private String createDate;

  public Cat() {
    System.out.println("Default const");
  }

  public Cat(String name) {
    System.out.println("Const with param: " + name);
    this.name = name;
  }

  public Cat setColor(String color) {
    this.color = color;
    return this;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public Cat setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Cat setAge(int age) {
    if (age < 0) {
      this.age = 1;
    } else {
      this.age = age;
    }
    return this;
  }

  @Override
  public String toString() {
    return "Cat{" + "color='" + color + '\'' + ", name='" + name + '\'' + ", age=" + age + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Cat cat = (Cat) o;
    return age == cat.age && Objects.equals(color, cat.color) && Objects.equals(name, cat.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, name, age);
  }

  public void sayMeow() {
    System.out.println(name + " says Meow");
  }
}
