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
public class Automorphic extends Fragment implements View.OnClickListener {

    private EditText etAutomorphicNumber;
    private Button btnCalculateAutomorphic;
    private TextView tvAutomorphicResult;

    public Automorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etAutomorphicNumber = view.findViewById(R.id.etAutomorphicNumber);
        btnCalculateAutomorphic = view.findViewById(R.id.btnCalculateAutomorphic);
        tvAutomorphicResult = view.findViewById(R.id.tvAutomorphicResult);

        btnCalculateAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(etAutomorphicNumber.getText().toString());
        int square = number * number;

        int i = 0;
        int copy = number;
        while (copy>0){
            i = i+1;
            copy = copy/10;
        }
        int end = square % (int)Math.pow(10,i);
        if (number == end){
            tvAutomorphicResult.setText("The number " + number +" is a automorphic number.");
        }
        else {
            tvAutomorphicResult.setText("The number " + number + " is not an automorphic number.");
        }
    }
}
