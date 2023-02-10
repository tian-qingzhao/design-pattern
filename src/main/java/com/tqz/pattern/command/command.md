### 命令模式

对命令的封装，每一个命令都是一个操作，请求的一方发出一个请求要执行一个操作，接收的一方收到请求，并执行操作。
命令模式解耦了请求方和接收方，请求方只需请求执行命令，不用关心命令怎样被接收，怎样被操作以及是否被处理等。本质：解耦命令的请求与处理。

### 命令模式包含以下角色：

* 抽象命令类(Command)角色：定义命令的接口，声明执行的方法。
* 具体命令(Concrete Command)角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
* 调用者/请求者(Invoker)角色：要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相关的操作的地方，也就是使用命令对象的入口。
* 实现者/接收者(Receiver)角色：接收者，真正执行命令的对象。任何对象都可以成为接收者，只要它能实现命令要求实现的相关功能。

### 适用场景：

* 现实语义中具备“命令”的操作（如命令菜单，shell命令...）。
* 请求调用者和请求接收者需要解耦，使得调用者和接收者不直接交互。
* 需要抽象出等待执行的行为，比如撤销操作和恢复操作等。
* 需要支持命令宏（即命令组合操作）。

### 优点：

* 通过引入中间件（抽象接口），解耦了命令的请求与实现。
* 扩展性良好，可以很容易地增加新命令。
* 支持组合命令，支持命令队列。
* 可以在现有的命令的基础上，增加额外功能。

### 缺点：

* 具体命令类可能过多。
* 增加了程序的复杂度，理解更加困难。