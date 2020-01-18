package kangkan.developer.remove_findviewbyid;

import android.annotation.SuppressLint;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import kangkan.developer.remove_findviewbyid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.tvOne.setText("K one");
        binding.tvTwo.setText("K two");
        binding.tvThree.setText("K three");



    }
}
