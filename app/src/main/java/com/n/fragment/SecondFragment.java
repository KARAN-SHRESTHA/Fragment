package com.n.fragment;


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
public class SecondFragment extends Fragment implements View.OnClickListener {


    private EditText Radius;
    private Button btnArea;
    private TextView out;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);

        Radius = view.findViewById(R.id.Radius);
        btnArea = view.findViewById(R.id.btnArea);
        out = view.findViewById(R.id.out);
        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float radius = Float.parseFloat(Radius.getText().toString());
        float area = 3.14f * radius * radius;
        out.setText(Float.toString(area));
        Toast.makeText(getActivity(), "area is" + area , Toast.LENGTH_SHORT).show();

    }
}
