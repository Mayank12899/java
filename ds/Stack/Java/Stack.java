class Stack {
    public static int SIZE = 10;
    public static int top = 0;

    public static int[] S = new int[SIZE+1];

    public static boolean isEmpty(){
        if(top == 0){
            return true;
        }
        return false;
    }

    public static void push(int x){
        top = top + 1;
        if(top > SIZE){
            System.out.println("Stack Overflow");
        }
        else {
            S[top] = x;
        }
    }

    public static int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1000;
        }
        else{
            top = top - 1;
            return S[top+1];
        }
    }

    public static void main(String[] args) {
        pop();
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        push(70);
        push(80);
        push(90);
        push(100);
        push(110);
    
        for(int i=1; i<=SIZE; i++) {
          System.out.println(S[i]);
        } 
    }
}