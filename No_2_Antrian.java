package uas_semester.pkg2;
public class No_2_Antrian {
    public class Antrian {
    private int ukuran;
    private Object[] antrian;
    private int belakang;
    private int jumItem;
    private int depan;
    
    public Antrian(int s){
        ukuran = s;
        antrian = new Object[ukuran];
        depan=0;
        belakang=-1;
        jumItem=0;
    }
    public void enqueue(Object j){
                    if(!isFull()){
                       antrian[++belakang]=j;
                            jumItem++;
        }
    }
    public Object dequeue() {
    Object temp = antrian[0];
    if (!isEmpty()){
            for(int i=0; i<jumItem;i++)
                antrian[i] = antrian[i+1];
                jumItem--;
                belakang--;
                }
        return temp;
        }
    public Object peek(){
        return antrian[depan];
      }
    public boolean isEmpty(){
        return(jumItem==0);
    }
    public boolean isFull(){
        return(belakang==ukuran-1);
}
    public int ukuran(){
        return jumItem;
}
    public void display(){
        for(int i=0;i<jumItem;i++)
        System.out.print(antrian[i]+" ");
        System.out.println("");
}
}
}
