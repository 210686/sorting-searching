import java.util.ArrayList;
public class Arrays{
    public static void main(String[] args){
        System.out.print("\f");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10;i++){list.add(random(1,100));}
        Sort sort = new Sort(list);
        list.clear();
        for(int i=0; i<10;i++){list.add(random(1,100));}
        Sorting sorting = new Sorting(list);
    }
    static int random(int min, int max){
        int range = (max - min) + 1;     
        return (int)(Math.random() * range) + min;
    }
}