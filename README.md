# 计191 董天硕 2019311016
# 实验目的
掌握Java中抽象类和抽象方法的定义；  
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；  
了解异常的使用方法，并在程序中根据输入情况做异常处理。  
# 实验要求
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。  
编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。  


在博士研究生类中实现各个接口定义的抽象方法;  
对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
根据输入情况，要在程序中做异常处理。  
# 实验过程
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
