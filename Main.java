public class Main {
    public static void main(String[] args) {
        StackClass stackClass = new StackClass();
        stackClass.pushItem.test(56);
        stackClass.pushItem.test(77);
        stackClass.pushItem.test(12);
        stackClass.pushItem.test(12);
        stackClass.pushItem.test(77);
        stackClass.pushItem.test(56);


        while (true){
            int value = stackClass.pop.get();
            if (Integer.MIN_VALUE == value){
                break;
            }
            System.out.println(value);
        }

        //System.out.println("Supplier : "+stackClass.isFullqq.get());

//        for (int i = 0 ; i< stackClass.value.get() ; i++){
//            int value = stackClass.popFun.get();
//            if (Integer.MIN_VALUE == value){
//                System.out.println("Stack is Empty!");
//            }else {
//                System.out.println(value);
//            }
//        }

        //System.out.println(stackClass.pop());
        System.out.println("Queue Implements using of array");
        QueueClass queueClass = new QueueClass(1);
        //System.out.println(queueClass.dequeue());
        System.out.println(queueClass.enqueue(1)? "inserted":"Queue is full");
        System.out.println(queueClass.enqueue(2)? "inserted":"Queue is full");
        System.out.println(queueClass.dequeue());
        System.out.println(queueClass.enqueue(2)? "inserted":"Queue is full");
        System.out.println(queueClass.enqueue(2)? "inserted":"Queue is full");
        System.out.println(queueClass.dequeue());

        System.out.println("Linked List Using Java");

        Node root = null;
        ProcessOfNode processOfNode = new ProcessOfNode();
//        root = processOfNode.insertNode(12,root);
//        root = processOfNode.insertNode(13,root);
//        root = processOfNode.insertNode(14,root);
//        root = processOfNode.insertNode(15,root);
//        root = processOfNode.insertFront(17,root);
//        root = processOfNode.insertFront(18,root);
//        root = processOfNode.insertFront(16,root);
        root=processOfNode.deleteFront(root);
        processOfNode.display(root);
        root = processOfNode.insertFront(16,root);
//        root = processOfNode.deleteAtPosition(1,root);
//        processOfNode.display(root);
        //System.out.println(processOfNode.delete(root));
        //root=processOfNode.deleteFront(root);
        processOfNode.display(root);
        System.out.println();
        for (int i = 1; i<=7; i++){
            root = processOfNode.insertNode(i,root);
        }
        Node root1 = null;
        for (int i = 1; i<=7; i++){
            root1 = processOfNode.insertNode(i,root1);
        }

        for (int i = 1; i<=7; i++){
            root = processOfNode.insertFront(i,root);
        }

        //root = processOfNode.insertAtPosition(2,25,root);
        processOfNode.delete(root);
        root=processOfNode.deleteFront(root);
        root = processOfNode.insertAtPosition(7,25,root);
        processOfNode.display(root);
        System.out.println();
        root = processOfNode.insertNode(6,root);
        root = processOfNode.insertNode(6,root);
        root = processOfNode.insertNode(6,root);
        root = processOfNode.insertNode(6,root);
        root = processOfNode.insertNode(6,root);
        root = processOfNode.insertNode(6,root);
        root = processOfNode.deleteAtPosition(2,root);

        processOfNode.display(root);

        //System.out.println("Matching");


        root = processOfNode.deleteMatchingValue(6,root);
        System.out.println("Size of Linked List : "+processOfNode.sizeOfLinkedList(root));
        processOfNode.display(root);
        root = processOfNode.rotatedClockwise(2,root);
        processOfNode.display(root);
        root = processOfNode.rotateAntiClockwise(2,root);
        processOfNode.display(root);
        root = processOfNode.reverse(root);
        processOfNode.display(root);
        System.out.println("Middle Node : "+processOfNode.getMiddleNode(root).getData());
        root = processOfNode.reverseInGroup(2,root);
        processOfNode.display(root);
        System.out.println("Middle Node : "+processOfNode.getMiddleNode(root).getData());
        System.out.print("Merge Sort : ");
        root = processOfNode.mergeSort(root);
        processOfNode.display(root);
        root = processOfNode.mergeList(root,root1);
        processOfNode.display(root);





    }
}
