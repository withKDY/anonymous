package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try {
//            int x, y, z;
//            Scanner in = new Scanner(System.in);
//
//            System.out.print("x를 입력하세요 : ");
//            x = in.nextInt();
//
//            System.out.print("y를 입력하세요 : ");
//            y = in.nextInt();
//
//            System.out.print("z를 입력하세요 : ");
//            z = in.nextInt();
//
//            Set<Integer> set = new HashSet<>(), paramSet = new HashSet<>(Arrays.asList(x, y, z));
//            int i, setSize;
//            List list =  new ArrayList<>();
//
//            for (Integer num : paramSet)
//                if (num > 45)
//                    paramSet.remove(num);
//
//            paramSet.removeAll(Collections.singleton(0));
//            list.addAll(paramSet);
//
//            i = list.size();
//            setSize = set.size();
//
//
//            while (i < 6) {
//                set.add((int) (Math.random() * 45) + 1);
//                if (setSize != set.size()) {
//                    setSize = set.size();
//                    i++;
//                }
//            }

//            set.forEach(list::add);
//            list.addAll(set);
//
//            Collections.sort(list);
//            System.out.println(list);
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

            Integer numberList [] = {1, 2, 3, 4, 5};

            List<Integer> list = Arrays.stream(numberList).distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());

            System.out.println(list);
            Runnable r = () -> {
                System.out.println("stream 연습 중");
            };
            Thread.sleep(1000);

            r.run();

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private interface MyFunction { // 함수형 인터페이스
        int calc(int x, int y); // 추상 메소드
    }
}
