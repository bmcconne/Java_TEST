import org.junit.Test;

public class FloydAlgo {
    /**
     * only Work if single number in array has duplicates
     * @Author Pranjal Dubey
     */
    public int find_duplicate(int[] arr){
        if(arr.length > 0){
        int slow = 0;
        int fast =0;
        int duplicate_no = 0;
        while(true){
            slow = arr[slow];
            fast = arr[arr[fast]];
            if(slow == fast){
                break;
            }
        }
        int slow2=0;
        while(true){
            slow = arr[slow];
            slow2 = arr[slow2];
            if(slow == slow2){
             duplicate_no = slow;
                break;
            }
        }
        return duplicate_no;
    }
    return -1 ;
    }
}