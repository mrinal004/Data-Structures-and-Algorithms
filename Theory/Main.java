public class Main {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        //insert first value
        list.insertAtFirst(23);
        list.insertAtFirst(30);
        list.insertAtLast(22);
        list.insert(80, 1);
        //System.out.println(list.deleteAtLast());
        System.out.println(list.delete(2));
        list.display();
    
    }
}
