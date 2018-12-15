# Bài tập chương 4: Biến và các kiểu dữ liệu
## Bài 1:
Điền từ thích hợp vào chỗ trống mỗi câu sau:
a. Biến thực thể thuộc các kiểu char, byte, short, int, long, float, và double đều có giá trị mặc đinh là _______.

b. Biến thực thể thuộc kiểu boolean có giá trị mặc định là _______.

c. Các kiểu dữ liệu trong Java được phân thành hai loại: các kiểu _______ và các kiểu _______.
## Bài 2:
Các phát biểu sau đây đúng hay sai?

a. Có thể gọi phương thức từ một biến kiểu cơ bản.

b. Các đối tượng được tạo ra đều tồn tại trong bộ nhớ heap cho đến khi chương trình kết thúc.

c. Lúc nào một đối tượng thuộc diện dùng được cũng cần phải có một tham chiếu chiếu tới nó.

d. Các giá trị cos dạng dấu chấm động trong mã nguồn được hiểu mặc định là các giá trị trực tiếp dấu chấm động thuộc kiểu float.
## Bài 3:
Biến thực thể dùng để làm gì?
## Bài 4:
Tham số của phương thúc main() là một mảng String. Mảng này là danh sách các tham số dòng lệnh khi ta chạy chương trình.

Ví dụ, khi chạy lệnh java CowArrayDemo foo bar từ dấu nhắc cửa sổ lệnh. Mảng args[] sẽ chứa các xâu kí tự foo và bar.

Hãy viết một chương trình in ra màn hình tất cả tham số dòng lệnh đã nhận được.
## Bài 5:
Tìm và sửa lỗi của các chương trình sau (mỗi phần là một file mã nguồn hoàn chỉnh).

a.
```sh
class Books {
  String title;
  String author;
 }
 
class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books(3);
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
  
```
b.
```sh
public class Hobbits {
    String name;
    
    public static void main(String[] args) {
        Hobbits [] h = new Hobbits[3];
        int z = 0;
        
        while (z < 4) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
```
## Bài 6:
Cho chương trình sau, liệt kê các đối tượng HeapQuiz được tạo ra; hỏi đến đoạn //do stuff thì các phần tử mảng hq[0] cho tới hq[4]

chiếu tới đối tượng nào.
```sh
class HeapQuiz {
    int id = 0;
    public static void main(String[] args) {
        int x = 0;
        HeapQuiz [] hq = new HeapQuiz[5];
        while ( x < 3 ) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        // do stuff
    }
}
```
## Bài 7:
Dần nhờ Tí và Sửu giúp viết nhanh một đoạn mã xử lý danh bạ điện thoại cho điện thoại di động, người nào

có giải pháp tốt hơn sẽ được trả công bằng một túi bỏng ngô. Sau khi nghe Dần mô tả, Sửu viết lên bảng đoạn mã sau:
```sh
Contact[] a = new Contact[10];
while ( x < 10) { // tạo 10 đối tượng Contact
  a[x] = new Contact();
  x = x + 1;
}
// Dùng mảng a để cập nhật danh bạ
```
Tí nhìn qua rồi cười "Điện thoại đi dộng bộ nhớ bé tí mà cậu hoang phí quá!". NÓi đoạn, Tí viết:
```sh
Contact ref;
while ( x < 10 ) {
  ref = new Contact();
  x = x + 1;
}
// Dùng ref để cập nhật danh bạ
```
Viết xong, Tí hể hả "Bỏng ngô là của tớ rồi!". Dần cười "Tiết kiệm bộ nhớ hơn thật, nhưng cậu phải ăn ké với Sửu thôi."

*Tại sao Dần lại quyết định như vây?*
