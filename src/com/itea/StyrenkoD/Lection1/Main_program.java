package com.itea.StyrenkoD.Lection1;

public class Main_program {

    public static void main(String[] args) {

        //Дмитрий Сатиренко;
        //ДЗ 1.1
        int aa = 3;
        System.out.println("Число аa="+aa+", "+ (aa%2==0?"Четное":"Нечетное"));
        int tmp;
        int a = 5;
        int b = 2;
        int c = 4;

        //ДЗ 1.2
        //1 check
        if (a>=b){
            tmp=a;
            a=b;
            b=tmp;
        }
        if (b>=c){
            tmp=b;
            b=c;
            c=tmp;
        }
        //2 check
        if (a>=b){
            tmp=a;
            a=b;
            b=tmp;
        }
        if (b>=c){
            tmp=b;
            b=c;
            c=tmp;
        }

        System.out.println(a+","+ b + ","+c);
    }
}
