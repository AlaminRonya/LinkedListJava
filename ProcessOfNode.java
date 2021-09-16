public class ProcessOfNode {
    private Node getNewNode(int data) {
        return new Node(data);
    }
    public Node insertNode(int data, Node node){
        if (node == null){
            node = getNewNode(data);
            return node;
        }
        Node headNode = node;
        while (node.getNext() != null){
            node = node.getNext();
        }
        node.setNext(getNewNode(data));
        return headNode;
    }
    public Node insertFront(int data, Node node){
        if (node == null){
            node = getNewNode(data);
            return node;
        }
        Node newNode = getNewNode(data);
        newNode.setNext(node);
        return newNode;
    }
    public Node insertAtPosition(int position , int data , Node node){
        if (position < 1){
            System.out.println("Position can't less than 1 ");
            return null;
        }
        if (position == 1){
            Node newNode = getNewNode(data);
            newNode.setNext(node);
            return newNode;
        }
        Node prev = null;
        Node head = node;
        while ((node != null) && (position >1)){
            prev = node;
            node = node.getNext();
            position --;
        }
        if (position != 1){
            System.out.println("Out of range!");
            return head;
        }
        Node n = getNewNode(data);
        prev.setNext(n);
        n.setNext(node);
        return head;
    }
    public boolean delete(Node node){
        if (node == null){
            return false;
        }
        if (node.getNext() == null){
            return true;
        }
        Node head = node;
        while (node.getNext().getNext() != null){
            node = node.getNext();
        }
        node.setNext(null);
        return true;
    }
    public Node deleteFront(Node node){
        if ((node == null)||(node.getNext() == null)){
            System.out.println("One of node");
            return null;
        }
        return node.getNext();

    }

    public Node deleteAtPosition(int position, Node node){
        if (position < 1){
            System.out.println("Position can't less than 1 ");
            return null;
        }
        if (node.getNext() == null){
            System.out.println("List is empty!");
            return null;
        }
        if (position == 1){
            return node.getNext();
        }

        Node prev = null;
        Node head = node;
        while ((node != null) && (position >1)){
            prev = node;
            node = node.getNext();
            position--;
        }
        if (position != 1){
            System.out.println("Out of range!");
            return head;
        }

        prev.setNext(node.getNext());
        return head;

    }

    public Node deleteMatchingValue(int val, Node node){
        if ((node == null)||(node.getNext()==null)){
            if (node.getData() != val){
                return node;
            }
            return null;
        }
        Node firstNode = node;
        int p = 1;
        int nodePosition = 1;
        while (node != null){

            if (node.getData() == val){
                System.out.println("nodePosition = " + nodePosition +" Value = "+node.getData());
                firstNode = deleteAtPosition(p,firstNode);
                p--;
            }
            p++;
            nodePosition++;

            node = node.getNext();



        }
        return firstNode;
    }

    public Node rotatedClockwise(int position, Node node){
        if (node == null || position<1){
            return node;
        }
        int size = sizeOfLinkedList(node);
        position = position % size;
        if (position == 0){
            return  node;
        }
        Node temp1 = node;
        int i =1;
        while (i < size - position){
            temp1 = temp1.getNext();
            i++;
        }
        Node temp2 = temp1.getNext();
        Node head = temp2;
        temp1.setNext(null);
        //display(temp1);
        while (temp2.getNext() != null){
            temp2 = temp2.getNext();
        }
        temp2.setNext(node);
        return head;
    }

    public Node rotateAntiClockwise(int k , Node node){

        if (node == null || k<1){
            return node;
        }
        int size = sizeOfLinkedList(node);
        k = k % size;
        if(k == 0) {
            return node;
        }
        Node temp1 = node;
        int i = 1;
        while (i<k){
            temp1 = temp1.getNext();
            i++;
        }
        Node temp2 = temp1.getNext();
        Node head = temp2;
        temp1.setNext(null);
        while (temp2.getNext() != null){
            temp2 = temp2.getNext();
        }
        temp2.setNext(node);
        return head;
    }
    public Node reverse(Node node){
        if ((node == null)||(node.getNext()==null) ){
            return node;
        }
        Node next, prev;
        next = prev = null;
        while (node != null){
            next = node.getNext();
            node.setNext(prev);
            prev = node;
            node = next;
        }
        return prev;
    }
    public Node reverseInGroup(int k, Node node){
        if ((node == null)||(node.getNext()==null) || (k<=1)){
            return node;
        }
        int i = 0;
        Node next, prev;
        next = prev = null;
        Node v = node;
        while (v != null && i < k){
            next = v.getNext();
            v.setNext(prev);
            prev = v;
            v = next;
            i++;
        }
        if (next != null){
            node.setNext( reverseInGroup( k , next));
        }
        return prev;
    }
    public Node getMiddleNode(Node node){
        if (node == null){
            return null;
        }
        Node a,b;
        a = node;
        b = node.getNext();
        while ((b != null) && (b.getNext() != null)) {
            a = a.getNext();
            b = b.getNext().getNext();
        }
        return a;
    }


    public Node mergeList(Node a, Node b) {
        return merge(mergeSort(a), mergeSort(b));
    }

    public Node mergeSort(Node node){
        if ((node == null) || (node.getNext() == null)){
            return node;
        }
        Node middle = getMiddleNode(node);
        Node secondHalf = middle.getNext();
        middle.setNext(null);
        return merge(mergeSort(node), mergeSort(secondHalf));

    }

    private Node merge(Node a, Node b) {
        Node temp = new Node();
        Node finalList = temp;

        while(a != null && b != null) {
            if(a.getData() < b.getData()) {
                temp.setNext(a);
                a = a.getNext();
            } else {
                temp.setNext(b);
                b = b.getNext();
            }
            temp = temp.getNext();
        }
        temp.setNext((a == null) ? b : a);
        return finalList.getNext();
    }


    public int sizeOfLinkedList(Node node){
        if (node == null){
            return 0;
        }
        return 1+sizeOfLinkedList(node.getNext());
    }



    public void display(Node node){
        if (node == null){
            return;
        }

        while (node !=null){
            System.out.print(node.getData()+" ");
            node = node.getNext();
        }
        System.out.println();
    }
}
