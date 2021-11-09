package app.interstitial.adguide;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import app.interstitial.adguide.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public Helper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        helper = new Helper(this);

        binding.btnInterstitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.showInterstitialAd();
            }
        });

        binding.btnInterstitialCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.showCounterInterstitialAd(6);
            }
        });
    }
}