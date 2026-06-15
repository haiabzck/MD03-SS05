package Exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        int count = 1000000; // 1 triệu lần
        long startTime, endTime;
        long timeString, timeStringBuilder, timeStringBuffer;

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < count; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        timeStringBuilder = endTime - startTime;


        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < count; i++) {
            sbf.append(" World");
        }
        endTime = System.currentTimeMillis();
        timeStringBuffer = endTime - startTime;


        startTime = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < count; i++) {
            str += " World";
        }
        endTime = System.currentTimeMillis();
        timeString = endTime - startTime;


        System.out.println("Thời gian thực hiện với String: " + timeString + " ms");
        System.out.println("Thời gian thực hiện với StringBuilder: " + timeStringBuilder + " ms");
        System.out.println("Thời gian thực hiện với StringBuffer: " + timeStringBuffer + " ms");
        System.out.println();
        System.out.println("Nhận xét:");
        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}
