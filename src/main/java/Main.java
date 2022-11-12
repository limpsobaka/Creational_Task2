import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Logger logger = Logger.getInstance();
    logger.log("Запускаем программу");
    logger.log("Просим пользователя ввести входные данные для списка");
    System.out.print("Введите размер списка: ");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.print("Введите верхнюю границу для значений: ");
    int M = sc.nextInt();
    logger.log("Создаём и наполняем список");
    List<Integer> list = new ArrayList<>();
    while (list.size() < N) {
      list.add((int) (Math.random() * M));
    }
    System.out.print("Вот случайный список: ");
    list.forEach(i -> System.out.print(i + " "));
    System.out.println();
    logger.log("Просим пользователя ввести входные данные для фильтрации");
    System.out.print("Введите порог для фильтра: ");
    int f = sc.nextInt();
    logger.log("Запускаем фильтрацию");
    Filter filter = new Filter(f);
    List<Integer> filteredList = filter.filterOut(list);
    logger.log("Прошло фильтр " + filteredList.size() + " элемента из " + list.size());
    logger.log("Выводим результат на экран");
    System.out.print("Отфильтрованный список: ");
    filteredList.forEach(i -> System.out.print(i + " "));
    System.out.println();
    logger.log("Завершаем программу");
  }
}
