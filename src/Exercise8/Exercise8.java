package Exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ");
        String string =scanner.nextLine();
        String strRegex ="^[a-zA-Z]+$";
        if (!string.matches(strRegex)){
            System.out.println(" Chuỗi nhập ko hợp lệ");
        }
        if (string.isEmpty()){
            System.out.println("\"\"");
            return;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int lenght = string.length();
        for (int i =0 ; i < lenght -1 ; i++){
            if (string.charAt(i) == string.charAt(i+1)){
                count++;
            }else {
                sb.append(string.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(string.charAt(lenght - 1));
        sb.append(count);

        System.out.println("Chuỗi sau khi nén: " + sb);
    }
}
