package Shiyan4;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] l = new String[3];
        Doctor i1 = new Doctor("wu", "wu", "wu", 0, 0);
        Doctor i2 = new Doctor("wu", "wu", "wu", 0, 0);
        System.out.println("请依次输入姓名，性别，年龄，每学期缴纳学费，每月工资");
        for (int n = 0; n < 3; n++) {
            String g = in.nextLine();
            l[n] = g;
        }
        i1.setName(l[0]);
        i1.setGender(l[1]);
        i1.setAge(l[2]);
        while (true) {
            try {
                Scanner t = new Scanner(System.in);
                i1.setXue(t.nextInt());
                break;
            } catch (Exception exception) {
                System.out.println("输入错误，请重新输入！");
            }

        }
        int g1 = i1.getXue();
        double g2 = in.nextDouble();
        i1.setXin(g2);
        System.out.println("请缴纳学费(" + g1 + "元):");
        int z = in.nextInt();
        while (z != g1) {
            if (z != g1) {
                System.out.println("金额错误");
            }
            z = in.nextInt();
        }
        System.out.println("缴费成功");
        System.out.println(i1);
        System.out.println("1为缴纳学费，2为查询学费，3为查询工资,0为结束:");
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
        String[] l1 = new String[4];
        System.out.println("请依次输入姓名，性别，年龄，每学期学费，每月工资:");
        for (int n1 = 0; n1 < 4; n1++) {
            String g0 = in.nextLine();
            l1[n1] = g0;
        }
        i2.setName(l1[0]);
        i2.setGender(l1[1]);
        i2.setAge(l1[2]);
        while (true) {
            try {
                Scanner t1 = new Scanner(System.in);
                i2.setXue(t1.nextInt());
                break;
            } catch (Exception exception) {
                System.out.println("输入错误，请重新输入！");
            }

        }
        int g3 = i2.getXue();
        double g4 = in.nextDouble();
        i2.setXin(g4);
        System.out.println("请缴纳学费(" + g3 + "元):");
        int z1 = in.nextInt();
        while (z1 != g3) {
            if (z1 != g3) {
                System.out.println("金额错误");
            }
            z1 = in.nextInt();
        }
        System.out.println("缴费成功");
        System.out.println(i2);
        System.out.println("1为缴纳学费，2为查询学费，3为查询工资，0为结束:");
        o:
        for (int w = 0; w < 4; w++) {
            int i3 = in.nextInt();
            switch (i3) {
                case 1:
                    System.out.println(i2.jiao(g3));
                    break;
                case 2:
                    System.out.println("查询学费为:" + i2.cha(g3));
                    break;
                case 3:
                    System.out.println("查询工资为(每月工资税前)" + i1.fa(g4));
                    System.out.println("查询工资为(每月工资税后)" + (i1.fa(g4) - (i1.fa(g4) * 0.1) - 105));
                    System.out.println("查询工资为(年工资税后)" + ((i1.fa(g4) - (i1.fa(g4) * 0.1) - 105) * 9 - 2 * g3));
                    break;
                case 0:
                    break o;
            }
        }
    }
}
