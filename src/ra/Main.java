package ra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // câu lệnh IF

        Scanner sc = new Scanner(System.in);
        // dạng IF ... ELSE
//        int n = sc.nextInt();
//        if (n % 2 == 0) {
//            System.out.println("Số chia hết cho 2");
//        } else {
//            System.out.println("Khong chia hết cho 2");
//        }
//
//        // dạng IF
//        if (n % 3 == 0) {
//            System.out.println("chia hets cho 4");
//        }
//
//        // Dạng IF ELSE lồng, Bậc thang
//        if (n % 2 == 0) {
//            // chia hết cho 2
//            if (n % 5 == 0) {
//                // chia hết cho 2 và 5
//            } else {
//                // chia hết cho 2 nhưng ko chia hết cho 5
//            }
//        } else {
//            // kiểm tra chia cho 5
//        }
//
//        //
//        if (n < 5) {
//            //yếu
//        } else if (n <= 6.5) {
//            // trung bình
//        } else if (n <= 7) {
//            // khá
//        } else {
//            // giỏi
//        }


        // câu lệnh Switch - case
        // nhận vào biều thức hoặc biến dùng đẻ so sánh giá trị (==) các case

//        // chọn quyền : 1, 2, 3
//        System.out.println("Nhập va lựa chọn của bạn ");
//        System.out.println("1. ADMIN");
//        System.out.println("2. USER");
//        System.out.println("3. Customer");
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                System.out.println("bạn chọn quyền admin");
//                break;
//            case 2:
//                System.out.println("Bạn chọn user");
//                break;
//            case 3:
//                System.out.println("Bạn chọn ctomer");
//                break;
//            default:
//                //ko khớp với các case phía trên
//                System.out.println("dèault");
//        }

        // Vòng lặp :
        // Vòng lặp fori
//        int i =0;
//        for (; ; ) { // dạng khuyết thiêu
//            if (i>=10){
//                break;
//            }
//
//
//
//            i++;
//        }
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }

        // vòng lặp while và do while
//        do{
//            System.out.println("-----------------Menu-------------------");
//            System.out.println("1 . Thêm mới");
//            System.out.println("2 . Thêm mới");
//            System.out.println("3 . Thêm mới");
//            System.out.println("4 . Thêm mới");
//            System.out.println("0 . Thoát");
//            int n = sc.nextInt();
//            if (n ==5){
//                break;
//            }
//        }while (true);

        // 3 khóa trong vòng lặp , câu lệnh điều kiện , phương thưcs
        // break : thoát khỏi khối code hiện tại
        // return : dừng hàm hiện tại
        // continue : thoát khỏi vòng lặp hiện tai và tiếp tục vòng lặp tiếp theo


        for (int i = 0; i < 10; i++) {
            if (i%5==0){
                // b qua
                continue;
            }
            System.out.println("số "+i);
        }




//        ktraSoNguyenTo(sc.nextInt());


        // bài tập : xây dựng lớp nhập dữ liệu cho các kiểu nguyên thủy + LocalDate

    }

    public static void ktraSoNguyenTo(int n) {
        if (n < 2) {
            System.err.println("ko phai so nguyen to");
            return;
        }
        // kiểm tra chia het từ 2 -> căn bậc 2 cua n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                //
                System.err.println("ko phải số nguyên tó");
                return;
            }
        }
        System.out.println("n là sô nguyên tố");

    }
}
