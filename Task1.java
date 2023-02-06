import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hh = new HashMap<>();
        HashSet<String> states = new HashSet<String>();
        boolean flag = true;

        while(flag){
            System.out.println("Введите фамилию, номер телефона (через пробел)");
            String[] str = sc.nextLine().split(" ");
            if(str.length == 1)
            {
                System.out.println("Вы не ввели номер телефона!");
            }
            else
            {
                hh.put(str[1], str[0]);
            }
            System.out.println("Выйти -> n, Продолжить -> Любая другая клавиша.");
            if(sc.nextLine().charAt(0) == 'n') flag = false;
        }
        
        String res = "";

        for(var value: hh.values()) states.add(value);

        for (var entry : states) {
            res += "Фамилия: " + entry;
            for(var key: hh.entrySet())
            {
                if(key.getValue().equals(entry)) res += " Номер: " + key.getKey();              
            }
            System.out.println(res);
            res = "";
        }
        sc.close();
    }
}