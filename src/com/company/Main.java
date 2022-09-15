package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String str = sc.next();
        char j;
        Character[] charArray = new Character[str.length()];
        Character[] charArrayToUpper = new Character[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        for (int i = 0; i < charArray.length; i++) {
            j = 0;
            if (Character.isLowerCase(charArray[i])){
                if (i == 0){
                    j = Character.toUpperCase(charArray[i]);
                    charArrayToUpper[i] = j;
                } else if(Character.isUpperCase(charArray[i - 1]) && Character.isLowerCase(charArray[i])){
                    charArrayToUpper[i] = j;
                } else if(Character.isUpperCase(charArray[i - 1]) && Character.isUpperCase(charArray[i])){
                    j = Character.toLowerCase(charArray[i]);
                    charArrayToUpper[i] = j;
                }
            }else if(Character.isUpperCase(charArray[i]) && i > 0){
                if (Character.isUpperCase(charArray[i - 1]) && Character.isUpperCase(charArray[i])){
                    j = Character.toLowerCase(charArray[i]);
                }
            }


        }
        for (int k = 0; k < charArrayToUpper.length; k++) {
            System.out.print(charArrayToUpper[k]);
        }
        /*System.out.print("Введите текст\n");
        System.out.println("Чтобы выйти введите Exit");
        System.out.println(" 1 : " + str);
        while (true) {
            if (!sc.next().equals("Exit")) {
                list.add(sc.next());
            } else {
                break;
            }
        }

        for (String stringFromList : list) {
            str += stringFromList;
        }*/



    }
}


//**********************************************************************************
//0009 acmp.ru  решено
/*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int min = 100;
        int max = -100;
        int maxValueIndex = 0;
        int minValueIndex = 0;
        int sum = 0;
        int multiply = 1;
        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxValueIndex = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minValueIndex = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (maxValueIndex > minValueIndex) {
                while (minValueIndex < maxValueIndex - 1) {
                    multiply *= array[minValueIndex + 1];
                    minValueIndex++;
                }
            } else if (maxValueIndex < minValueIndex) {
                while (maxValueIndex < minValueIndex - 1) {
                    multiply *= array[maxValueIndex + 1];
                    maxValueIndex++;
                }
            }
        }
        System.out.print(sum + " " + multiply);*/
//**********************************************************************************
    /*new Main().run();
    }
    void solve (Scanner sc, PrintWriter out){

        int a = sc.nextInt();
        int b = sc.nextInt();
        out.print(a+b);
    }

    public void run(){
        //Запись и чтение файла
        try {
            Scanner sc = new Scanner(new FileReader("sum.in"));
            PrintWriter out = new PrintWriter(new FileWriter("sum.out"));

            solve(sc,out);
        } catch (IOException e) {
            throw new Error(e);
        }
    }*/
//**********************************************************************************
//71A Codeforces решено
/*
Scanner sc = new Scanner(System.in);

    String str;
    int a = sc.nextInt();
    int count = 0;
    String [] b = new String[a];

        for (int i = 0; i < b.length; i++) {
        b[i] =  sc.next();
        }
        for (int i = 0; i < b.length; i++) {
        str = b[i];
        if (str.length() > 10) {
        count = 0;
        for (int j = 0; j < str.length(); j++) {
        count++;
        }
        count -= 2;
        System.out.println(str.charAt(0) + "" + count + "" + str.charAt(str.length() - 1));
        }else{
        System.out.println(b[i]);
        }
        }*/
//**********************************************************************************
//231A Codeforces решено
    /*Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int count;
    int countOfSolution = 0;
    List<Answers> b = new ArrayList<>();

        for (int i = 0; i < a; i++) {
        b.add(new Answers(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        for ( Answers ads : b ) {
        count = 0;
        if (ads.getA() == 1){
        count++;
        }
        if (ads.getB() == 1){
        count++;
        }
        if (ads.getC() == 1){
        count++;
        }
        if (count > 2 || count == 2){
        countOfSolution++;
        }
        }
        System.out.println(countOfSolution);

        }

public static class Answers{

    private int a;
    private int b;
    private int c;

    public Answers(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
}*/
//**********************************************************************************
//158A Codeforces
/*
Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] b = new int[n];
    int count = 0;
    int num = 0;
    boolean abc = false;

        for (int i = 0; i < b.length; i++) {
        b[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
        if (b[i] == 0) {
        num++;
        }
        if (num == b.length) {
        abc = true;
        }
        }
        for (int i = 0; i < b.length; i++) {
        if (b[k - 1] == 0 && b[i] == 0){
        continue;
        }else{
        if (b[i] >= b[k - 1]) {
        count++;
        }
        }
        }

        if (abc) {
        count = 0;
        System.out.println(count);
        } else {
        System.out.println(count);
        }*/
//**********************************************************************************