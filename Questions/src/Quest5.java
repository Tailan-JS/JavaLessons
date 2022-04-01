import java.util.ArrayList;

public class Quest5 {
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private int pares(int n){
        if ( n < 1)
            return n;
        else{
            if (n%2 == 0 )
                list.add(n);

            return pares(n-1);
        }
    }

    //showing the array
    private void show(int n){
        Quest5 quest5 = new Quest5();
        quest5.pares(n);
        for ( int i = quest5.list.size()-1; i >= 0;i--)
            System.out.print(quest5.list.get(i) + "\t");
    }
    public static void main(String[] args) {
        Quest5 quest5 = new Quest5();

        quest5.show(42);
    }
}
