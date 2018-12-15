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
        // TODO code application logic here
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
