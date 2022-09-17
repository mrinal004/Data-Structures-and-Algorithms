public class DLL {

    private Node head;
    private Node tail;
    private int size = 0;

    public DLL()
    {
        this.size = 0;
    }

    public void insertFirst(int value)
    {
        Node newNode = new Node(value);
        newNode.nextNode = head;

        if(tail == null)
        {
            tail = head;
        }

        if(head != null)
        head.prevNode = newNode;

        head = newNode;
        size++;

    }

    public void insertLast(int value)
    {
        Node newNode = new Node(value);
        if(head == null)
        {
            insertFirst(value);
            return;
        }
    
        tail.nextNode = newNode;
        newNode.prevNode = tail;
        tail = newNode;
    }

    public void insert(int value,int index)
    {
        Node insertNode = getIndex(index);
        if(head == null)
        {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
       newNode.nextNode = insertNode.nextNode;
       insertNode.nextNode.prevNode = newNode;

       insertNode.nextNode = newNode;
       newNode.prevNode = insertNode;
    }

    public Node getIndex(int index)
    {
        Node temp = head;
        for(int i = 0;i < index-1;i++)
        {
            temp = temp.nextNode;
        }

        return temp;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+"<--> ");
            temp = temp.nextNode;
        }
        System.out.println("END");
    }


    private class Node
    {
        public int value;
        Node nextNode;
        Node prevNode;

        Node(int value)
        {
            this.value = value;
        }

        Node(int value,Node nextNode,Node prevNode)
        {
            this.value = value;
            this.nextNode = nextNode;
            this.prevNode = prevNode;
        }
    }
}
