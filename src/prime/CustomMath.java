package prime;

public class CustomMath {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CustomMath(int number) {
        this.number = number;
    }

    public int nextPrime() {
        if(number == 2) return 2;
        else{
            while(true){
                int count = 0;
                for (int i = 2; i <= number / 2; i++) {
                    if(number % i == 0) count++;
                }
                if(count != 0) number++;
                else break;
            }
            return number;
        }
    }
}