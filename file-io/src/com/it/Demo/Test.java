package com.it.Demo;

public class Test {
    public static int totalNumber;//总酒数
    public static  int lastBottleNumber;
    public static  int lastCoverNumber;


    public static void main(String[] args) {
        //啤酒问题，递归
        //啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，10元可以喝到多少瓶？
        buy(10);
        System.out.println("总瓶数"+totalNumber);
        System.out.println("剩余盖子"+lastCoverNumber);
        System.out.println("剩余瓶子"+lastBottleNumber);




    }

    private static void buy(int money) {
        //先用现金买
        int buyNumber =money /2;
        totalNumber += buyNumber;
        //把盖子和瓶子换算成钱
        int allBottleNumber=buyNumber+lastBottleNumber;
        int allCoverNumber=buyNumber+lastCoverNumber;

        int allMoney=0;
        if(allBottleNumber>=2){
            allMoney+=(allBottleNumber/2)*2;
        }
        lastBottleNumber=allBottleNumber%2;
        if(allCoverNumber>=4){
            allMoney+=(allCoverNumber/4)*2;
        }
        lastCoverNumber=allCoverNumber%4;
        if(allMoney>=2){
            buy(allMoney);
        }
    }
}
