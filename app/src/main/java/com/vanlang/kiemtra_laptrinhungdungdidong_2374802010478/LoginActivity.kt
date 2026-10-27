package com.vanlang.kiemtra_laptrinhungdungdidong_2374802010478

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    // Khai báo biến view
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Ánh xạ View bằng findViewById
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvStatus = findViewById(R.id.tvStatus)

        // Xử lý sự kiện click button đăng nhập
        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            // 1. Kiểm tra bỏ trống email hoặc mật khẩu
            if (email.isEmpty()) {
                tvStatus.text = "Lỗi: Email không được để trống!"
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                tvStatus.text = "Lỗi: Mật khẩu không được để trống!"
                return@setOnClickListener
            }

            // 2 .Kiểm tra định dạng Email bằng Patterns.EMAIL_ADDRESS
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvStatus.text = "Lỗi: Email sai định dạng!"
                return@setOnClickListener
            }

            // 3.Kiểm tra độ dài mật khẩu (< 6 ký tự)
            if (password.length < 6) {
                tvStatus.text = "Lỗi: Mật khẩu phải có từ 6 ký tự trở lên!"
                return@setOnClickListener
            }

            // 4. Dữ liệu hoàn toàn hợp lệ
            tvStatus.text = "Xác thực thành công!"
            // Khởi tạo Intent tường minh (Explicit Intent)
            val intent = Intent(this, ProfileActivity::class.java)
            // Đóng gói Email truyền đi
            intent.putExtra("USER_EMAIL", email)
            // Bắt đầu chuyển Activity
            startActivity(intent)
        }
    }
}