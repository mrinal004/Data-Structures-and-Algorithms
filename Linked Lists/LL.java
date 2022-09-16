// custom Linked List class

public class LL {

    private Node head;
    private Node tail;


    private int size;
    public LL()
    {
        this.size = 0;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" -->");
            temp = temp.next;
        }

        System.out.println("End");
    }

    public void insertFirst(int val)
    {
        Node newNode  = new Node(val,head);
        head = newNode;

        if(tail == null)
            tail = head;

        size += 1;
    }

    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void insert(int val,int index)
    {
       if(index == 0)
       {
        insertFirst(val);
        return;
       }

       if(index == size)
       {
        insertLast(val);
        return;
       }

       Node temp = head;

       for(int i = 1;i < index;i++)
       {
        temp = temp.next;
       }
       Node newNode = new Node(val,temp.next);
       temp.next = newNode;
       size++;

    }

    public int deleteFirst()
    {
        int deletedValue = head.value;
        head = head.next;

        if(head.next == null)
        {
            tail = null;
        }
        size--;

        return deletedValue;
    }

    public Node getIndex(int index)
    {
        Node valueNode = head;
        for(int i = 0;i < index;i++)
        {
            valueNode = valueNode.next;
        }
        return valueNode;
    }

    public int deleteLast()
    {
        if(size <= 1)
        {
            return deleteFirst();
        }

        Node secondLastNode = getIndex(size-2);
        int deletedValue = tail.value;
        tail = secondLastNode;
        tail.next = null;

        return deletedValue;
    }

    public int delete(int index)
    {
        if(index == 0)
        {
            return deleteFirst();
        }

        if(index == size-1)
        {
            return deleteLast();
        }

        Node prevNode = getIndex(index-1);

        int deletedValue = prevNode.next.value;

        prevNode.next = prevNode.next.next;
        size--;

        return deletedValue;
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value,Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}
