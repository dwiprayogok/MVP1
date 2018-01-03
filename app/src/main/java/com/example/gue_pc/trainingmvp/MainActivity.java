package com.example.gue_pc.trainingmvp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements MainView {

    EditText hit_pnjang,hit_lebar;
    Button btn_hitung;
    int panjang;
    int lebar;
    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hit_lebar = findViewById(R.id.lebar);
        hit_pnjang = findViewById(R.id.pnjang);
        btn_hitung = findViewById(R.id.btn_hitung);

        presenter = new MainPresenter(this);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang = Integer.valueOf(hit_pnjang.getText().toString());
                lebar = Integer.valueOf(hit_lebar.getText().toString());
                presenter.hitungluas(panjang,lebar);
            }
        });
    }

    @Override
    public void tampilhasil(MainModel model) {
        new AlertDialog.Builder(MainActivity.this).setTitle("Luas").setMessage(String.valueOf(model.getLuas())).show();
    }
}
