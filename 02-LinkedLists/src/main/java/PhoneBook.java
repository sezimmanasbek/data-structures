public class PhoneBook {
    CustomNode head;
    CustomNode tail;
    int size;

    public PhoneBook() {
    }

    public boolean isEmpty(){
       return  head == null;
    }

    public void add(String firstName,String lastName, String email, String phoneNumber){
        CustomNode node = new CustomNode(firstName,lastName,email,phoneNumber);
        if(isEmpty()){
            head=tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Phone Book is empty");
        } else{
            CustomNode current = head;
            while(current != null){
                System.out.println("First name: " + current.firstName + " Last name: " + current.lastName);
                current = current.next;
            }
        }

    }

    public void deleteNode(String firstName){
        if(isEmpty()){
            System.out.println("No values with the value send!!!");
        } else{
            CustomNode current = head;
            CustomNode previous = null;
            while (current != null){
                if(current.firstName.equalsIgnoreCase(firstName)){
                    if(current == head){
                        head = head.next;
                    }else if(current == tail){
                        tail = previous;
                        previous.next = null;
                    } else{
                        previous.next = current.next;
                    }
                    size--;
                }
                previous = current;
                current = current.next;
            }

        }

    }

    public void deleteByEmail(String email){
        if(isEmpty()){
            System.out.println("The Phone Book is empty");
        }
      CustomNode current = head;
      CustomNode previous = null;
      while(current != null){
          if(current.email.equals(email)){
              if(current == head && head == tail){
                  head = null;
                  tail = null;

              }else if(current == head){
                  head = current.next;
                  current.next = null; // to send this to garbage collection we have to remove link between values
              } else if(current == tail){
                   tail = previous;
                   previous.next = null;
               } else{
                   previous.next = current.next;
                   current.next = null;
               }
               size--;
          }
          previous = current;
          current = current.next;
      }

    }

    public void sortByName(){

        CustomNode current = head;
        if(current == tail) return;
        CustomNode current2 = current.next;

        boolean swap = true;
        while (swap){
             swap = false;
             current = head;
             current2 = head.next;

            while(current != null && current2 !=null){
                if(current.firstName.compareToIgnoreCase(current2.firstName) > 0 ){
                    CustomNode temp = new CustomNode(current2.firstName, current2.lastName, current2.email, current2.phoneNumber);
                    current2.firstName = current.firstName;
                    current2.lastName = current.lastName;
                    current2.email = current.email;
                    current2.phoneNumber = current.phoneNumber;
                    current.firstName = temp.firstName;
                    current.lastName = temp.lastName;
                    current.email = temp.email;
                    current.phoneNumber = temp.phoneNumber;
                   swap = true;
                }
                    current = current.next;
                    current2 = current2.next;

            }
        }

    }

}
