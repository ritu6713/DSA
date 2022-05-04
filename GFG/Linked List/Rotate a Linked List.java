class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here


        for(int i=1;i<=k;i++)
        {
            Node curr=head;
            Node temp=head.next;

            while(curr.next!=null)
            {
                curr=curr.next;
            }

            curr.next=head;
            head.next=null;
            head=temp;
        }
        return  head;
    }
}