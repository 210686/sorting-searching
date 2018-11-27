import java.util.ArrayList;
public class Sort{ //insertion
    public Sort(ArrayList<Integer> input){
        int search = input.get(random(0,input.size()));
        for(int i=0;i<input.size();i++){
            System.out.println(input);
            
            int minimum = input.get(i);
            for(int j=i+1;j<input.size();j++){
                if(minimum > input.get(j)){minimum=input.get(j);}
            }
            input.remove(input.indexOf(minimum));
            input.add(i,minimum);
        }
        for(int i=0;i<input.size();i++){
            if(search == input.get(i)){
                System.out.println(""+search+" is the "+(i+1)+"th element"); 
                break;
            }
        }
    }
    int random(int min, int max){
        int range = (max - min) + 1;     
        return (int)(Math.random() * range) + min;
    }
}