package main_package;

import animal_package.Animal;

public class Cat extends Animal {
  public void accessProperties() {
    // This will not compile if Cat is in a different package from animal_pack
    // System.out.println(defaultProperty);

    // Accessing the protected property
    System.out.println(protectedProperty);
  }
}

