package hello.core.singletone;

public class StatefulService {

//    private int price; // 샅애를 유지하는 필드

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
        return price;
    }

//    public int getPrice(){
//        return price;
//    }
}
