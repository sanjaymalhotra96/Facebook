package com.example.dfavostudents;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BankDetails extends AppCompatActivity implements View.OnTouchListener {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    BanksAdaptor bankAdaptor;
    FloatingActionButton fab;
    private final static float CLICK_DRAG_TOLERANCE = 10; // Often, there will be a slight, unintentional, drag when the user taps the FAB, so we need to account for this.
    private float downRawX, downRawY;
    private float dX, dY;
    ConstraintLayout constraintLayout;

     BottomSheetDialog bottomSheetDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bankdetails);
        recyclerView = findViewById(R.id.recyclerview);
        fab = findViewById(R.id.floatingActionButton);
        constraintLayout=findViewById(R.id.bottom);
        setRecylerview();
        fab.setOnTouchListener(this);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void setRecylerview() {
        bankAdaptor = new BanksAdaptor(this);
        linearLayoutManager = new LinearLayoutManager(this.getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(bankAdaptor);
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        int action = motionEvent.getAction();
        if (action == MotionEvent.ACTION_DOWN) {
            fab.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.purple_700)));
            downRawX = motionEvent.getRawX();
            downRawY = motionEvent.getRawY();
            dX = view.getX() - downRawX;
            dY = view.getY() - downRawY;

            return true; // Consumed

        } else if (action == MotionEvent.ACTION_MOVE) {
            fab.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.text)));
            int viewWidth = view.getWidth();
            int viewHeight = view.getHeight();

            View viewParent = (View) view.getParent();
            int parentWidth = viewParent.getWidth();
            int parentHeight = viewParent.getHeight();

            float newX = motionEvent.getRawX() + dX;
            newX = Math.max(0, newX); // Don't allow the FAB past the left hand side of the parent
            newX = Math.min(parentWidth - viewWidth, newX); // Don't allow the FAB past the right hand side of the parent

            float newY = motionEvent.getRawY() + dY;
            newY = Math.max(0, newY); // Don't allow the FAB past the top of the parent
            newY = Math.min(parentHeight - viewHeight, newY); // Don't allow the FAB past the bottom of the parent

            view.animate()
                    .x(newX)
                    .y(newY)
                    .setDuration(0)
                    .start();

            return false; // Consumed

        } else if (action == MotionEvent.ACTION_UP) {
            fab.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.orange)));
            float upRawX = motionEvent.getRawX();
            float upRawY = motionEvent.getRawY();

            float upDX = upRawX - downRawX;
            float upDY = upRawY - downRawY;

            if (Math.abs(upDX) < CLICK_DRAG_TOLERANCE && Math.abs(upDY) < CLICK_DRAG_TOLERANCE) { // A click
                //return performClick();
            } else { // A drag
                return true; // Consumed
            }

        } else {
            return super.onTouchEvent(motionEvent);
        }


        return false;
    }
    }