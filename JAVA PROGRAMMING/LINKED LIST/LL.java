public class LL {
    private int size;
    private Node head;
    private Node tail;

    public LL(){
        this.size=0;
    }
    public void recursive_insertion(int val ,int idx){
        this.head =recursive_insertion(val,idx,this.head);
    }
    private Node recursive_insertion(int val,int idx ,Node head){
        if(idx==0){
            Node temp =new Node(val);
            temp.next=head;
            this.size++;
            return temp;
        }
        Node returned = recursive_insertion(val,idx-1,head.next);
        head.next =returned;
        return head;
    }
    public void insertFirst(int val){
        Node temp= new Node(val);
        if (this.head==null){
            this.head=temp;
            this.tail=temp;
            this.size++;
            return;
        }
        temp.next=this.head;
        this.head=temp;
        this.size++;
        return;

    }
    public void append(int val){
        Node temp = new Node(val);

        if (this.size==0){
            this.head=temp;
            this.tail=temp;
            this.size++;
            return;
        }
        this.tail.next=temp;
        this.tail=temp;
        this.size++;
        return;
    }
    public void insert(int val,int idx) throws ArithmeticException{
        Node temp=new Node(val);
        if (idx>size || idx<0){
            throw new ArithmeticException("you are a dumb...");
        }
        if (idx==0){
            insertFirst(val);
            return;
        }
        if (idx==size){
            append(val);
            return;
        }
        Node cur = this.head;
        for (int i = 0; i < idx-1; i++) {
            cur=cur.next;
        }
        Node next_cur=cur.next;
        cur.next=temp;
        temp.next=next_cur;
        this.size++;
        return;

    }
    public void deleteFirst(){
        if(head==null || this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        this.head=this.head.next;
        this.size--;
        return;
    }
    public void delete(int idx) throws ArithmeticException{
        if (idx>=size || idx<0){
            throw new ArithmeticException("you are a dumb...");
        }
        if (idx==0){
            deleteFirst();
            return;
        }
        if (idx==size-1){
            pop();
            return;
        }
        Node cur = this.head;
        for (int i = 0; i < idx-1; i++) {
            cur=cur.next;
        }
        cur.next=cur.next.next;
        this.size--;
        return;

    }
    public void pop(){
        if (this.size==0 || this.size==1){
            this.tail=null;
            this.head=null;
            this.size=0;
            return;
        }
        Node cur;
        cur=this.head;
        while(cur.next!=this.tail){
            cur =cur.next;
        }
        this.tail=cur;
        tail.next=null;
        this.size--;
        return;
    }
    public void display(){
        if (this.size==0){
            return;
        }
        Node cur;
        cur=this.head;
        while (cur!=null){
            System.out.print(cur.value + "->");
            cur=cur.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public int getSize(){
        return this.size;
    }

    public boolean isCycle(){
        if (this.size==0){
            return false;
        }
        Node s=this.head;
        Node f=this.head;
        while(f.next!=null && f!=null){
            s=s.next;
            f=f.next.next;
            if (f==s){
                return true;
            }
        }
        return false;
    }
    public void recursiveReverse(){
        this.tail= recursiveReverse(this.head);
    }
    private Node recursiveReverse(Node head){
        if (head.next==null){
            this.head=head;
            return head;
        }
        Node returned= recursiveReverse(head.next);
        returned.next=head;
        head.next=null;
        return head;
    }
    public void iterativeReverse(){
        this.head=iterativeReverse(this.head);
    }

    private Node iterativeReverse(Node head) {
        Node pre=null;
        Node cur=head;
        while (cur!=null){
            Node next_cur=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next_cur;
        }
        return pre;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
