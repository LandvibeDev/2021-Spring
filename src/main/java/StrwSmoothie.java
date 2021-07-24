public class StrwSmoothie extends Smoothie{
    StrwSmoothie(){
        name = "딸기 스무디";
        isIce = true;
    }

    @Override
    public void putMilk() {
        super.putMilk();
    }

    public void putStrw(){
        System.out.println("딸기를 넣는다.");
    }

    @Override
    public void mixer() {
        super.mixer();
    }

    @Override
    public void putIngredients() {
        putMilk();
        putStrw();
        mixer();
        System.out.println();
    }//우유, 딸기, 믹서기 섞기
}
