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
public class Armstrong extends Fragment implements View.OnClickListener{

    private EditText etArmstrongNumber;
    private Button btnCalculateArmstrong;
    private TextView tvArmstrongResult;
    public Armstrong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);

        etArmstrongNumber = view.findViewById(R.id.etArmstrongNumber);
        btnCalculateArmstrong = view.findViewById(R.id.btnCalculateArmstrong);
        tvArmstrongResult = view.findViewById(R.id.tvArmstrongResult);

        btnCalculateArmstrong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int c = 0, rem, temp;
        int n = Integer.parseInt(etArmstrongNumber.getText().toString());
        temp = n;
        while(n > 0){
            rem = n%10;
            n = n/10;
            c = c+(rem*rem*rem);
        }
        if (temp == c){
            tvArmstrongResult.setText("The number " + temp + " is a armstrong number.");
        }
        else {
            tvArmstrongResult.setText("The number " + temp + " is not a armstrong number.");
        }
    }
}
