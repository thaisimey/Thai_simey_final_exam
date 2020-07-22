package com.example.thai_simey_final_exam.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.thai_simey_final_exam.R;
import com.example.thai_simey_final_exam.fragment.AccountFragment;
import com.example.thai_simey_final_exam.fragment.CategoriesFragment;
import com.example.thai_simey_final_exam.fragment.HomeFragment;
import com.example.thai_simey_final_exam.fragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TabActivity extends AppCompatActivity {

    Toolbar toolbar;
    private FrameLayout frame;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initElement();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        bottomNavigationView = findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectFragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.mnu_products:
                        selectFragment = new HomeFragment();
                        String title = getString(R.string.home);
                        getSupportActionBar().setTitle(title);
                        break;
                    case R.id.mnu_categories:
                        selectFragment = new CategoriesFragment();
                        String title1 = getString(R.string.categories);
                        getSupportActionBar().setTitle(title1);
                        break;
                    case R.id.mnu_profile:
                        setTitle(R.string.search);
                        selectFragment = new SearchFragment();
                        String title2 = getString(R.string.search);
                        getSupportActionBar().setTitle(title2);
                        break;
                    case R.id.mnu_settings:
                        setTitle(R.string.account);
                        selectFragment = new AccountFragment();
                        String title3 = getString(R.string.account);
                        getSupportActionBar().setTitle(title3);
                        break;
                }
                if (selectFragment != null ) {
                    showFragment(selectFragment);
                }
                return true;
            }
        });
    }

    private void initElement() {
        frame = findViewById(R.id.lytFragmentContainer);
        bottomNavigationView = findViewById(R.id.bottomNav);

        showFragment(new HomeFragment());
    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.lytFragmentContainer, fragment).commit();
    }
}
