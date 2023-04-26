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

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) {
      this.age = 1;
    } else {
      this.age = age;
    }

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
