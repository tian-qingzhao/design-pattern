### 代理模式

是指为其他对象提供一种代理，以控制对这个对象的访问。代理对象在访问对象和目标对象之间起到中介作用。

Java中的代理按照代理类生成时机不同又分为静态代理和动态代理。 静态代理代理类在编译期就生成，而动态代理代理类则是在Java运行时动态生成。动态代理又有JDK代理和CGLib代理两种。

### 代理（Proxy）模式分为三种角色：

* 抽象角色（Subject）： 通过接口或抽象类声明真实角色和代理对象实现的业务方法。
* 真实角色（Real Subject）： 实现了抽象角色中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
* 代理角色（Proxy） ： 提供了与真实角色相同的接口，其内部含有对真实角色的引用，它可以访问、控制或扩展真实角色的功能。

### 应用场景：

保护目标对象。 增强目标对象。

### 优点：

代理模式能将代理对象与真实被调用的目标对象分离。 一定程度上降低了系统的耦合程度，易于扩展。 代理可以起到保护目标对象的作用。 增强目标对象的职责。

### 缺点：

代理模式会造成系统设计中类的数目增加。 在客户端和目标对象之间增加了一个代理对象，请求处理速度变慢。 增加了系统的复杂度。

### 三种动态代理的对比：

#### 静态代理的特点：

* 只要确保目标对象和代理对象实现共同的接口或继承相同的父类就可以在不修改目标对象的前提下进行扩展。
* 那就是代理类和目标类必须有共同接口(父类)，并且需要为每一个目标类维护一个代理类，当需要代理的类很多时会创建出大量代理类。一旦接口或父类的方法有变动，目标对象和代理对象都需要作出调整。

#### JDK动态代理的特点：

* 需要实现InvocationHandler接口， 并重写invoke方法。
* 被代理类需要实现接口， 它不支持继承。
* JDK 动态代理类不需要事先定义好， 而是在运行期间动态生成。
* JDK 动态代理不需要实现和被代理类一样的接口， 所以可以绑定多个被代理类。
* 主要实现原理为反射， 它通过反射在运行期间动态生成代理类， 并且通过反射调用被代理类的实际业务方法。

#### Cglib的特点：

* cglib动态代理中使用的是FastClass机制。
* cglib生成字节码的底层原理是使用ASM字节码框架。
* cglib动态代理需创建3份字节码，所以在第一次使用时会比较耗性能，但是后续使用较JDK动态代理方式更高效，适合单例bean场景。
* cglib由于是采用动态创建子类的方法，对于final方法，无法进行代理。