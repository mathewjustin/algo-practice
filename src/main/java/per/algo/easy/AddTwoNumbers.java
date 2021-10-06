package per.algo.easy;

//https://leetcode.com/problems/add-two-numbers/
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1Iterarter=l1;
        ListNode l2Iterarter=l2;

        while (l1Iterarter.next!=null)
        {
            int l1Value=l1Iterarter.val;
            while (l2Iterarter.next!=null)
            {

                l2Iterarter=l2Iterarter.next;
                break; //Move only to immediate next and exit
            }

            int l2Value=l1Iterarter.val;

            int sum=l1Value+l2Value;

            l1Iterarter=l1Iterarter.next;
        }


    return null;
    
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);


        addTwoNumbers(l1,l2);

        System.err.println("Iteration done!");

    }
}
