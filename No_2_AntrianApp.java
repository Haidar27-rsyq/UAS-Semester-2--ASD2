package uas_semester.pkg2;
public class No_2_AntrianApp {
        public static void main(String[]args){
        Antrian antrian = new Antrian(10);
        antrian.enqueue(5);
        antrian.enqueue(60); 
        antrian.display();
        System.out.println("nilai yang paling depan = "+antrian.peek());
        System.out.println("Muhammad Haidar Rasyiq");
        System.out.println();
        antrian.enqueue(70); 
        antrian.display();
        System.out.println("yang diambil dari antrian = "+antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = "+antrian.peek());

    }  
}
