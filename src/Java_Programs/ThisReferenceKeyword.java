package Java_Programs;
public class ThisReferenceKeyword {
    static class Box{
        int length;
        int breadth;
        int height;
        Box(int dimension){
            this.length = dimension;
            this.breadth = dimension;
            this.height = dimension;
        }
        Box(int length, int breadth, int height){
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }
        void volume(){
            int volume = length * breadth * height;
            System.out.println("Volume of Box is: " + volume);
        }
        
    }
    public static void main(String[] args) {
        Box b1 = new Box(10,30,50);
        Box b2 = new Box(10, 20, 30);
        Box b3 = new Box(10, 20, 30);
        Box b4 = new Box(10);
        b1.volume();
        b2.volume();
        b3.volume();
        b4.volume();
    }
    
}
