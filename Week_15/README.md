## 毕业总结
### 一、JVM总结
#### 1、JVM字节码技术
- 什么是字节码技术
   - Java bytecode由单字节(byte)的指令组成，最多支持
256操作码
- 字节码分类
   - 栈操作指令，包括与局部变量交互的指令
   - 程序流程控制指令
   - 对象操作指令，包括方法调用指令
   - 算术运算以及类型转换指令

#### 2、JVM类加载器
- 类的生命周期
   - 1）加载(loading):找class文件
   - 2) 验证(Verification):验证格式，依赖
   - 3) 准备(Preparation):静态字段、方法表
   - 4) 解析(Resolution):符号解析为引用
   - 5) 初始化(Initialization)：构造器、静态变量赋值、静态代码块
   - 6) 使用(Using)
   - 7) 卸载(Unloading)

- 类加载器及特点
   - 启动类加载器（BootstrapClassLoader）
   - 扩展类加载器(ExtclassLoader)
   - 应用类加载器(AppClassLoader)

- 加载器特点
   - 双亲委托
   - 负责依赖
   - 缓存加载

#### 3、JVM 内存模型
- JVM内存整体结构
   - 每启动一个线程，ＪＶＭ就会在栈空间栈分配对应的线程栈，比如１ＭＢ的空间
   - 线程栈也叫做Ｊａｖａ方法栈，如果使用了JNI方法，则会分配一个单独的本地方法栈

#### 4、JVM启动参数

- 启动参数格式
   - Java [options] classname [args]
   - java [options] -jar filename [args]

- 启动参数分类
   - 系统属性参数
      - Dfile.encoding = UTF-8
      - Duser.timezone = GMT+08
      - Dmaven.test.skip=true
   - 运行模式参数
      - -server
      - -client
      - -Xint
      - -Xcomp
      - -Xmixed
   - 堆内存设置参数
      - -Xmx指定最大堆内存
      - -Xms 指定堆内存空间的初始大小
      - -Xmn 等价于 -XX：NewSize
      - -XX:MaxPermSize = size
   - GC设置参数
      - -XX:+UseG1GC
      - -XX:+UseConcMarkSweepGC
      - -XX:+UseSerialGC
   - 分析诊断参数
   - JavaAgent参数

#### 5、JDK内置命令行工具
- jps/jinfo
   - jps -help
   - jps [-q] [-mlvV] [<hostid>]

- jstat -options  
- jmap
- jstack
- jcmd
- jrunscript/jjs



#### 6、JDK内置图形化工具
- jconsole
- jvisualvm
- VisualGC
- jmc


#### 7、GC背景与一般原理
- 清除算法
   - 标记清除算法（Mark and Sweep）
- 分代假设

#### 8、串行GC与并行GC


#### 9、CMS GC/G1 GC

#### 10、ZGC/Shenandoah GC


### 二、Java多线程


#### 1、多线程基础



#### 2、Java多线程

#### 3、线程安全

#### 4、线程池原理与应用








































