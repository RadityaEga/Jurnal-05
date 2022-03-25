import java.util.*;

    public class Node {
        private String data;
        private Node link;

        public Node() {
            link = null;
            data = "Kosong";
        }

        public Node(String a,Node b) {
            data = a;
            link = b;
        }

        public void setLink(Node b) {
            link = b;
        }

        public void setData(String a) {
            data = a;
        }

        public Node getLink() {
            return link;
        }

        public String getData() {
            return data;
        }
    }
