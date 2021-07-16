package Cafe;

import java.util.Scanner;

public class Customer {
    public int selectMenu() {

        System.out.println("메뉴를 골라주세요.");
        Scanner in = new Scanner(System.in);
        String choose = in.nextLine();

        if(choose.contains("아메리카노"))
        {
            if(choose.contains("아이스"))
                return 1;
            return 0;
        }
        else if(choose.contains("카페 라떼"))
        {
            if(choose.contains("아이스"))
                return 3;
            return 2;
        }
        else if(choose.contains("바닐라 라떼"))
        {
            if(choose.contains("아이스"))
                return 5;
            return 4;
        }
        else if(choose.contains("딸기"))
        { return 6;
        }
        else if(choose.contains("요거트"))
        { return 7;
        }
        else if(choose.equals("아이스티"))
        { return 8;
        }
        System.out.println("없는 메뉴 입니다.");
        return -1;
    }
}
