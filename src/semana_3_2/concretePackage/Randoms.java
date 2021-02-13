package semana_3_2.concretePackage;

import java.util.Random;

public class Randoms {

    /**
     *
     * @param max
     * @return a random integer
     */
    public int generateRandomInteger(int max) {
        return new Random().nextInt(max + 1);
    }

    /**
     *
     * @param isLowerCase
     * @return a random letter which might be lowe/upper case
     */
    public char generateRandomLetter(int isLowerCase){
        int loweCaseCode = isLowerCase == 0 ? 97 : 65;
        return  (char)(loweCaseCode + generateRandomInteger(25));
    }

    /**
     *
     * @param passwordSize
     * @return a random string using upper/lower case letters and numbers
     */
    public String generateRandomPassword(int passwordSize){
        String password = "";
        int includeNumber = 0;
        for (int i = 0; i < passwordSize; i++) {
            includeNumber = generateRandomInteger(1);
            if(includeNumber == 0)
                password += generateRandomInteger(9);
            else
                password += generateRandomLetter(generateRandomInteger(1));

        }

        return password;
    }
}

