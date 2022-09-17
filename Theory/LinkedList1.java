public class LinkedList1 {

    private Node head;
    private Node tail;
    private int size;
    public LinkedList1()
    {
        this.size = 0;
    }

    //create a class to create a Node of visibility as private
    private class Node
    {
        public int value;
        public Node nextNode;

        //constructor when node has only value and nextNode points to null
        public Node(int value)
        {
            this.value = value;
        }

        //node with value and address to next node
        public Node(int value,Node nextNode)
        {
            this.value = value;
            this.nextNode = nextNode;
        }

    }

    //function to display a Linked List
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+"--> ");
            temp = temp.nextNode;
        }
        System.out.println("END");
    }

    public void insertAtFirst(int value)
    {
        //to insert at first is an O(1) operation
        //case 1 : head and tail are null means list is empty ,then the first can be inserted as follows
        Node newNode = new Node(value);
        newNode.nextNode = head;
        head = newNode;
        
        if(tail == null)
        {
            tail = head;
        }

        size++;
    }
    
    public void insertAtLast(int value)
    {
        if(tail == null)
        {
            insertAtFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.nextNode = newNode;
        tail = newNode;

        size++;
    }

    public void insert(int value,int index)
    {
        if(index == 0)
        {
            insertAtFirst(value);
            return;
        }
        if(index == size - 1)
        {
            insertAtLast(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;

        for(int i = 0; i < index - 1;i++)
        {
            temp = temp.nextNode;
        }

        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;

        size++;
    }   
    
    public int deleteAtFirst()
    {
        int deletedValue = head.value;
        head = head.nextNode;

        if(head == null)
        {
            tail = null;
        }
        size--;

        return deletedValue;

    }
    public int deleteAtLast()
    {
        if(head.nextNode == null)
        {
            return deleteAtFirst();
        }
        Node secondLastNode = getIndex(size-2);
        
        int deletedValue = tail.value;
        
        tail = secondLastNode;
        tail.nextNode = null;
        size--;

        return deletedValue;
    }

    public int delete(int index)
    {
        Node prevNode = getIndex(index-1);
        Node temp = head;
        for(int i = 0; i < index;i++)
        {
            temp = temp.nextNode;
        }
        int deletedValue = temp.value;
        prevNode.nextNode = temp.nextNode;
        temp.nextNode  = null;
        size--;

        return deletedValue;
    }
    
    public Node getIndex(int index)
    {
        Node temp = head;
        for(int i = 0;i < index;i++)
        {
            temp = temp.nextNode;
        }

        return temp;
    }


}
