 class IntroLink {
    Node head;
    class Node{
        String data ;
        Node next;
//        Node head;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // add -- first, last
    public void addFirst(String data){
        Node newNode  = new Node(data);
        if(head == null){
        head = newNode;

        }
        newNode.next = head;
        head = newNode;
    }
        public void addLast(String data) {
            if (head == null) {
                head = new Node(data);
            }
            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }
        }



    public static void main(String[] args) {
        IntroLink list = new IntroLink();
        list.addFirst("you");
        list.addFirst("are");
        list.addFirst("handsome");

    }

}
