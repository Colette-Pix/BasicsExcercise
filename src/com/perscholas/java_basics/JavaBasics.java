package com.perscholas.java_basics;

public class JavaBasics {
    public static void main(String[] args) {
        int int1=1;
        int int2=2;
        double double1=9.9;
        double double2=0.09;
        printSum(int1,int2);
        printSum(double1,double2);
        printSum(int1,double2); //this will print a double
        printQuotient(double1,double2);
        printQuotient();
        cutInHalf(5);
        makeSale();
    }

    public static void printSum(int addend1, int addend2){
        System.out.println(addend1+addend2);
    }

    public static void printSum(double addend1, double addend2){
        double sum = addend1+addend2;
        System.out.println(sum);
    }

    public static void printSum(int addend1, double addend2){
        double sum = addend1+addend2;
        System.out.println(sum);
    }

    public static void printQuotient(double numerator,double denominator) {
            System.out.println(numerator / denominator);
            int result = (int) (numerator / denominator);
            System.out.println(result);

    }

    public static void printQuotient (){
        int y=5;
        int x=6;
        double q = y/x;
        System.out.println(q);
        q = (double) y;
        System.out.println(q);
    }

    public static void cutInHalf(double numerator){
        final double denominator = 2;
        System.out.println(numerator/denominator);
    }

    public static void makeSale(){
        float coffee = 3.00f;
        float tea = 2.50f;
        float milk = 500.01f;
        float subtotal;
        float totalSale;
        subtotal=coffee*3f+tea*4f+milk*2f;
        final float SALES_TAX = .20f;
        totalSale = subtotal+subtotal*SALES_TAX;
        System.out.println(totalSale);
    }

}