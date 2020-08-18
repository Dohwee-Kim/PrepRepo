import com.fruits.*;

class FruitAndBoxFault2{
    public static void main(String[] args){
        Box aBox = new Box();
        Box oBox = new Box();

        // this is a mistake
        aBox.set("Apple");
        oBox.set("Orange");
        
    }
}