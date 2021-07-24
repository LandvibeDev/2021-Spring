public class YgrtSmoothie extends Smoothie{
    YgrtSmoothie(){
        name = "요거트 스무디";
        isIce = true;
    }

    @Override
    public void putMilk() {
        super.putMilk();
    }

    @Override
    public void mixer() {
        super.mixer();
    }

    public void putYgrt(){
        System.out.println("요거트를 넣는다");
    }

    @Override
    public void putIngredients() {
        putMilk();
        putYgrt();
        mixer();
        System.out.println();
    }//우유, 요거트, 믹서기
}
