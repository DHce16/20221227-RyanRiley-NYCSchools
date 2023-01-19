package com.example.a20230119_ryanriley_nycschools.presentation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import com.example.a20230119_ryanriley_nycschools.R;

public class SchoolListActivity extends AppCompatActivity {

    FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_list);

        fragmentContainerView = findViewById(R.id.fragment_container_view);

        // Fragment Container View
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, FragmentSchoolList.class, null)
                    .commit();
        }

    }
}
