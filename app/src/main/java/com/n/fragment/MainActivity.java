package com.n.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private Boolean status = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();


        if(status)
        {

            FirstFragment ff = new FirstFragment();
            ft.add(R.id.RelativeContainer,ff);
            ft.replace(R.id.RelativeContainer,ff);
            ft.addToBackStack(null);
            ft.commit();
            btn.setText("load second fragment");
            status=false;

        }
        else
        {
            SecondFragment sf = new SecondFragment();
            ft.add(R.id.RelativeContainer,sf);
            ft.replace(R.id.RelativeContainer,sf);
            ft.addToBackStack(null);
            ft.commit();
            btn.setText("load first fragment");
            status=true;
        }

    }
}
