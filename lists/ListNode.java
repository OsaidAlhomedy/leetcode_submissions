package lists;

public class ListNode {

    public int value;
    public ListNode next;

    ListNode() {

    }

    ListNode(int value) {
        this.value = value;
        next = null;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}

class Testing {

    public static void main(String[] args) {
        ListNode newList1 = new ListNode(1);
        ListNode newList2 = new ListNode(2);
        ListNode newList3 = new ListNode(3);
        newList1.next = newList2;
        newList2.next = newList3;

        newList1 = reverseList(newList1);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode p, n;
        p = null;
        n = head.next;

        while (head != null) {
            head.next = p;
            p = head;
            head = n;
            n = n.next;
        }

        return p;
    }

}
