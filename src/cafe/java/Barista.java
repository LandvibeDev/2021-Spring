class Barista{
    Drink order(MenuItem menu) { //order 자체가 프린트
        String name=menu.getName();
        Drink drink=new Drink(name);
        if(name.contains("아메리카노"))
        {

            System.out.println("1. 물을 넣는다.\r\n"
                    + "2. 에스프레소를 넣는다.\r\n"
                    + "3. (ice) 얼음을 넣는다.");
        }
        else if(name.contains("카페 라떼")) {

            System.out.println("1. 우유를 넣는다.\r\n"
                    + "2. 에스프레소를 넣는다.\r\n"
                    + "3. (ice) 얼음을 넣는다.");
        }
        else if(name.contains("바닐라 라떼")) {
            System.out.println("1. 우유를 넣는다.\r\n"
                    + "2. 에스프레소를 넣는다.\r\n"
                    + "3. 바닐라 시럽을 넣는다.\r\n"
                    + "4. (ice) 얼음을 넣는다.");
        }
        else if(name.contains("딸기 스무디")) {
            System.out.println("1. 우유를 넣는다.\r\n"
                    + "2. 딸기를 넣는다.\r\n"
                    + "3. 믹서기를 이용해 섞는다.");
        }
        else if(name.contains("요거트 스무디")){
            System.out.println("1. 우유를 넣는다.\r\n"
                    + "2. 요거트를 넣는다.\r\n"
                    + "3. 믹서기를 이용해 섞는다.");
        }
        else if(name.contains("아이스티")) {
            System.out.println("1. 물을 넣는다.\r\n"
                    + "2. 아이스티 분말을 넣는다.\r\n"
                    + "3. 얼음을 넣는다.");
        }
        return drink;
    }

}