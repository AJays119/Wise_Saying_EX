package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
        Scanner sc = new Scanner(System.in);

        String exit = "종료";
        String input = null;
        String insert = "등록";
        String catalog = "목록";

        ArrayList<WiseSaying> List = new ArrayList<>();


        long WiseSayingId = 0;
        long lastWiseSayingId = 0;


        System.out.println("== 명언 앱 ==");

        while ( true )
        {
            System.out.print("명령) ");
            input = sc.nextLine().trim();

            if (input.equals(insert))
            {
                long id = WiseSayingId + 1;
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String authorName = sc.nextLine().trim();

                WiseSaying wise = new WiseSaying(id, content, authorName);
                List.add(wise);

                WiseSayingId++;
                System.out.printf("%d번 명언이 등록 되었습니다.\n", id);
                lastWiseSayingId = id;
            }

            if (input.equals(catalog))
            {
                System.out.println("번호 | 작가 | 명언");
                System.out.println("-".repeat(30));

                for (int i = 0; i < List.size(); i++)
                {
                    WiseSaying wise = List.get(i);
                    System.out.printf("%d / %s / %s\n", wise.getId(), wise.getAuthorName(), wise.getContent());
                }
            }

            if (input.equals(exit))
            {
                sc.close();
                break;
            }
        }
    }
}

class WiseSaying
{
    private long id;
    private String content;
    private String authorName;
    public WiseSaying(long id, String content, String authorName)
    {
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    }

    public long getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }

    public String getAuthorName()
    {
        return authorName;
    }
}