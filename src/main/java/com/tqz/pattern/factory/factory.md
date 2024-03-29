# 简单工厂模式（Simple Factory）

简单工厂模式不是23种设计模式之一，他可以理解为工厂模式的一种简单的特殊实现。

### 适用场景：

* 工厂类负责创建的对象较少。
* 客户端只需要传入工厂类的参数，对于如何创建的对象的逻辑不需要关心。

### 优点：

* 只需要传入一个正确的参数，就可以获取你所需要的对象，无须知道创建的细节。

### 缺点：

* 工厂类的职责相对过重，增加新的产品类型的时需要修改工厂类的判断逻辑，违背了开闭原则。
* 不易于扩展过于复杂的产品结构。

# 工厂方法模式（Factory Method）

是指定义一个创建对象的接口，让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行。

### 工厂方法模式主要有以下几种角色：

* 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法来创建产品。
* 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
* 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
* 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它和具体工厂之间一一对应。

### 适用场景：

* 创建对象需要大量的重复代码。
* 客户端（应用层）不依赖于产品类实例如何被创建和实现等细节。
* 一个类通过其子类来指定创建哪个对象。

### 优点：

* 用户只需要关系所需产品对应的工厂，无须关心创建细节。
* 加入新产品符合开闭原则，提高了系统的可扩展性。

### 缺点：

* 类的数量容易过多，增加了代码结构的复杂度。
* 增加了系统的抽象性和理解难度。

# 抽象工厂模式（Abstract Factory）

抽象工厂模式是指提供一个创建一系列相关或相互依赖对象的接口，无须指定他们具体的类。

工厂方法模式中考虑的是一类产品的生产，如电脑厂只生产电脑，电话厂只生产电话，这种工厂只生产同种类的产品，同种类产品称为同等级产品，也就是说，工厂方法模式只考虑生产同等级的产品，但是现实生活中许多工厂都是综合型工厂，能生产多等级（种类）的产品，如上面说的电脑和电话，本质上他们都属于电器，那么他们就能在电器厂里生产出来，而抽象工厂模式就将考虑多等级产品的生产，将同一个具体工厂所生产的位于不同等级的一组产品称为一个产品族，如上图所示纵轴是产品等级，也就是同一类产品；横轴是产品族，也就是同一品牌的产品，同一品牌的产品产自同一个工厂。

### 抽象工厂模式的主要角色如下：

* 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品。
* 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
* 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
* 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。

### 总结：

* 产品族：一系列相关的产品，整合到一起有关联性

* 产品等级：同一个继承体系

### 适用场景：

* 客户端（应用层）不依赖于产品类实例如何被创建和实现等细节。
* 强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码。
* 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现。

### 优点：

* 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

### 缺点：

* 当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
