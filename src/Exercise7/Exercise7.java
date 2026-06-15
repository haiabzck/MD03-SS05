package Exercise7;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài của chuỗi : ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 1 || n > 1000) {
            System.out.println("Độ dài n không hợp lệ! Vui lòng nhập trong khoảng [1, 1000].");
            return;
        }
        String passRegex = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";
        StringBuilder sb = new StringBuilder(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            // Lấy một chỉ số ngẫu nhiên từ 0 đến độ dài của chuỗi alphaNumericStr - 1
            int randomIndex = random.nextInt(passRegex.length());

            // Lấy ký tự tại chỉ số đó
            char randomChar = passRegex.charAt(randomIndex);

            // Nối ký tự vào chuỗi đang xây dựng
            sb.append(randomChar);
        }
        String result = sb.toString();
        System.out.println("Chuỗi ngẫu nhiên có độ dài " + n + " được tạo ra là:");
        System.out.println(result);
    }
}
