

public class count {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0 ; i <= 100;i++){
            if(i %2 != 0){
                count = count+ i;
            }
        }
        System.out.println(count);
    }
}
