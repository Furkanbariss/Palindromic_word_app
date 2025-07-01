public class StackList {
    Node top;
    int size;
    int counter;

    public StackList(int size) {
        top = null;
        this.size = size;
        counter = 0;
    }

    void push(char data) {
        if (!isFull()) {
            Node word= new Node (data);
            if(top==null){
                top = word;
                top.next =null;
            }
            else{
                word.next = top;
                top = word;
            }
            counter++;
        }
    }

    char pop() {
        if ( !isEmpty()) {
            char popedWord = top.node;
            top= top.next;
            counter--;
            return popedWord;
        }else {
            return '-';
        }
    }



    boolean isEmpty() {
        return counter == 0;
    }
    boolean isFull() {
        return counter == size;
    }
}
