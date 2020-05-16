class Recurtion{
    public static void main(String[] args) {
        print(10);
    }
    static void print(int num){
        System.out.println(num);
        if(num>0){
            print(num-1);
        }
    }
}