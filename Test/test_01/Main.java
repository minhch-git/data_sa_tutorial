package test_01;

// Câu 1( 3 điểm)
    // Nêu khái niệm đệ quy, giải thuật đệ quy
    // Cho ví dụ về một giải thuật đệ quy
    // Ghi output của ví dụ đệ quy vừa tạo

public class Main {
    // Đệ quy: Ta nói một đối tượng là đệ quy nếu nó được định nghĩa qua chính nó.
    // Trong lập trình, một hàm được gọi là đệ quy khi nó gọi chính nó trong thân hàm.

    // Thuật toán được gọi là đệ quy nếu nó có lời giải được gọi đến nó một cách trực tiếp hay gián tiếp.
    // Giải thuật đệ quy: 
        // Điều kiện cơ sở: Điều kiện thoát khỏi đệ quy.
        // Phần đệ quy (Cú pháp): Thân hàm có chứa cú pháp lời gọi đệ quy.
            // Trong hàm đệ quy có lời gọi đến chính nó.
            // Mỗi lần có lời gọi thì kích thước của bài toán được thu nhỏ hơn trước.
            // Vấn đề nhỏ hơn này, đến một lúc nào đó sẽ đơn giản tới mức chương trình có thể tự giải quyết được mà không cần gọi tới chính nó nữa.(Điểm dùng của đệ quy)

        // Ví dụ giải thuật đệ quy:
            // Tính giai thừa của n (n!) biết rằng 0! = 1 và n! = (n-1)! x n với điều kiện là n >= 0
            // Để tính n! ta cần phải tính (n-1)!
            // Để tính (n-1)! ta phải tính (n-2)!
            // .....
            // 3! = 3 (3 * 2 * 1)
            // => 3! = 3 * (3-1)!
            // => 3! = 3 * 2 * (3-2)! = 6 * 1!
            // => 3! = 3 * 2 * 1 * (1-1)! = 6 * 0!
            // => 3! =  6 * 1 = 6;
        // => output:  3! = 6
    
    public static int factorial(int n) {
        if ( n < 0 ) {
            // Throw error
            System.err.println("Số giai thừa cần tìm phải lớn hơn 0");
        }
            

        if ( n == 0) 
            return 1;
        
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
