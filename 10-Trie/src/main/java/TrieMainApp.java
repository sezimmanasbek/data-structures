public class TrieMainApp {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("apple") ;
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        trie.insert("app") ;
        System.out.println(trie.search("app") + "  =>After insertion");
    }


    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */



}
