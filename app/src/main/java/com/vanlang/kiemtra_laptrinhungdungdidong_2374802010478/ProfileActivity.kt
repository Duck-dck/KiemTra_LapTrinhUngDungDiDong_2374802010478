package com.vanlang.kiemtra_laptrinhungdungdidong_2374802010478

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ListView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var tvUserEmail: TextView
    private lateinit var btnLogout: Button
    private lateinit var lvSubjects: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        //Ánh xạ view bằng findViewById cho bài 3
        lvSubjects = findViewById(R.id.lvSubjects)

        // 2.2. Ánh xạ View bằng findViewById
        tvUserEmail = findViewById(R.id.tvUserEmail)
        btnLogout = findViewById(R.id.btnLogout)

        // 2.4. Trích xuất dữ liệu từ Intent truyền sang và hiển thị lên TextView
        val email = intent.getStringExtra("USER_EMAIL")
        if (email != null) {
            tvUserEmail.text = "Email: $email"
        }

        // 2.5. Xử lý sự kiện Đăng xuất: gọi finish() để đóng màn hình và quay về Login
        btnLogout.setOnClickListener {
            finish()
        }
        val subjectList = listOf(
            "Lập trình Kotlin",
            "Thiết kế Layout XML",
            "Quản lý Git/GitHub",
            "Xử lý Intent",
            "Kiến trúc Android"
        )

        // 3.4. Sử dụng ArrayAdapter kèm layout mẫu của hệ thống để đổ dữ liệu lên ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, subjectList)
        lvSubjects.adapter = adapter

        // 3.5. Thiết lập sự kiện click cho từng item trong ListView
        lvSubjects.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = subjectList[position]
            // Hiển thị Toast thông báo tên phần tử đã chọn
            Toast.makeText(this, "Bạn đã chọn: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}