package Excepsion;

import java.util.Scanner;

// Định nghĩa lớp ngoại lệ mới - InvalideNumberException
class InvalideNumberException extends Exception {
    public InvalideNumberException(String message) {
        super(message);
    }
}

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            checkRandomNumber(scanner);
        } catch (InvalideNumberException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Chương trình kết thúc.");
        }
    }

    public static void checkRandomNumber(Scanner scanner) throws InvalideNumberException {
        System.out.print("Nhập một số nguyên n: ");
        int n = scanner.nextInt();
        try {
            java.util.Random random = new java.util.Random();
            int randomNumber = random.nextInt(101);
            System.out.println("Số ngẫu nhiên được sinh ra là: " + randomNumber);
            if (n == randomNumber) {
                System.out.println("Chúc mừng! Bạn đã đoán đúng số ngẫu nhiên.");
            } else {
                System.out.println("Rất tiếc! Bạn đã đoán sai số ngẫu nhiên.");
            }
            // Kiểm tra nếu số nhập vào không hợp lệ
            if (n < 0 || n > 100) {
                throw new InvalideNumberException("Số nguyên n không hợp lệ!");
            }
        } catch (InvalideNumberException e) {
            throw e; // Đẩy ngoại lệ lên hàm main để xử lý
        } catch (Exception e) {
            throw e; // Đẩy ngoại lệ lên hàm main để xử lý
        }
    }
}
