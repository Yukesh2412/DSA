package searching.linearsearch;
import java.util.List;
import java.util.ArrayList;
public class LinearSearch {
    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>(List.of(1,2,3));

        for(int i:arr){
            if(1==i){
                System.out.println("yes");
                break;
            }
        }




    }
}
