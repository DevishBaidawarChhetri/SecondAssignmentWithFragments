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
public class Palindrome extends Fragment implements View.OnClickListener{

    private EditText etPalindrome;
    private Button btnCalculatePalindrome;
    private TextView tvPalindromeResult;

    public Palindrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_palindrome, container, false);
        etPalindrome = view.findViewById(R.id.etPalindrome);
        btnCalculatePalindrome = view.findViewById(R.id.btnCalculatePalindrome);
        tvPalindromeResult = view.findViewById(R.id.tvPalindromeResult);

        btnCalculatePalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int rem, sum = 0, temp;

        int n = Integer.parseInt(etPalindrome.getText().toString());

        temp = n;

        while (n > 0){
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n/10;
        }

        if (temp==sum){
            tvPalindromeResult.setText("The number " + temp + " is a palindrome number.");
        }
        else {
            tvPalindromeResult.setText("The number " + temp + " is not a palindrome number.");
        }
    }
}
