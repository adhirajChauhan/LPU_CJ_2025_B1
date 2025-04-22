import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class collection_5_miniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> dq1 = new ArrayDeque<>();
        Deque<String> dq2 = new ArrayDeque<>();
        HashMap<String, String> pages = new HashMap<>();

        String currentPage = "";

        while(true){
            System.out.println("\n-----Browser Menu");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Show History");
            System.out.println("6. Exit");
            System.out.print("Choose an option : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 :
                    System.out.print("Enter the page title : ");
                    String title = sc.nextLine();
                    System.out.print("Enter the url : ");
                    String URL = sc.nextLine();
                    currentPage = title;

                    // dq1.push(title);
                    if(currentPage != null){
                        dq1.push(currentPage);
                        dq2.clear();
                    }

                    pages.put(title, URL);
                    System.out.println("Visited " + title);
                    break;

                case 2:
                    if(dq1.isEmpty()){
                        System.out.println("No pages to go back to");
                    }
                    else{
                        dq2.push(currentPage);
                        currentPage = dq1.pop();
                        System.out.println("Went back to : " + currentPage);
                    }
                    break;

                case 3 :
                    if(dq2.isEmpty()){
                        System.out.println("No pages to go forward to.");
                    }
                    else{
                        dq1.push(currentPage);
                        currentPage= dq2.pop();
                        System.out.println("Went forward to : " + currentPage);
                    }
                    break;

                case 4 :

                    if(currentPage==null){
                        System.out.println("No page to show");
                    }
                    else{
                        System.out.println("Current page : " + currentPage + "(" + pages.get(currentPage) + ")");
                    }
                    break;

                case 5 :
                    System.out.println("Dq1 : " + dq1);
                    System.out.println("Dq2 : " + dq2);
                    break;

                case 6 :
                System.out.println("Exiting...");
                return;

                default:
                System.out.println("Invalid choice");

            }

        }
    }
}
