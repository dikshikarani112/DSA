public class Trie {
    static class Node {
        Node[] childeren;
        boolean eow;

        public Node() {
            childeren = new Node[26];
            for(int i =0; i<26; i++) childeren[i] = null;
            eow = false;
        }
    }

    static Node root = new Node(); //root node always empty it always reach us to childeren O(L) complexity

    public static void insert(String word) {
        Node current = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(current.childeren[idx] == null) {
                current.childeren[idx] = new Node();
            }

            if(i == word.length()-1) {
                current.childeren[idx].eow = true;
            }
            current = current.childeren[idx];
        }
    }

    public static boolean search(String key) {
        Node current = root;
        for(int i=0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if(current.childeren[idx] == null) {
                return false;
            }

            if(i == key.length()-1 && current.childeren[idx].eow == false) {
                return false;
            }

            current = current.childeren[idx];
        }
        return true;
    }

    public static  void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for(String word : words) {
            insert(word);
        }

        System.out.println(search("their"));
        System.out.println(search("hi"));
    }
}
