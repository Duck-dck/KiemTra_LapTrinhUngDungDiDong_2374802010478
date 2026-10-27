# Bài Kiểm Tra Định Kỳ - Lập Trình Ứng Dụng Di Động

- **Họ và tên sinh viên:** [Tên của bạn]
- **Mã số sinh viên:** [MSSV của bạn]
- **Lớp / Mã học phần:** Lập trình ứng dụng di động

---

##  Giới thiệu chức năng ứng dụng
Ứng dụng Android gồm 3 phần chính:
1. **Câu 1 (Login):** Giao diện đăng nhập, kiểm tra ràng buộc (validation) email không được để trống và mật khẩu tối thiểu 6 ký tự.
2. **Câu 2 (Profile & Intent):** Màn hình thông tin cá nhân, nhận dữ liệu Email từ màn hình đăng nhập truyền sang thông qua `Intent` (`putExtra`).
3. **Câu 3 (ListView):** Hiển thị danh sách động gồm 5 môn học/kỹ năng sử dụng `ArrayAdapter` và xử lý sự kiện `Toast` khi bấm vào từng item.

---
##  Hình ảnh minh chứng kết quả (Screenshots)
Các hình ảnh kết quả thực thi được lưu tại thư mục `screenshots/`:
-`screenshots/cau1_validation_error.png` - Lỗi nhập sai/trống ở màn hình Login.
- `screenshots/cau1_validation_success.png` - Đăng nhập thành công.
- `screenshots/cau2_profile_intent.png` - Màn hình Profile nhận đúng Email.
- `screenshots/cau3_listview_display.png` - Danh sách ListView hiển thị đủ 5 item.
