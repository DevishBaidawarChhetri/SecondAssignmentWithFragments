package np.com.devish.secondassignmentwithfragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import np.com.devish.secondassignmentwithfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Circle extends Fragment implements View.OnClickListener {

    private EditText etCircleRadius;
    private TextView tvRadiusResult;
    private Button btnCalculateCircle;

    public Circle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle, container, false);
        etCircleRadius = view.findViewById(R.id.etCircleRadius);
        btnCalculateCircle = view.findViewById(R.id.btnCalculateCircle);
        tvRadiusResult = view.findViewById(R.id.tvRadiusResult);

        btnCalculateCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float radius, result;

        radius = Float.parseFloat(etCircleRadius.getText().toString());
        result = (22 * radius * radius) / 7;
        tvRadiusResult.setText("The area of circle having radius "+ radius + " is " + result);

    }
}
