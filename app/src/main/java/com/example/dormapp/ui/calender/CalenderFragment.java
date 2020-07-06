package com.example.dormapp.ui.calender;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.dormapp.R;

public class CalenderFragment extends Fragment {

    private CalenderViewModel calenderViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        calenderViewModel =
                ViewModelProviders.of(this).get(CalenderViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calender, container, false);
        final TextView textView = root.findViewById(R.id.text_calender);
        calenderViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}