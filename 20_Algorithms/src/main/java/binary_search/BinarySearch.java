package binary_search;

import java.util.ArrayList;

public class BinarySearch
{
    private ArrayList<String> list;

    public BinarySearch(ArrayList<String> list)
    {
        if (list.size() == 0){
            Exception ex = new Exception("Пустой массив");
            ex.printStackTrace();
        } else
        this.list = list;
    }

    public int search(String query)
    {
        if (list != null) {
            return search(query, 0, list.size() - 1);
        } else{
            Exception ex = new Exception("Нет значений в массиве");
            ex.printStackTrace();
            return -1;
        }
    }

    private int search(String query, int from, int to) {
        int middle = (from + to) / 2;

        if (to < from) {
            return -1;
        }

        int comparsion = query.compareTo(list.get(middle));

        if (comparsion == 0) {
            return middle;
        } else if (comparsion < 0) {
            return search(query, from, middle - 1);
        } else {
            return search(query, middle + 1, to);
        }
    }
}
