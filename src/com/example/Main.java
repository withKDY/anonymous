package com.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

            /**
             .count()

             배열, 컬렉션 크기 확인



             .sorted()

             정렬



             .sorted(Comparator.reverseOrder())

             역정렬



             .findFirst()

             스트림의 처음 값 가져오기



             .skip(배열크기 - 1).findFirst()

             스트림의 마지막 값 가져오기



             .skip(값)

             값의 인덱스까지 생략하고 나머지를 가져옴



             .limit(값)

             값의 인덱스까지 가져옴



             .distinct()

             중복 생략



             .max(데이터타입::compare)

             최대값



             .min(데이터타입::compare)

             최소값



             .average()

             평균

             * */

            Integer numberList [] = {1, 2, 3, 4, 5};

            List<Integer> list = Arrays.stream(numberList).distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());

            System.out.println(Arrays.stream(numberList).count());

            // 람다 활용 map 예제

            Map<String, Object> map = new HashMap<>();
            map.put("apple", "apple");
            map.put("ture", true);
            map.put("false", false);
            map.put("number", 100);

            map.forEach((name, e) -> {
                if (e instanceof Integer) {
                    System.out.println("숫자 = " + e);
                    list.add((Integer) e);
                } else if (e instanceof  String) {
                    System.out.println("문자 = " + e);
                } else if (e instanceof Boolean) {
                    System.out.println("참거짓 = " + e);
                } else {
                    System.out.println("그외 = " + e);
                }

            });

            System.out.println(list);

            List<String> strList = new ArrayList<>();

            list.forEach(e -> strList.addAll(Collections.singleton(e.toString())));

            System.out.println(String.join("", strList));

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
