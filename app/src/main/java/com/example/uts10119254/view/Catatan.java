package com.example.uts10119254.view;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uts10119254.Model.Database;
import com.example.uts10119254.Present.CreateActivity;
import com.example.uts10119254.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Catatan extends Fragment {

    String [] daftrar;
    ListView listView;
    Menu menu;
    protected Cursor cursor;
    Database database;
    public static Catatan c;
    private Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.catatan, container, false);

    }
}

//10119254_IkhlasulFZ_IF7