package Shiyan4;

public class Doctor implements Student, Teacher {
    String name;
    String gender;
    String age;
    int xue;
    double xin;

    public Doctor(String name, String gender, String age, int xue, int xin) { }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

        public int getXue(){
        return xue;
    }
    public void setXue(int xue) {
        this.xue = xue;
    }

    public void setXin(double xin) {
        this.xin = xin;
    }

    public String toString() {
        return "姓名: " + name + " 性别: " + gender + " 年龄: " + age + " 每学期学费: " + xue + " 每月薪水: " + xin;
    }

    public int jiao(int x1) {
        return x1;
    }

    public int cha(int x2) {
        return x2;
    }

    public double fa(double x3) {
        return x3;
    }

    public double chaxin(double x4) {
        return x4;
    }
}
