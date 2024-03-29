# Command Pattern

**Encapsulate a request under an object as a command and pass it to invoker object. 
Invoker object looks for the appropriate object which can handle this command and pass the command to the 
corresponding object and that object executes the command**

It is also known as Action or Transaction.

**Advantage of command pattern**

- It separates the object that invokes the operation from the object that actually performs the operation.
- It makes easy to add new commands, because existing classes remain unchanged.

**Usage of command pattern**

- When you need parameterize objects according to an action perform.
- When you need to create and execute requests at different times.
- When you need to support rollback, logging or transaction functionality.

![image](https://user-images.githubusercontent.com/8271393/129245992-5c2d257b-7cdc-4f04-8a7b-76007f3fecc5.png)
