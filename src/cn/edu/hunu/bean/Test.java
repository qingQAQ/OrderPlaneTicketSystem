package cn.edu.hunu.bean;

public class Test {
    public static void main(String[] args) {
        int a[]={1,2,3};
        m1(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void m1(int b[]){
        b[2]=88;
    }
}
