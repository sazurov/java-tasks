package bank;

import java.util.Scanner;

class Solution {
    private Scanner scan = new Scanner(System.in);
    private int customersCount = 0;
    private String[] identifyDocs = new String[customersCount];

    private String getData(String text) {
        System.out.println(text);
        return scan.nextLine();
    }

    private boolean validate (String[] arr) {
        return arr.length == customersCount;
    }

    public void fillArr () {
        customersCount = Integer.parseInt(getData("Введите количество участников в сделке"));
        identifyDocs = new String[customersCount];
        System.out.println("Внести документы, удостоверяющие личность участника: ");

        for (int i = 0 ; i < customersCount ; i++) {
            identifyDocs[i] = String.valueOf(getData(""));
        }

        if (validate(identifyDocs)) {
            System.out.println("Данные успешно занесены:");
            for (String doc : identifyDocs) {
                System.out.println(doc);
            }
        } else {
            System.out.println("Ошибка при вводе данных участников сделки!");
        }
    }

}

public class Bank {
    public static void main (String[] args) {
        Solution sol = new Solution();
        sol.fillArr();
    }
}
