import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o, Integer t1) {

            if(o==4|| t1==4)
            {
                return -1;
            }
            else if(o<100 || t1<100)
            {
               return o-t1;
            }
            else if(o>100||t1>100)
            {
                return t1-o;
            }

            return 0;
    }
}
