public class MergeLinkedList {
    private Node first;
    private Node last;
    private int size;

    MergeLinkedList(List<Integer> items) {
        for (Integer i : items) {
            add(i);
        }
    }

    public void add (int val) {
        final Node newNode = new Node(val);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = last.next;
        }
        size++;
    }

    private static class Node {
        private int item;
        private Node next;

        Node(int element) {
            this.item = element;
        }
    }

    private Node mergeLinkedListRecursive(Node node1, Node node2) {
        if (node1 == null) {
           return node2; 
        }

        if (node2 == null) {
            return node1;
        }

        if (node1.item < node2.item) {
            node1.next = mergeLinkedListRecursive(node1.next, node2);
            return node1;
        } else {
            node2.next = mergeLinkedListRecursive(node1, node2.next);
            return node2;
        }
    }

    public void mergeLinkedListRecursion(MergeLinkedList list2) {
        if (list2 == null) {
            return;
        }
        first = mergeLinkedListRecursive(first, list2.first);
    }

    private void mergeLinkedList(Node node1, Node node2) {
        if (node1 == null) {
            first = node2;
            return;
        }

        if (node2 == null) {
            first = node1;
            return;
        }

        Node prev = null;
        Node aux = null;

        while (node1 != null && node2 != null) {
            if (node1.item < node2.item) {
                aux = node1;
                node1 = node1.next;

            } else {
                aux = node2;
                node2 = node2.next;
            }

            if (prev == null) {
                first = prev = aux;
            } else {
                prev.next = aux;
                prev = prev.next;
            }
        }
        prev.next = node1 != null ? node1 : node2;
    }

    public void mergeLinkedList(MergeLinkedList list2) {
        if (list2 == null) {
            return;
        }
        mergeLinkedList(this.first, list2.first);
    }

    public int[] toArray() {
        int[] items = new int[size];
        int i = 0;
        for (Node x = first; x != null; x = x.next) {
            items[i++] = x.item;
        }
        return items;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        for (Node x = first; x != null; x = x.next)
            hashCode = 31*hashCode + (x == null ? 0 : x.hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MergeLinkedList other = (MergeLinkedList) obj;
        Node currentListNode = first; 
        Node otherListNode =  other.first;

        while (currentListNode != null && otherListNode != null) {
            if (currentListNode.item != otherListNode.item) return false;
            currentListNode = currentListNode.next;
            otherListNode = otherListNode.next;
        }
        return currentListNode == null && otherListNode == null;
    }
}



public class MergeLinkedListTest {

    @Test
    public void testDifferentSizeListRecurse() {
        MergeLinkedList l1 = new MergeLinkedList(Arrays.asList(1, 3, 5));
        MergeLinkedList l2 = new MergeLinkedList(Arrays.asList(2, 4));
        l1.mergeLinkedListRecursion(l2);

        MergeLinkedList expected1 = new MergeLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        assertTrue(expected1.equals(l1));
    }

    @Test
    public void testSameSizeListRecurse() {
        MergeLinkedList l1 = new MergeLinkedList(Arrays.asList(1, 2, 3));
        MergeLinkedList l2 = new MergeLinkedList(Arrays.asList(5, 6, 7));
        l1.mergeLinkedListRecursion(l2);

        MergeLinkedList expected1 = new MergeLinkedList(Arrays.asList(1, 2, 3, 5, 6, 7));
        assertTrue(expected1.equals(l1)); 
    }

    @Test
    public void testNullListRecurse() {
       MergeLinkedList l1 = new MergeLinkedList(Arrays.asList(1, 2, 3));
       MergeLinkedList l2 = new MergeLinkedList(new ArrayList<Integer>());
       l1.mergeLinkedListRecursion(l2);

       MergeLinkedList expected1 = new MergeLinkedList(Arrays.asList(1, 2, 3));
       assertTrue(expected1.equals(l1));
    }

    @Test
    public void testDifferentSizeList() {
        MergeLinkedList l1 = new MergeLinkedList(Arrays.asList(1, 3, 5));
        MergeLinkedList l2 = new MergeLinkedList(Arrays.asList(2, 4));
        l1.mergeLinkedList(l2);

        MergeLinkedList expected1Recurse = new MergeLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        assertTrue(expected1Recurse.equals(l1));
    }

    @Test
    public void testSameSizeList() {
        MergeLinkedList l1 = new MergeLinkedList(Arrays.asList(1, 2, 3));
        MergeLinkedList l2 = new MergeLinkedList(Arrays.asList(5, 6, 7));
        l1.mergeLinkedList(l2);

        MergeLinkedList expected1Recurse = new MergeLinkedList(Arrays.asList(1, 2, 3, 5, 6, 7));
        assertTrue(expected1Recurse.equals(l1));
    }

    @Test
    public void testNullList() {
       MergeLinkedList l1 = new MergeLinkedList(Arrays.asList(1, 2, 3));
       MergeLinkedList l2 = new MergeLinkedList(new ArrayList<Integer>());
       l1.mergeLinkedList(l2);

       MergeLinkedList expected1Recurse = new MergeLinkedList(Arrays.asList(1, 2, 3));
       assertTrue(expected1Recurse.equals(l1));
    }

}