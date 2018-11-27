import java.util.ArrayList;
public class Sorting{ //bubble
    public Sorting(ArrayList<Integer> input){
        for(int i=1;i<=input.size();i++){
            int count=0;
            System.out.println(input);
            for(int j=0; j<input.size()-i;j++){
                int num1 = input.get(j);
                int num2 = input.get(j+1);
                if(num1>num2){
                    input.set(j,num2);
                    input.set(j+1,num1);
                    count++;
                }
            }
            if(count==0){break;}
        }
        System.out.println(input);
    }
}