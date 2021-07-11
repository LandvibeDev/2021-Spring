import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Drink{
    String name;                    // 제품명
    String type;                    // 종류
    String[] ingredient;            // 재료
    void printHowToMake()
    {
        System.out.println(name+" 제조법");
        for(int i=0;i<ingredient.length;i++)
        {
            System.out.println((i+1)+". " + ingredient[i] + " 을(를) 넣는다.");
        }
        if(type.equals("스무디"))
            System.out.println((ingredient.length+1) +". 믹서기를 이용해 섞는다.");
    }
}

public class CoffeeShop {
    public static List<String> ingredientList = new ArrayList<>();
    public static List<String> typeList = new ArrayList<>();
    public static List<String> menuList = new ArrayList<>();
    public static List<Drink> drinkList = new ArrayList<>();

    // 메뉴 저장하기
    public static void setMenu(String name,String type,String[] ingredients)
    {
        Drink drink = new Drink();
        drink.name = name;
        drink.type = type;

        if(!typeList.contains(drink.type))
            typeList.add(drink.type);
        if(menuList.isEmpty())
            menuList.add(drink.name);
        else if(!menuList.contains(drink.name))
            menuList.add(drink.name);
        for(int i=0;i<ingredients.length;i++)
        {
            if(ingredientList.isEmpty())
                ingredientList.add(ingredients[i]);
            else if(!ingredientList.contains(ingredients[i]))
                ingredientList.add(ingredients[i]);
        }
        drink.ingredient = ingredients;
        drinkList.add(drink);
    }
    // 메뉴 목록 보여주기
    public static void showMenu()
    {
        System.out.println();
        String curType;
        for(int i=0;i<typeList.size();i++)          // type 별로 분류
        {
            curType = typeList.get(i);
            System.out.println("<"+curType+">");
            for(int j=0;j<drinkList.size();j++)     // 음료 list에서 type에 맞는것으로
            {
                if(drinkList.get(j).type.equals(curType))
                    System.out.println("* "+ drinkList.get(j).name);
            }
        }
    }
    // 질문 답변 (재료, 종류, 포함여부 확인)
    public static void answerTheQuestion(String material,String type,boolean yn)
    {
        boolean isExist = false;
        boolean flag = false;
        if(type.equals("음료"))           // 음료로 질문할땐, 모든 음료 확인
            flag= true;
        for(int i=0;i<drinkList.size();i++)
        {
            Drink tmp = drinkList.get(i);
            if(flag) {
                if(typeList.contains(material) && tmp.type.equals(material)) {
                    if(yn) {
                        isExist = true;
                        System.out.println("* " + tmp.name);
                    }
                    else
                        continue;
                }
                else if(Arrays.asList(tmp.ingredient).contains(material)) {
                    if(yn) {
                        isExist = true;
                        System.out.println("* "+tmp.name);
                    }
                    else
                        continue;
                }
                else {
                    if(!yn) {
                        isExist = true;
                        System.out.println("* "+tmp.name);
                    }
                }
            }
            else if(tmp.type.equals(type) && Arrays.asList(tmp.ingredient).contains(material)) {
                if(yn) {
                    isExist = true;
                    System.out.println("* " + tmp.name);
                }
                else
                    continue;
            }
            else {
                if(!yn) {
                    isExist = true;
                    System.out.println("* "+tmp.name);
                }
            }
        }
        if(!isExist)
            System.out.println("없습니다.");
    }

    public static void manual()
    {
        System.out.println("메뉴 확인 : 메뉴");
        System.out.println("제조법 확인 : [메뉴명]");
        System.out.println("예시 : 바닐라라떼(ICE) --> (ICE/HOT)여부까지 정확하게 입력해 주세요!");
        System.out.println("문의 리스트 : [재료 혹은 종류]가 들어가는(들어가지 않는) [음료 혹은 종류]");
        System.out.println("예시 : 우유가 들어가는 커피");
        System.out.println("종료 : 수고하세요");
    }

    // 메뉴 입력
    public static void init()
    {
        typeList.add("음료");

        String[] strings = {"물","에스프레소","얼음"};
        setMenu("아메리카노(ICE)","커피",strings);
        strings = new String[]{"물", "에스프레소"};
        setMenu("아메리카노(HOT)","커피",strings);
        strings = new String[]{"우유", "에스프레소","얼음"};
        setMenu("카페라떼(ICE)","커피",strings);
        strings = new String[]{"우유", "에스프레소"};
        setMenu("카페라떼(HOT)","커피",strings);
        strings = new String[]{"우유", "에스프레소","바닐라 시럽","얼음"};
        setMenu("바닐라라떼(ICE)","커피",strings);
        strings = new String[]{"우유", "에스프레소","바닐라 시럽"};
        setMenu("바닐라라떼(HOT)","커피",strings);

        strings = new String[]{"우유", "딸기"};
        setMenu("딸기 스무디","스무디",strings);
        strings = new String[]{"우유", "요거트"};
        setMenu("요거트 스무디","스무디",strings);

        strings = new String[]{"물", "아이스티 분말","얼음"};
        setMenu("아이스티","주스",strings);
    }

    public static void main(String[] args) {
        String command = "";
        Scanner scanner = new Scanner(System.in);
        init();
        manual();
        while(true)
        {
            System.out.println();
            System.out.println("=>무엇을 도와드릴까요?");
            command = scanner.nextLine();
            String piece[] = command.split(" ");
            if(command.equals("메뉴"))
                showMenu();
            else if(command.equals("수고하세요")) {
                System.out.println("또 오세요!");
                break;
            }
            else
            {
                if(menuList.contains(command))
                {
                    int index=0;
                    boolean flag = false;
                    for(int i=0;i<drinkList.size();i++)
                        if(drinkList.get(i).name.equals(command))
                        {
                            flag = true;
                            index = i;
                        }
                    if(flag)
                        drinkList.get(index).printHowToMake();
                }
                else
                {
                    String material = piece[0].substring(0,piece[0].length()-1);
                    if(piece.length == 2)       // 재료 + 타입
                    {
                        material = piece[0];
                        String type = piece[1];
                        if((typeList.contains(material) || ingredientList.contains(material)) && typeList.contains(type))
                            answerTheQuestion(material,type,true);
                        else
                            System.out.println("없습니다.");
                    }
                    else if(piece.length == 3 && piece[1].equals("들어가는"))   // 재료(타입) 이 들어가는 음료(타입)
                    {
                        String type = piece[2];
                        if((typeList.contains(material) || ingredientList.contains(material)) && typeList.contains(type))
                            answerTheQuestion(material,type,true);
                        else
                            System.out.println("없습니다.");
                    }
                    else if(piece.length == 4 && piece[1].equals("들어가지") && piece[2].equals("않는"))  // 재료(타입) 이 들어가지 않는 음료(타입)
                    {
                        String type = piece[3];
                        if(typeList.contains(type))
                            answerTheQuestion(material,type,false);
                        else
                            System.out.println("없습니다.");
                    }
                    else
                    {
                        System.out.println("잘못된 입력입니다.");
                        manual();
                    }
                }
            }
        }

    }
}
