public class ListNode {
    Object item;
    ListNode next;

    public ListNode(Object item, ListNode next) {
        this.item = item;
        this.next = next;
    }
 
    public ListNode(Object item) {
        this(item, null);
    }

    public String toString() {
        return item.toString();
    }

    public void insertAfter(Object item) {
        ListNode node = new ListNode(item, this.next);
        //make new node object, assign item, set pointer to current nodes pointer
        this.next = node;
        //set current nodes pointer to new node

        // node1 -> node 2

        // node 1 ->    node 2
        //          new node ^

        //node 1 -> new node -> node 2

    }



}
