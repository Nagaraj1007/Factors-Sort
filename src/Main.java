import java.util.Arrays;

public class Main {

    public static int[] factorsSort(int[] array){
        for(int iterator1 = 0 ;iterator1 < array.length ; iterator1++){
            for(int iterator2 = 0; iterator2 < array.length - 1 ; iterator2++){
                if(factorOfANumber(array[iterator2]) > factorOfANumber(array[iterator2 + 1])){
                    int temp = array[iterator2];
                    array[iterator2] = array[iterator2 + 1];
                    array[iterator2 + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int factorOfANumber(int number){
        int count = 0;
        for (int iterator = 1 ; iterator * iterator <= number ; iterator++){
            if(number % iterator == 0) {
                count += (iterator < number / iterator) ? 2 : 0;
                count += (iterator == number / iterator) ? 1 : 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(factorsSort(new int[]{2, 4, 7})));
    }
}