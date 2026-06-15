package Exercise10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 đoạn văn :");
        String string = scanner.nextLine();
        if (string.isEmpty()){
            System.out.println("Không có văn bản nào !");
        }
        String cleanText = string.replaceAll("[^a-zA-z0-9\\s]" ,"");
        System.out.println("Đoạn văn sau khi xóa các kí tự đặc biệt : " + cleanText);

        cleanText = cleanText.toLowerCase();

        cleanText = cleanText.trim();

        cleanText = string.replaceAll("\\s+" ," ");
        System.out.println("Đoạn văn sau khi chuẩn hóa văn bản : " + cleanText);

        Pattern numberPattern = Pattern.compile("\\d+");
        Matcher numberMatcher = numberPattern.matcher(cleanText);
        StringBuilder arrayBuilder = new StringBuilder("[");
        boolean isFirst = true; // Biến đánh dấu để xử lý dấu phẩy hợp lý

        while (numberMatcher.find()) {
            if (!isFirst) {
                arrayBuilder.append(", "); // Thêm dấu phẩy trước các số từ thứ hai trở đi
            }
            arrayBuilder.append(numberMatcher.group());
            isFirst = false;
        }
        arrayBuilder.append("]"); // Đóng ngoặc mảng

        // 6. In kết quả dạng mảng
        System.out.print("\nDanh sách các số tìm thấy: ");
        if (isFirst) {
            System.out.println("[]");
        } else {
            System.out.println(arrayBuilder);
        }
    }
}
