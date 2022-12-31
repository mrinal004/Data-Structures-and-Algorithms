public class Main
{
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(10);
        list.display();
        list.insert(12, 2);
        list.display();


       
    }
}