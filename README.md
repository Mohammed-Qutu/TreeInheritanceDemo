# TreeInheritanceDemo

## Description
This Java project demonstrates the concept of inheritance using a `Tree` base class and a derived `FruitTree` class. The `Tree` class contains information about a tree's name and height, while the `FruitTree` class extends the base class to include the type of fruit the tree bears. The project showcases how inheritance allows for code reuse and extending functionality.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `Tree.java` and `FruitTree.java` files. The program will create instances of trees and fruit trees, and output their details.

### Example Usage
```java
Tree oak = new Tree("Oak", 30);
FruitTree appleTree = new FruitTree("Apple Tree", 15, "Apple");

System.out.println(oak);
System.out.println(appleTree);

Tree name: Oak
Height in feet: 30

Tree name: Apple Tree
Height in feet: 15
Fruit type: Apple

Key Features:
Tree Class: Represents a generic tree with attributes like name and height.
FruitTree Class: Inherits from Tree and adds an additional attribute for the type of fruit the tree produces.
Methods:
Tree Class:
getName(), getHeight(): Getters for Tree attributes.
setName(), setHeight(): Setters for Tree attributes.
toString(): Returns a string representation of the Tree object.
FruitTree Class:
getFruitType(): Returns the type of fruit.
setFruitType(): Sets the type of fruit.
toString(): Overrides Tree's toString() to include fruit information.
License
This project is licensed under the MIT License - see the LICENSE file for details.
