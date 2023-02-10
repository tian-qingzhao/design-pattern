### 访问者模式(Vistor Pattern)

是一种将数据结构和数据操作分离的设计模式。是指封装一些作用于某种数据结构中的各种元素的操作， 它可以在不改变数据结构的前提下定义作用于这些元素的新操作。

### 访问者模式角色

* 抽象访问者(Vistor)：**这个角色主要是定义对具体元素的访问方法，参数就是具体元素，理论上来说方法数等于元素(固定类型的对象，也就是被访问者)个数。
* 具体访问者(ConcreteVistor)：**实现对具体元素的访问。
* 抽象元素(Element)：**定义一个接受访问访问的方法。
* 具体元素(Concrete Element)：**提供接受访问者访问的具体实现。
* 结构对象(Object Struture)：**用来维护元素，并提供一个方法来接受访问者访问所有的元素。

### 应用场景

* 数据结构稳定，但是作用域数据结构上的操作经常变化，比如像上面的访问者再来个某某管理者想看员工别的啥内容了。
* 需要对不同数据类型进行操作，而不是用分支判断具体类型的场景。

### 优点

* 解耦了数据结构和数据操作，使得操作集合可以独立变化。
* 访问者角色非常容易扩展。
* 每种角色各司其职，符合单一职责。

### 缺点

* 增加元素(被访问者)类型困难，如果改变了元素，需要修改访问者代码，违反开闭原则。
* 违反了依赖倒置原则，比如访问者中入参依赖的是具体元素，而不是抽象元素。