package com.example.dormapp.ui.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.dormapp.R;
import com.example.dormapp.ui.agenda.MeetingFragment;
import com.example.dormapp.ui.cleaning.CleaningFragment;
import com.example.dormapp.ui.rules.RulesFragment;

public class MoreFragment extends Fragment {

        Button agenda, cleaning, rules;


        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            View root = inflater.inflate(R.layout.fragment_more, container, false);

            agenda = root.findViewById(R.id.meeting_button);
            cleaning = root.findViewById(R.id.cleaning_button);
            rules = root.findViewById(R.id.rules_button);

            agenda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MoreFragment.this.getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new MeetingFragment()).addToBackStack(null).commit();
                }
            });

            cleaning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MoreFragment.this.getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new CleaningFragment()).addToBackStack(null).commit();
                }
            });

            rules.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MoreFragment.this.getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new RulesFragment()).addToBackStack(null).commit();
                }
            });

            return root;
        }
}