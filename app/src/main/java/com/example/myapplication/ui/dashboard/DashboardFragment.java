package com.example.myapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final Button button = binding.button0;
        final TextView textView = binding.textView5;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getVisibility() == View.GONE) {
                    textView.setVisibility(View.VISIBLE);
                } else {
                    textView.setVisibility(View.GONE);
                }
            }
        });

        final Button button1 = binding.button1;
        final TextView textView1 = binding.textView6;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView1.getVisibility() == View.GONE){
                    textView1.setVisibility(View.VISIBLE);
                } else {
                    textView1.setVisibility(View.GONE);
                }
            }
        });

        final Button button2 = binding.button2;
        final TextView textView2 = binding.textView7;

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getVisibility() == View.GONE){
                    textView2.setVisibility(View.VISIBLE);
                } else {
                    textView2.setVisibility(View.GONE);
                }
            }
        });
        final Button button3 = binding.button3;
        final TextView textView3 = binding.textView8;

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView3.getVisibility() == View.GONE){
                    textView3.setVisibility(View.VISIBLE);
                } else {
                    textView3.setVisibility(View.GONE);
                }
            }
        });
        final Button button4 = binding.button4;
        final TextView textView4 = binding.textView9;

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView4.getVisibility() == View.GONE){
                    textView4.setVisibility(View.VISIBLE);
                } else {
                    textView4.setVisibility(View.GONE);
                }
            }
        });
        final Button button5 = binding.button5;
        final TextView textView5 = binding.textView10;

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView5.getVisibility() == View.GONE){
                    textView5.setVisibility(View.VISIBLE);
                } else {
                    textView5.setVisibility(View.GONE);
                }
            }
        });

        final Button button6 = binding.button6;
        final TextView textView6 = binding.textView11;

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView6.getVisibility() == View.GONE){
                    textView6.setVisibility(View.VISIBLE);
                } else {
                    textView6.setVisibility(View.GONE);
                }
            }
        });



        return root;

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}