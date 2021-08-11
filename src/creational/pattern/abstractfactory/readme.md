# Abstract Factory Pattern

**_Factory of factories_**

**Define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.**
That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.

An Abstract Factory Pattern is also known as Kit.

**Advantage of Abstract Factory Pattern**

- Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
- It eases the exchanging of object families.
- It promotes consistency among objects.

**Usage of Abstract Factory Pattern**

- When the system needs to be independent of how its object are created, composed, and represented.
- When the family of related objects has to be used together, then this constraint needs to be enforced.
- When you want to provide a library of objects that does not show implementations and only reveals interfaces.
- When the system needs to be configured with one of a multiple family of objects.

![image](https://user-images.githubusercontent.com/8271393/129047365-af9964c2-f01d-4d11-97e2-ccf1df9d0c14.png)
![image](https://user-images.githubusercontent.com/8271393/129047294-b6b9efea-567e-4d78-ad87-d36ea0dd2ca3.png)
![image](https://user-images.githubusercontent.com/8271393/129047327-efba984d-a744-4cfb-84c6-370c7df78e20.png)
