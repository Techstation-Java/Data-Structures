import java.util.*;

public class Queue {
    int arr[];
    int front,rear,capacity;
    public Queue(int c){
        capacity=c;
        front = rear = 0;
        capacity = c;
        arr = new int[capacity];
    }
    public void addRear(int n){
        if(rear == capacity){
            System.out.println("Overflow Error");
        }
        else {
            arr[rear++] = n;
        }
    }
    public int delFront(){
        if(rear == front){
            return -999;
        }
        else{
            return arr[front++];
        }
    }
    public void display(){
        for(int i=front; i<rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity: ");
        int c = sc.nextInt();
        Queue Obj = new Queue(c);
        boolean flag = true;
        while (flag) {
            System.out.print("Press 1 to Enqueue,\nPress 2 to Dequeue,\nPress 3 to Display,\nPress 4 to Exit:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value: ");
                    int value = sc.nextInt();
                    Obj.addRear(value);
                    break;
                case 2:
                    int delVal = Obj.delFront();
                    if (delVal == -999) {
                        System.out.println("Underflow Error");
                    } else {
                        System.out.println("Deleted value: " + delVal);
                        break;
                    }
                case 3:
                    Obj.display();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Value Entered!");
            }
        }
    }
}
