import java.util.*;

    public class LinkList {
        private Node first,last;
        public LinkList(){
            first=null;
            last=null;
        }

        public void tambahkanData(String data){
            Node newNode =new Node(data);
            newNode.next =null;
            if(isEmpty())
                first=newNode;
            else
                last.next=newNode;
                last=newNode;
        }

        public String hapusData(){
            String t =first.data;
            if(first.next==null)
                last=null;
                first=first.next;
                return t;
        }

        public String peekFirst(){
            return(first.data);
        }

        public boolean isEmpty() {
        return(first==null);
        }

        public void displayList() {
            Node current =first;
            while(current!=null)
        {
            current.displayNode();
            current=current.next;
        }

        }
    }
