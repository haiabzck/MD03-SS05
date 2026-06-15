package Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập mật khẩu : ");
        String pass = scanner.nextLine().trim(); // Loại bỏ khoảng trắng thừa

        // Biểu thức chính quy để kiểm tra định dạng email
        /*
         * Giải thích biểu thức chính quy (Regex):
         * ^                : Bắt đầu chuỗi
         * (?=.*[A-Z])      : Phải chứa ít nhất 1 chữ cái viết hoa
         * (?=.*[a-z])      : Phải chứa ít nhất 1 chữ cái viết thường
         * (?=.*\d)         : Phải chứa ít nhất 1 ký tự số
         * (?=.*[@#$!%])    : Phải chứa ít nhất 1 ký tự đặc biệt trong tập [@, #, $, !, %]
         * . {8,}           : Độ dài tối thiểu là 8 ký tự
         * $                : Kết thúc chuỗi
         */
        String passRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";

        // Kiểm tra định dạng pass
        if (pass.matches(passRegex)) {
            System.out.println("Mật khẩu  hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        // Đóng Scanner
        scanner.close();
    }
}
