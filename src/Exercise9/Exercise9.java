package Exercise9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Nhập URL từ người dùng
        System.out.print("Nhập đường dẫn URL cần kiểm tra: ");
        String url = scanner.nextLine().trim();

        // 2. Định nghĩa cấu trúc Regex có chia nhóm (Groups)
        String urlRegex = "^(https?)://([^/]+)(/.*)?$";

        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(url);

        // 3. Kiểm tra tính hợp lệ và trích xuất dữ liệu
        if (matcher.matches()) {
            System.out.println("\n=> URL HỢP LỆ.");

            // Trích xuất dựa trên số thứ tự nhóm trong Regex
            String protocol = matcher.group(1);
            String domain = matcher.group(2);
            String path = matcher.group(3);

            // In kết quả trích xuất
            System.out.print("- Giao thức: " + protocol);
            System.out.print("- Tên miền : " + domain);

            // Xử lý hiển thị đường dẫn (nếu có hoặc không)
            if (path == null || path.equals("/")) {
                System.out.print("- Đường dẫn: (Không có)");
            } else {
                System.out.print("- Đường dẫn: " + path);
            }
        } else {
            // 4. Thông báo lỗi nếu URL không đúng định dạng
            System.out.println("\n=> LỖI: URL KHÔNG HỢP LỆ!");
            System.out.println("Yêu cầu: Phải bắt đầu bằng 'http://' hoặc 'https://' và có tên miền hợp lệ.");
        }
    }
}
