package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Sol1 sol1 = new Sol1();
        sol1.run();
    }
}

class Sol1
{
    public void run()
    {
        int i = 0; //명언 번호
        int j = 0; //리스트 숫자
        int a = 0; //배열 갯수
        int b = 1; //리스트 불러올 갯수

        String exit = "종료";
        String input = null;
        String input2 = null;
        String insert = "등록";
        String catalog = "목록";

        ArrayList<String> List = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        System.out.println("== 명언 앱 ==");
        System.out.println("등록 | 목록 | 종료");

        while ( true )
        {
            System.out.print("명령) ");
            input = sc.nextLine();

            if (input.equals(insert))
            {
                System.out.print("명언 : ");
                input = sc.nextLine();

                if (input != null)
                {
                    System.out.print("작가 : ");
                    input2 = sc.nextLine();

                    i++;
                    j++;

                    System.out.println(i + "번 명언이 등록 되었습니다.");
                }
            }

            if (input.equals(catalog))
            {
                System.out.println("------------------------------");

                for (b = 1; b <= List.size(); b++)
                {
                    System.out.println(b + " / " + List.get(b));
                }

            }

            if (input.equals(exit))
            {
                sc.close();
                break;
            }

            List.add(input + " / " + input2);
        }
    }
}