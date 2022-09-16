public class Main
{
    public static void main(String[] args) {
        LL list  = new LL();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(22);
        list.insertLast(80);
        list.insert(44, 2);

        list.display();
        System.out.println(list.delete(3));

        list.display();

       
    }
}