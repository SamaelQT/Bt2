package com.example.lab1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtAge, edtMssv;
    RadioButton rbtnMale, rbtnFemale;
    CheckBox cbFootball, cbGaming;
    Button btnSave;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtTen);
        edtAge = findViewById(R.id.edtTuoi);
        edtMssv = findViewById(R.id.edtMssv);

        rbtnMale = findViewById(R.id.rbtn_nam);
        rbtnFemale = findViewById(R.id.ebtn_nu);

        cbFootball = findViewById(R.id.cb_dabanh);
        cbGaming = findViewById(R.id.cb_choigame);

        btnSave = findViewById(R.id.btn_luu);

        txtResult = findViewById(R.id.txt_S);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String age = edtAge.getText().toString();

                String gender = "";
                if(rbtnMale.isChecked()) gender = "Nam";
                else if(rbtnFemale.isChecked()) gender = "Nữ";

                String hobbies = "";
                if(cbFootball.isChecked()) hobbies += "Đá banh, ";
                if(cbGaming.isChecked()) hobbies += "Chơi game";

                txtResult.setText("Tên: " + name + "\n" +
                        "Tuổi: " + age + "\n" +
                        "Giới tính: " + gender + "\n" +
                        "Sở thích: " + hobbies);
            }
        });
    }
}