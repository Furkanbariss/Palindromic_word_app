import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackList st = new StackList(100);
        QueueList que = new QueueList(100);
        String kelime;
        System.out.println("kelime giriniz: "); kelime = sc.nextLine();
        int n = kelime.length();

        char[] harfler = kelime.toCharArray();
        int i=0;
        while(i<n){
            st.push(harfler[i]);
            que.enqueue(harfler[i]);
            i++;
        }

        boolean sonuc = true;

        while(!st.isEmpty()){
            if(st.pop()!=que.dequeue()){
                sonuc = false;
                break;
            }
        }
        if(sonuc){
            System.out.println(kelime+ " palindromdur.");
        }else {
            System.out.println(kelime+ " palindrom değildir.");
        }
    }
}