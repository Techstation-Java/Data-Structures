import java.util.Scanner;

public class Stack {
    int arr[];
    int top;
    int size;
    public Stack(int S){
        size = S;
        top=0;
        arr=new int[size];
    }
    public void push(int n){
        if(top == size) {
            System.out.println("Overflow");
        }
        else{
            arr[top++]=n;
        }
    }
    public int pop(){
        if(top==0){
            System.out.println("Underflow");
            return -999;
        }
        else{
            return arr[--top];
        }
    }
    public void display(){
        for(int i = top-1;i>=0; i--){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int s = sc.nextInt();
        Stack o1 = new Stack(s);
        Stack o2 = new Stack(s);
        int popped_value;
        int n = 1;
        while (n > 0) {
            System.out.print("Press 1 to Push,\nPress 2 to Pop,\nPress 3 to Display,\nPress 4 to Exit:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to be pushed:");
                    int value = sc.nextInt();
                    o1.push(value);
                    break;
                case 2:
                    popped_value = o1.pop();
                    System.out.println("Popped value = "+popped_value);
                    break;
                case 3:
                    o1.display();
                    break;
                case 4:
                    n = 0;
                    break;
                default:
                    System.out.print("Wring choice!");
                    n=0;
            }
        }
    }
}
