public class PhoneBookApp {

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Samat","Kasymov","xxxx@gmail.com","12051205");
        book.add("Sezim","Manasbekova","xxxx@gmail.com","12051205");
        book.add("Ayana","Manasbekova","xxxx@gmail.com","12051205");
        book.add("Dias","Manasbekova","xxxx@gmail.com","12051205");
        book.add("Raina","Manasbekova","xxxx@gmail.com","12051205");
        book.add("Manas","Manasbekova","xxxx@gmail.com","12051205");
        book.print();
//        book.deleteNode("Samat");
//        book.deleteNode("Samatt");
        book.print();
        book.sortByName();
        System.out.println("------");
        book.print();

        PhoneBookTree bookTree = new PhoneBookTree();
        CustomNodeTree tree = new CustomNodeTree("Sultan","K","Gmail.com","2087583927598");
        bookTree.insert(tree);
        bookTree.insert(new CustomNodeTree("Samat","Kasymov","xxxx@gmail.com","12051205"));
        bookTree.insert(new CustomNodeTree("Sezim","Kasymov","xxxx@gmail.com","12051205"));
        bookTree.insert(new CustomNodeTree("Ayana","Kasymov","xxxx@gmail.com","12051205"));
        bookTree.insert(new CustomNodeTree("Sezim","M","xxxx@gmail.com","12051205"));
        bookTree.printInAssOrder(tree);

    }
}
