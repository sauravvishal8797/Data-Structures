public static class MergeLinkedList {

    public Node MergeLists(Node list1, Node list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            if (list1.data < list2.data) {
                list1.next = MergeLists(list1.next, list2);
                return list1;
            } else {
                list2.next = MergeLists(list2.next, list1);
                return list2;
            }
        }
    }


    public Node sort(list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collator.getInstance().compare(o1, o2);
            }
        });
    }
}