# Factory Method
Factory Method Pattern says that just define **an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.**
In other words, subclasses are responsible to create the instance of the class.

The Factory Method Pattern is also known as Virtual Constructor.

**Advantage of Factory Design Pattern**
- Factory Method Pattern allows the sub-classes to choose the type of objects to create.
- It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means 
  the code interacts solely with the resultant interface or abstract class, so that it will work with any classes that 
  implement that interface or that extends that abstract class.

**Usage of Factory Design Pattern**
- When a class doesn't know what sub-classes will be required to create
- When a class wants that its sub-classes specify the objects to be created.
- When the parent classes choose the creation of objects to its sub-classes.

**When to use?**
- If there is inheritance hierarchy, where a polymorphic creation is needed.
- When you are modifying a class to accommodate varying requirements.(violating open-closed principle)

**What is Open-Closed Principle**
The open–closed principle states "software entities (classes, modules, methods, etc.) 
should be open for extension, but closed for modification" i.e. such an entity can allow its behaviour to be extended 
without modifying its source code.

![image](https://user-images.githubusercontent.com/8271393/128925669-83361c76-ae17-4a04-8efb-865c51147dbe.png)

