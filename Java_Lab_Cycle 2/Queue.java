import java.util.*;

public class Queue{

  static Scanner sc = new Scanner(System.in);
  static int  n, front = -1, rear = -1, item;
  static int[] Ar = new int[10];
  
  Queue(){
    System.out.printf("\t\t\t\t\t\tQueue\n");
  }
  
  Queue(int n){
    int ch;
    do
      {
      System.out.printf("\n----Operations Menu----\n\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
      System.out.printf("Enter the choice#:");
      ch=sc.nextInt();
        switch (ch)
        {
        case 1:
          enqueue(n);
          break;
        case 2:
          dequeue();
          break;
        case 3:
          display();
          break;
        default:
          break;
        }
      } while (ch < 4);
  }
    
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    int n;
    Queue q = new Queue();
    System.out.printf("\nEnter the size of Queue:");
    n=sc1.nextInt();
    new Queue(n);
  }
  
  //Function To Insert Element To Queue
  public static void enqueue(int n)
  {
    if (rear >= n - 1)
    {
      System.out.println("\n---Overflow!!!---\n\n");
    }
    else
    {
      if (front == -1 && rear == -1)
      {
        front++;
      }
      System.out.println("Enter the element to be inserted:");
      item= sc.nextInt();
      rear++;
      Ar[rear] = item;
    }
  }
  
  //Function To Delete Element In Queue
  public static void dequeue ()
  {
    if (front == -1)
    {
      System.out.println("\n---Error! Underflow!!!---\n\n");
    }
    else
    {
      item = Ar[front];
      System.out.printf("The element deleted is %d\n", item);
      if (front == rear)
      {
        front = -1;
        rear = -1;
        System.out.printf("\n---Error! Queue is empty---\n\n");
      }
      else
      {
        front++;
        display();
      }
    }
  }
  
  //Function To Display Elements In Queue
  public static void display()
  {
    int i;
    System.out.printf("\nThe current Queue is\n");
    for (i = front; i <= rear; i++)
    {
      System.out.printf("%d ", Ar[i]);
    }
    System.out.printf("\n");
  }
}