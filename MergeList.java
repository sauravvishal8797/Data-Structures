class Node
{
        int data;
        Node next;
        
        Node(){
            data=0;
            next=null;
        }
        
        Node(int d)
        {
                data = d;
                next = null;
        }

        void insert(int k, Node head)
        {
                Node n = new Node(k);
                n.next = head;
                head = n;
        }

        void delete(Node n, Node head)
        {
                Node h = head;
                while(h.data != n.next.data)
                {
                        h = h.next;
                }

                h.next = h.next.next;
        }

        void swap(Node n, Node head)
        {
                Node temp = head;
                while(temp != n)
                        temp = temp.next;
                int h = n.data;
                n.data = n.next.data;
                n.next.data = h;
        }
}

class Merge_Sort
{
        void sort(Node head)
        {
                Node n = head;
                Node temp = head;

                while (n != null)
                {
                        while (temp != null)
                        {
                                if (temp.data > temp.next.data)
                                        swap(temp, head);
                                temp = temp.next;
                        }
                        n = temp;
                }
        }
}