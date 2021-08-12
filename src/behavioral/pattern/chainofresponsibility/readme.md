# Chain Of Responsibility Pattern

**Avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request**. 
For example, an ATM uses the Chain of Responsibility design pattern in money giving process.

In other words, we can say that normally each receiver contains reference of another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.

**Advantage of Chain of Responsibility Pattern**

- It reduces the coupling.
- It adds flexibility while assigning the responsibilities to objects.
- It allows a set of classes to act as one; events produced in one class can be sent to other handler classes with the help of composition.

**Usage of Chain of Responsibility Pattern**

- When more than one object can handle a request and the handler is unknown.
- When the group of objects that can handle the request must be specified in dynamic way.


![image](https://user-images.githubusercontent.com/8271393/129242455-7567aa09-8e80-4b8d-9e82-abe25ea17dab.png)

