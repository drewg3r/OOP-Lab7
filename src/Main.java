import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        PresentComponent candy = new Candy(0.1, 100, false);
        PresentComponent jelly = new Jelly(0.15, 230, false);
        PresentComponent liteChocolateSweets = new ChocolateSweets(0.1, 30, 300, false);
        PresentComponent normalChocolateSweets = new ChocolateSweets(0.2, 50, 300, false);
        PresentComponent extraChocolateSweets = new ChocolateSweets(0.3, 95, 300, false);
        PresentComponent oatmealCookie = new OatmealCookie(0.3, 200, false, false);
        PresentComponent bisquitCookie = new BisquitCookie(0.2, 240, false);
        PresentComponent vanilaWaffle = new VanilaWaffle(0.18, 230, false);

        PresentComponent[] presentComponents = new PresentComponent[]{candy, jelly, liteChocolateSweets, normalChocolateSweets, extraChocolateSweets, oatmealCookie, bisquitCookie, vanilaWaffle};

        MySet mySet = new MySet(presentComponents);

        Iterator<PresentComponent> myIterator = mySet.iterator();
        System.out.println(myIterator.hasNext());
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
