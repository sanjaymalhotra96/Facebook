package com.example.dfavostudents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListPopupWindow;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.lang.reflect.Field;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner imageView;
    TextView textview;
    Spinner spinYear;
    MyAdaptor myAdaptor;
    ArrayList<SpinnerItems> years;
    Object item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newapplication2);
        imageView = findViewById(R.id.imageview);


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
                BottomSheetDialog dialog = new BottomSheetDialog(MainActivity.this, R.style.CustomBottomSheetDialogTheme);
                dialog.setContentView(view);
                dialog.show();

            }
        });


        years = new ArrayList<SpinnerItems>();

        for (int i = 2022; i < 3000; i++) {
            years.add(new SpinnerItems(Integer.toString(i)));
        }


        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_layout, years);

        spinYear = (Spinner) findViewById(R.id.imageview);
        myAdaptor = new MyAdaptor(this, years);
        spinYear.setAdapter(myAdaptor);


        spinYear.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                SpinnerItems item = years.get(position);

                // Showing selected spinner item
                Toast.makeText(getApplicationContext(), item.getYear(), Toast.LENGTH_LONG).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }


    @Override
    protected void onResume() {
        super.onResume();

    }






}