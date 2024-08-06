import java.util.*;

// class LL{

//     Node head;
//     Node tail;
//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;

//         }
//     }

//     //add - first, last 
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }


//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }

//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }


//         currNode.next = newNode;
//     }

//     public void printList(){
//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }


//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + " ");
//             currNode = currNode.next;
//         }

//         System.out.println("NULL");
//     }

//     //delete first

//     public void deleteFirst(){
//         if(head==null){
//             System.out.println("List is empty");
//             return;
            
//         }

//         head = head.next;

//     }


//     public void deleteLast(){
//         if(head == null){
//             System.out.println("List is empty");
//         }

//         if(head.next == null){
//             head = null;
//             return;
//         }


//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null){
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }

//         secondLast.next = null;

//     }
//     public static void main(String args[]){
//         LL list = new LL();
//         list.addFirst("a");
//         list.addFirst("the");
//         list.printList();


//         list.deleteFirst();
//         list.printList();

//         list.deleteLast();
//         list.printList();

         


//     }

// }



///FOrmat
class LL{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        list.addFirst("this");

        System.out.println(list);

        System.out.println(list.size());




        for(int i = 0; i <list.size(); i++){
            System.out.print(list.get(i)+" -> ");


        }

        System.out.println("null");


        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);



    }
}

