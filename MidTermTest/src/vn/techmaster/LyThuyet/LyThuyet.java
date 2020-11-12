package vn.techmaster.LyThuyet;

public class LyThuyet {
/*
1.	Lý thuyết
a.	Nêu các khía cạnh có thể sử dụng để so sánh giữa các thuật toán sort: Selection sort, Insertion sort và Bubble sort
b.	Collection.sort trong Java (bản hiện tại 2020/11/12) sử dụng thuật toán Tim sort. Hãy cho biết Tim sort là gì? Trình bày hiểu biết về Tim sort
c.	External sort là gì? Mô tả thực hiện sắp xếp 3GB dữ liệu sử dụng 1GB dữ liệu bằng Tim sort.
d.	Giải thuật trên còn có tên là k-way, nêu ý nghĩa của giá trị k trong thực tiễn (gợi ý: cách chọn giá trị k, có khả năng thực hiện song song ko? )

 */
//    a.
//
//    Bubble Sort: Sắp xếp nổi bọt
//    -Chạy từ đầu đến cuối mảng.
//    -Nếu phần tử đứng trước mà lớn hơn phần tửđứng sau thì đổi chỗ.
//    -Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống dưới.
//
//    Insertion Sort: Sắp xếp chèn
//    -Chạy từ đầu đến cuối mảng.
//    -Tại vòng lặp i, coi như dãy từ [0, i-1] đã được sắp xếp, chèn phần tử a[i] vào vị trí
//    thích hợp.
//    -Sau vòng lặp thứ i thì dãy [0, i] đã được sắp xếp.
//
//    Selection Sort: Sắp xếp chọn
//    - Chạy từ đầu đến cuối mảng.
//    - Tại vòng lặp thứ i, tìm phần tử nhỏ nhất từ
//    [i+1,n-1] , nếu nhỏ hơn a[i] thì đổi chỗ cho a[i].
//    - Sau vòng lặp thứ i, thì dãy [0, i] đã được sắp
//    xếp.
//
//    b. Tim short là sự kết hợp giữ Merge sort và Quick sort
//
//    c. External sort là lớp thuật toán để  là một lớp thuật toán sắp xếp có thể xử lý một lượng lớn dữ liệu.
//    External sort được dùng khi dữ liệu được sắp xếp không vừa với bộ nhớ chính của thiết bị máy tính (thường là RAM)
//    và thay vào đó chúng phải nằm trong bộ nhớ ngoài chậm hơn, thường là ổ đĩa cứng.
//
//            Tim short là sự kết hợp giữ Merge sort và Quick sort. Với 3Gb dữ liệu mà chỉ sử dụng 1GB dữ liệu.
//
//    Đưa dữ liệu vào rồi sort 1 Gb dữ liệu ra 3 mảng
//
//            [lấy 150Mb từ 1Gb] ( Gọi là F1 )  => Sort vào trong [ 1G ]
//
//            [lấy 150Mb từ 1Gb] ( Gọi là F2 )  => Sort vào trong [ 1G ]
//
//            [lấy 150Mb từ 1Gb] ( Gọi là F3 )  => Sort vào trong [ 1G ]
//
//
//            [ [150Mb]+[150Mb]+[150Mb] = 450 Mb  ] đưa vào 1 Gb dữ liệu sort rồi đẩy ra bộ nhớ mới, cứ làm thế tiếp tục cho đến khi sort hết 3Gb dữ liệu
//
//    d. kỹ thuật k-way merging. Kỹ thuật này có thể được hiểu đơn giản là:
//
//    Input: k : là danh sách đầu vào đã được sắp xếp ở từng danh sách
//    Output: Một danh sách chứa tất cả các phần tử của k danh sách trên và đã được sắp xếp.
//    Thực hiện một vòng lặp đến khi tất cả các danh sách đều rỗng thì dừng lại với 2 bước trong mỗi vòng lặp như sau:
//    Tìm phần tử nhỏ nhất trong số các phần tử đầu tiên của các danh sách. (vì các phần tử đầu tiên của mỗi danh sách là phần tử nhỏ nhất trong mỗi danh sách,
//    nên phần tử tìm được sẽ là phần tử nhỏ nhất đang nằm trong k danh sách.)
//    Đẩy phần tử tìm được vào danh sách kết quả, và xóa nó khỏi danh sách hiện tại của nó. Quay lại thực hiện bước 1.
//
//    Như vậy với giải thuật trên, ta sẽ thực hiện được merge sort với số phép so sánh ở trường hợp tệ nhất là (k-1)(n-(k/2)).
//
//    Về tư tưởng là vậy, có một giải pháp để giảm độ phức tạp này, cụ thể là trong bước tìm phần tử nhỏ nhất trong số các phần tử đầu của mỗi danh sách,
//    đó là sử dụng min-heap (Cấu trúc dữ liệu này cho phép phần tử đầu tiên của heap luôn là phần tử nhỏ nhất với độ phức tạp của các thao tác cỡ hàm log).


}
