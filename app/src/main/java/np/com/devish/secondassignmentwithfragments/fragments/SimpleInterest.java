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
public class SimpleInterest extends Fragment implements View.OnClickListener{

    private EditText etPrinciple, etRate, etTime;
    private Button btnCalculateSI;
    private TextView tvSIResult;

    public SimpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);
        etPrinciple = view.findViewById(R.id.etPrinciple);
        etRate = view.findViewById(R.id.etRate);
        etTime = view.findViewById(R.id.etTime);

        btnCalculateSI = view.findViewById(R.id.btnCalculateSI);
        tvSIResult = view.findViewById(R.id.tvSIResult);

        btnCalculateSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float principle, time, rate, result;

        principle = Float.parseFloat(etPrinciple.getText().toString());
        time = Float.parseFloat(etTime.getText().toString());
        rate = Float.parseFloat(etRate.getText().toString());

        result = (principle * time * rate)/100;
        tvSIResult.setText("The Simple Interest of Priciple Rs."+ principle + ", Time "+ time +" years and Rate "+ rate + " is Rs." + result + ".");
    }
}
