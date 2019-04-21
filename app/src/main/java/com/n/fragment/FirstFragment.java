package com.n.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener{


    private Button btnSum;
    private EditText Sum1, Sum2;
    private TextView result;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);


        Sum1 = view.findViewById(R.id.Sum1);
        Sum2 = view.findViewById(R.id.Sum2);
        btnSum = view.findViewById(R.id.btnSum);
        result = view.findViewById(R.id.result);

        btnSum.setOnClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {


        int first = Integer.parseInt(Sum1.getText().toString());
        int second = Integer.parseInt(Sum2.getText().toString());

        int total = first + second;

        Toast.makeText(getActivity(), "Sum is" + total , Toast.LENGTH_SHORT).show();
        result.setText(Integer.toString(total));
    }
}
