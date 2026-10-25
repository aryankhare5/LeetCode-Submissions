class MyLinkedList {
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    ListNode head;
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        if(index == 0){
            return head.data;
        }
        ListNode temp = head;
       
        while(index-- > 0){
            temp = temp.next;
        }
        return temp.data;
        
    }
    
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if(head==null){
            head = node;
            size++;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }

        ListNode node = new ListNode(val);
        ListNode temp = head;
        index--;
        while(index-- >0){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }

        if(index == 0) {
            head = head.next;
            size--;
            return;
        }

        ListNode temp = head;

        index--;

        while(index-- > 0) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */