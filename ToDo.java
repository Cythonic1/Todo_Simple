import java.util.*;

public class ToDo{
    public static void main(String[] argc){
        int choice = -1;
        ArrayList<String> todo = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(choice != 0){
            System.out.println("Press 1 to add todo");
            System.out.println("Press 2 to make as compelete <todo number>");
            System.out.println("Press 3 to delete todo");
            System.out.println("Press 4 to list todos");
            System.out.println("Press 0 to exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine(); // To clear the scanner.
            System.out.println("----------------------------------------------------");
            switch(choice){
                case 1: 
                    System.out.println("Enter The todo");    
                    String  newTodo = scanner.nextLine();
                    todo.add(newTodo + " Not comp");
                    System.out.println("---------------Task Added--------------");
                    break;
                case 2:
                    System.out.println("Enter the todo number");
                    int todonumber = scanner.nextInt();
                    scanner.nextLine();
                    String original = todo.get(todonumber - 1);
                    String updated = original.replace("Not comp", "comp");
                    todo.set(todonumber - 1, updated);
                    System.out.println("---------------Task updated--------------");
                    break;
                case 3:
                    System.out.println("Enter the todo number");
                    int todonumber1 = scanner.nextInt();
                    scanner.nextLine();
                    todo.remove(todonumber1 - 1);
                    System.out.println("---------------Task Removed--------------");
                    break;
                case 4:
                    for(int i = 0 ; i < todo.size() ; i++){
                        System.out.println(i+1 + ": " + todo.get(i));
                        System.out.println("----------------------------------------");
                }
                    break;

            }
        }
    }
}
