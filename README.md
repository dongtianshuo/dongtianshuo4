# 计191 董天硕 2019311016
# 实验目的
掌握Java中抽象类和抽象方法的定义；  
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；  
了解异常的使用方法，并在程序中根据输入情况做异常处理。  
# 实验要求
1.某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
2.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
3.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。  
4.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。  

在博士研究生类中实现各个接口定义的抽象方法;  
对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
根据输入情况，要在程序中做异常处理。  
# 实验过程
#### 接口类  
首先我先设置了俩个接口类，Student和Teacher两个接口类，用interface定义这两个类为接口；  
在Student接口类中定义了两个int类型的抽象方法jiao（）和cha（），并且对应的变量值为x1和x2；  
同样在Teacher接口类中定义了两个double类型的抽象方法fa（）和chaxin（），并且对于的变量值为x3和x4。  
#### 博士研究生类  
我设置研究生类Doctor，并且使用implements用来实现接口中定义的抽象方法；  
在Doctor类中我定义了5个变量：String类型名字name，String类型性别gender，String类型年龄age，int类型每学期学费xue，double类型每月工资xin；  
使用set（）方法方便返回对于的值，使用toString（）方法,返回相关对象的信息输出；  
通过public int jiao(int x1)，public int cha(int x2)，public double fa(double x3)，public double chaxin(double x4)实现了Student和Teacher接口的方法，并且使用return进行返回对应的值；  
#### 主类  
我先使用Scanner方法来进行交互输入，并且设置了一个数组String[] l = new String[3]，和两个博士研究生类的对象i1，i2；  
将用户输入的姓名，性别，年龄存入数组当中，然后通过set（）将数组中的姓名，性别，年龄存入到i1中，通过设置变量g1交互输入输入学费的值，set（）将g1的值存入i1中，设置变量g2交互输入输入工资的值，set（）将g2的值存入i1中；  
其中在输入学费g1的值是通过异常处理机制try {Scanner t = new Scanner(System.in);i1.setXue(t.nextInt());break;} catch (Exception exception) {System.out.println("输入错误，请重新输入！");}，如果输入不是int类型将输出“输入错误，请重新输入！”，异常处理机制完成；  
然后是缴纳学费系统，通过Scanner输入缴纳的学费，通过判断输入的学费是否等于g1进行循环，若不等于g1进入循环再次输入知道正确，若等于g1输出缴费成功进行下一步；  
进行查询功能，通过Scanner输入对于的值（1为缴纳学费，2为查询学费，3为查询工资,0为结束），通过switch判断输入的值对应的值，值对应上则输出对应的内容，
# 核心代码

```
interface Student {
    int jiao(int x1);
    int cha(int x2);
}
```
```
    public int jiao(int x1) {
        return x1;
    }

    public int cha(int x2) {
        return x2;
    }
```
```
while (true) {
            try {
                Scanner t = new Scanner(System.in);
                i1.setXue(t.nextInt());
                break;
            } catch (Exception exception) {
                System.out.println("输入错误，请重新输入！");
            }

        }
```
```
s:
        for (int w = 0; w < 4; w++) {
            int i = in.nextInt();
            switch (i) {
                case 1:
                    System.out.println("缴纳学费为:" + i1.jiao(g1));
                    break;
                case 2:
                    System.out.println("查询学费为:" + i2.cha(g1));
                    break;
                case 3:
                    System.out.println("查询工资为(每月工资税前)" + i1.fa(g2));
                    System.out.println("查询工资为(每月工资税后)" + (i1.fa(g2) - (i1.fa(g2) * 0.1) - 105));
                    System.out.println("查询工资为(年工资税后)" + ((i1.fa(g2) - (i1.fa(g2) * 0.1) - 105) * 9 - 2 * g1));
                    break;
                case 0:
                    break s;

            }
        }
```
# 实验结果
![实验结果截图](https://github.com/dongtianshuo/dongtianshuo4/blob/main/Snipaste_2020-11-03_16-47-42.png)
![实验结果截图](https://github.com/dongtianshuo/dongtianshuo4/blob/main/Snipaste_2020-11-03_16-47-51.png)
# 实验感想
在这次实验中我基本掌握了Java中抽象类和抽象方法的定义；掌握了Java中接口的定义，并熟练掌握接口的定义形式以及接口的实现方法；进一步了解异常的使用方法，并在程序中根据输入情况做异常处理。 
同时，因正确的编出程序而带来的成就感让我对编程更加感兴趣。对于在这些实验过程中，请教老师、同学互助、查阅资料等基本的学习方式，使我更加领悟到集体和团队的力量，也树立了敢于攻坚的信心。  
