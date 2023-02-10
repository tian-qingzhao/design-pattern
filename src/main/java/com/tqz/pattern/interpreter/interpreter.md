### 解释器模式

给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

### 特征：为了解释一种语言，而为语言创建的解释器。

### 解释器模式包含以下几种角色：

* 抽象表达式(Abstract Expression)角色：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret() 。
* 终结符表达式(Terminal Expression)角色：是抽象表达式子类，用来实现文法中与非中介表达式相关的操作， 文法中的每条规则都对应一个非终结符表达式。
* 环境(Context)角色：通常包含解释器需要的数据或公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取值。
* 客户端(Client)角色：主要任务是将需要分析的句子或表达式转换为使用解释器对象描述的抽象语法树，然后调用解释器的解释方法， 当然也可以通过环境角色间接访问解释器的解释方法。

### 适用场景：

* 一些重复出现的问题可以用一种简单的语言来进行表述。
* 一个简单语法需要解释的场景。

### 优点：

* 扩展性强：在解释器模式中由于语法是由很多类表示的，当语法规则更改时，只需修改相应的非终结符表达式即可；若扩展语法时，只需添加相应非终结符类即可。
* 增加了新的解释表达式的方式。
* 易于实现文法：解释器模式对应的文法应当是比较简单且易于实现的，过于复杂的语法并不适合使用解释器模式。

### 缺点：

* 语法规则较复杂时，会引起类膨胀。
* 执行效率比较低。