package com.example.dormapp.ui.calender;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
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
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.dormapp.R;

import java.util.ArrayList;

public class CalenderFragment extends Fragment {

    private CalenderViewModel calenderViewModel;
    Button week, month, year;
    private ArrayList<String> months = new ArrayList<String>();
    ListView list;
    LinearLayout linearLayout;
            Context context = getContext();




    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_calender, container, false);
        //list = root.findViewById(R.id.list);
        week = root.findViewById(R.id.week);
        month = root.findViewById(R.id.month);
        year = root.findViewById(R.id.year);
        linearLayout = root.findViewById(R.id.linTest);
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        float targetWidth = width / 3;
        float targetHeight = week.getLayoutParams().height;
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


        for(String element : months) {
            Button textView = new Button(getContext());
            textView.setText(element);
            linearLayout.addView(textView);

        }


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
}