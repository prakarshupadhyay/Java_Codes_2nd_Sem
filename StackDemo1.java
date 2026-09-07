public class StackDemo1 {
    public static void main(String[] args) {
        class Stack {
            int arr[];
            int tos;
            Stack(){
                arr = new int[5];
                tos = -1;
            }
            void push(int x){
                if(tos >= arr.length - 1){
                    System.out.println("Stack Overflow");
                } else {
                    arr[++tos] = x;
                }
            }
            int pop(){
                if (tos <= -1) {
                    System.out.println("Stack Underflow");
                    return 0;
                } else {
                    return arr[tos--];
                }
            }
            int peek(){
                if (tos <= -1) {
                    System.out.println("Stack is empty");
                    return 0;
                } else {
                    return arr[tos];
                }
            }
            boolean isEmpty(){
                return tos == -1;
            }
            void display(){
                if (tos >= 0) {
                    System.out.println("Stack elements are:");
                    for (int i = 0; i <= tos; i++) {
                        System.out.printf("%3d",arr[i]);
                    }
                    System.out.println();
                }
            }
        }
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
        System.out.println("Top element is: " + s1.peek());
        System.out.println("Popped element is: " + s1.pop());
        s1.display();
        System.out.println("Is stack empty? " + s1.isEmpty());
    }
}
