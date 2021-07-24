public class Smoothie extends Drink{
    Smoothie(){
        name = "스무디";
        isIce = true; //안 쓰는 변순데 초기화 해줘야하는지
    }

    public void putMilk(){
        System.out.println("우유를 넣는다.");
    }

    public void mixer(){
        System.out.println("믹서기를 이용해 섞는다.");
    }

    @Override
    public void putIngredients() { //얘는 상속받아서 안씀. 그래도 오버라이딩 할 필요 있는지
        putMilk();
        mixer();
        System.out.println();
    }//우유, 믹서
}
