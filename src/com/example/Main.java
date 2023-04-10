package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
//            int x, y;
//            Scanner in = new Scanner(System.in);
//
//            System.out.print("x를 입력하세요 : ");
//            x = in.nextInt();
//
//            System.out.print("y를 입력하세요 : ");
//            y = in.nextInt();
//
//            MyFunction mf1 = (a, b) -> a + b;
//            MyFunction mf2 = (a, b) -> a - b;
//            MyFunction mf3 = (a, b) -> a * b;
//            MyFunction mf4 = (a, b) -> a / b;
//
//            System.out.println(mf1.calc(x, y));
//            System.out.println(mf2.calc(x, y));
//            System.out.println(mf3.calc(x, y));
//            System.out.println(mf4.calc(x, y));

            Set<Integer> set = new HashSet<>();
            List list =  new ArrayList<>();

            int i = 0, setSize = set.size();

            while (i < 6) {
                set.add((int) (Math.random() * 45) + 1);
                if (setSize != set.size()) {
                    setSize = set.size();
                    i++;
                }
            }

//            set.forEach(list::add);
            list.addAll(set);

            Collections.sort(list);
            System.out.println(list);


            Thread.sleep(1000);

            Runnable r = () -> {
                System.out.println("로또 번호");
            };

            r.run();

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private interface MyFunction { // 함수형 인터페이스
        int calc(int x, int y); // 추상 메소드

    }
}
