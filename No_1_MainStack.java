package uas_semester.pkg2;
public class No_1_MainStack {
    public static void main(String[] args) {
        No_1_stack newStack = new No_1_stack (10);
        newStack.push(87);
        newStack.show();
        newStack.push(30);
        newStack.show();
        long bacaTop = newStack.peek();
        System.out.println("nilai teratas = "+bacaTop); 
        System.out.println("Muhammad Haidar Rasyiq");
        long top = newStack.pop();
        System.out.println("nilai yang dihapus = "+top);
        newStack.show();
        System.out.println();
        newStack.push(40);
        newStack.show();
        newStack.push(50);
        newStack.show();
        
}
}
