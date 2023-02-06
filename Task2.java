import java.util.ArrayList;
import java.util.HashMap;


// Пусть дан список сотрудников:Иван Иванов и т.д.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

/**
 * Task2
 */
public class Task2 {

    public static void main(String[] args) {
        ArrayList<String> arr_first = new ArrayList<String>();
        ArrayList<String> arr_second = new ArrayList<String>();
        HashMap<String, Integer> hh = new HashMap<String, Integer>();

        arr_first.add("Петр Иванов");
        arr_first.add("Иван Иванов");
        arr_first.add("Коля Дятлов");
        arr_first.add("Петр Дятлов");
        arr_first.add("Иван Афанасьев");
        arr_first.add("Петр Петров");
        arr_first.add("Никита Петров");
        arr_first.add("Никита Афанасьев");
        arr_first.add("Никита Дятлов");
        arr_first.add("Никита Иванов");
        arr_first.add("Никита Тарасов");

        String res = "";
        int count = 0;

        for(int i = 0; i < arr_first.size(); i++)
        {
            res = arr_first.get(i).split(" ")[0];
            for(int j = 0; j < arr_first.size(); j++)
            {
                if(res.equals(arr_first.get(j).split(" ")[0])) count++;
            }
            hh.put(res, count);
            count = 0;
        }

        while(hh.size() != 0)
        {
            String n = " раз";
            String temp = "";
            String str = "";
            int num = 0;
            for(var entry: hh.entrySet())
            {
                if(num < entry.getValue())
                {
                    num = entry.getValue();
                    str = entry.getKey();
                }
            }
            hh.remove(str);

            for(int i = 0; i < arr_first.size(); i++)
            {
                temp = arr_first.get(i).split(" ")[0];
                if(temp.equals(str)) arr_second.add(arr_first.get(i));
            }
            if(num == 2 || num == 3 || num == 4) n = " разa";
            System.out.println("Имя " + str + " появляется -> " + num + n );

        }
        System.out.println(arr_first);
        System.out.println(arr_second);
    }
}