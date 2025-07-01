public class QueueList {
    Node front;
    Node rear;
    int counter;
    int size;

    public QueueList(int size){
        this.size=size;
        front = null ;
        rear = null ;
        counter = 0;
    }

    void enqueue(char data){
        if (!isFull()) {
            Node word = new Node(data);
            if (isEmpty()) {
                rear = word;
                front = word;
            }else  {
                rear.next = word;
                rear = word;
            }
            counter++;
        }
    }
    char dequeue(){
        if (!isEmpty()) {
            char frontWord = front.node;
            front = front.next;
            counter--;
            return frontWord;
        }
        return '-';
    }

    boolean isFull() {
        return counter == size;
    }
    boolean isEmpty() {
        return counter == 0;
    }
}
