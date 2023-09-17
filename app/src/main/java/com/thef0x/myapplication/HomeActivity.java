package com.thef0x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Objects;

public class HomeActivity extends AppCompatActivity
{
    //Variables
    boolean isClicked = false;
    String str;
    
    Dialog myDialog;
    TextView receiver_msg;

    Button popupMatrix_btn;
    EditText popupMatrix_editText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        myDialog = new Dialog(this);

        Objects.requireNonNull(getSupportActionBar()).hide();
    }


    public void OnClick(View view)
    {
         if (view.getId() == R.id.btn_calculator)
         {
             myDialog.setContentView(R.layout.popup_matrix);

             //---
             popupMatrix_btn = myDialog.findViewById(R.id.popupMatrix_btn);
             popupMatrix_editText = myDialog.findViewById(R.id.popupMatrix_editText);

             myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
             myDialog.show();

             popupMatrix_btn.setOnClickListener(v -> {
                 str = popupMatrix_editText.getText().toString();
                 myDialog.dismiss();
             });
         }
         if (view.getId() == R.id.btn_vectors)
         {
             Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
         }

    }
}








