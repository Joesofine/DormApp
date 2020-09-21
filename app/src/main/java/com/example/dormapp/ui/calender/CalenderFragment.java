package com.example.dormapp.ui.calender;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.dormapp.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class CalenderFragment extends Fragment implements View.OnClickListener{

    Button week, month, year;
    private ArrayList<String> months = new ArrayList<String>();
    private ArrayList<String> weeks = new ArrayList<String>();
    private ArrayList<String> years = new ArrayList<String>();
    ListView list;
    LinearLayout linearLayout;
    Context context = getContext();
    float targetWidth;
    float targetHeight;




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_calender, container, false);
        //list = root.findViewById(R.id.list);
        week = root.findViewById(R.id.week);
        month = root.findViewById(R.id.month);
        year = root.findViewById(R.id.year);
        linearLayout = root.findViewById(R.id.linTest);

        week.setOnClickListener(this);
        month.setOnClickListener(this);
        year.setOnClickListener(this);

        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        targetWidth = width / 3;
        targetHeight = week.getLayoutParams().height;
        week.setLayoutParams(new LinearLayout.LayoutParams((int) targetWidth, (int) targetHeight));
        month.setLayoutParams(new LinearLayout.LayoutParams((int) targetWidth, (int) targetHeight));
        year.setLayoutParams(new LinearLayout.LayoutParams((int) targetWidth, (int) targetHeight));

        months.add("januar");
        months.add("Februar");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        for (int i = 1; i <= 52; i++) {
            String st = "U" + i;
            weeks.add(st);
        }

        String timeStamp = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
        for (int i = 2019; i <= Integer.parseInt(timeStamp); i++) {
            years.add(String.valueOf(i));
        }

        topButton();


        Context activity = getActivity();

        if(activity == null){
            System.out.println("tets");
        }

/*
        final ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.calender_list_element,
                R.id.calender_list_text, months);

        list.setAdapter(adapter);
        list.canScrollHorizontally(1);
        list.setRotation(-90);
 */

        return root;
    }

        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void onClick(View v) {
        if (v == week || v == month || v == year) {
            if (v == week){
                linearLayout.removeAllViews();
                week.setBackground(getResources().getDrawable(R.color.Slider));
                month.setBackground(getResources().getDrawable(R.color.ButtonLight));
                year.setBackground(getResources().getDrawable(R.color.ButtonLight));
                float sliderButtonWidth = targetWidth - 100;
                for(String element : weeks) {
                    Button button = new Button(getContext());
                    button.setText(element);
                    button.setLayoutParams(new LinearLayout.LayoutParams((int) sliderButtonWidth, (int) targetHeight));
                    button.setBackgroundColor(0xB5E9FF);
                    linearLayout.addView(button);
                }
            } else if (v == month){
                linearLayout.removeAllViews();
                week.setBackground(getResources().getDrawable(R.color.ButtonLight));
                month.setBackground(getResources().getDrawable(R.color.Slider));
                year.setBackground(getResources().getDrawable(R.color.ButtonLight));
                float sliderButtonWidth = targetWidth - 40;
                for(String element : months) {
                    Button button = new Button(getContext());
                    button.setText(element);
                    button.setLayoutParams(new LinearLayout.LayoutParams((int) sliderButtonWidth, (int) targetHeight));
                    button.setBackgroundColor(0xB5E9FF);
                    linearLayout.addView(button);
                }
            } else if (v == year){
                linearLayout.removeAllViews();
                week.setBackground(getResources().getDrawable(R.color.ButtonLight));
                month.setBackground(getResources().getDrawable(R.color.ButtonLight));
                year.setBackground(getResources().getDrawable(R.color.Slider));
                float sliderButtonWidth = targetWidth * 3 /years.size();
                for(String element : years) {
                    Button button = new Button(getContext());
                    button.setText(element);
                    button.setLayoutParams(new LinearLayout.LayoutParams((int) sliderButtonWidth, (int) targetHeight));
                    button.setBackgroundColor(0xB5E9FF);
                    linearLayout.addView(button);

                }
            }
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void topButton() {
        linearLayout.removeAllViews();
        week.setBackground(getResources().getDrawable(R.color.ButtonLight));
        month.setBackground(getResources().getDrawable(R.color.Slider));
        year.setBackground(getResources().getDrawable(R.color.ButtonLight));
        float sliderButtonWidth = targetWidth - 40;
        for (String element : months) {
            Button button = new Button(getContext());
            button.setText(element);
            button.setLayoutParams(new LinearLayout.LayoutParams((int) sliderButtonWidth, (int) targetHeight));
            button.setBackgroundColor(0xB5E9FF);
            linearLayout.addView(button);

        }
    }
}