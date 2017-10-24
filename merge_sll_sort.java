class Node
{
        int data;
        Node next;

        Node(int d)
        {
                data = d;
        }

        void insert(int k, Node head)
        {
                Node n = new Node(k);
                n.next = head;
                head = n;
        }

        void delete(Node n, Node head)
        {
                Node r = head;
                while(r.data != n.next.data)
                {
                        r = r.next;
                }

                r.next = r.next.next;
        }

        void swap(Node n, Node head)
        {
                Node r = head;
                while(r != n)
                        r = r.next;
                int temp = n.data;
                n.data = n.next.data;
                n.next.data = temp;
        }
}

class Merge_Sort
{
        void sort(Node head)
        {
                Node n = head;
                Node r = head;

                while (n != null)
                {
                        while (r != null)
                        {
                                if (r.data > r.next.data)
                                        swap(r, head);
                                r = r.next;
                        }
                        n = r;
                }
        }
}
