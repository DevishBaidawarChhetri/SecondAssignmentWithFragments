package np.com.devish.secondassignmentwithfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import np.com.devish.secondassignmentwithfragments.fragments.Armstrong;
import np.com.devish.secondassignmentwithfragments.fragments.Automorphic;
import np.com.devish.secondassignmentwithfragments.fragments.Circle;
import np.com.devish.secondassignmentwithfragments.fragments.Palindrome;
import np.com.devish.secondassignmentwithfragments.fragments.SimpleInterest;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnCircle, btnPalendrome, btnSI, btnArmstrong, btnAutomorphic, btnSwapping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Binding
        btnCircle = findViewById(R.id.btnCircle);
        btnPalendrome = findViewById(R.id.btnPalendrome);
        btnSI = findViewById(R.id.btnSI);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic =  findViewById(R.id.btnAutomorphic);
        btnSwapping = findViewById(R.id.btnSwapping);

        btnCircle.setOnClickListener(this);
        btnPalendrome.setOnClickListener(this);
        btnSI.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAutomorphic.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnCircle:
                Circle circle = new Circle();
                fragmentTransaction.replace(R.id.fragmentContainer, circle);
                fragmentTransaction.commit();
                break;
            case R.id.btnPalendrome:
                Palindrome palindrome = new Palindrome();
                fragmentTransaction.replace(R.id.fragmentContainer, palindrome);
                fragmentTransaction.commit();
                break;
            case R.id.btnSI:
                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.fragmentContainer, simpleInterest);
                fragmentTransaction.commit();
                break;
            case R.id.btnAutomorphic:
                Automorphic automorphic = new Automorphic();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphic);
                fragmentTransaction.commit();
                break;
            case R.id.btnArmstrong:
                Armstrong armstrong = new Armstrong();
                fragmentTransaction.replace(R.id.fragmentContainer, armstrong);
                fragmentTransaction.commit();
                break;
        }
    }
}
