package hu.nive.ujratervezes.kepesitovizsga.addigits;

import static java.lang.Character.isDigit;

public class AddDigits {

    public int addDigits(String input){
        if(input ==null || input.isEmpty()){
            return -1;
        }
        int sum = 0;
        char[] arr = input.toCharArray();
        for(Character item : arr){
            if(isDigit(item)){
                sum += Character.getNumericValue(item);
            }

        }
        return sum;

    }
}
