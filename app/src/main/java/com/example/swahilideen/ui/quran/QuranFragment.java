package com.example.swahilideen.ui.quran;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.swahilideen.R;

public class QuranFragment extends Fragment {

    private QuranViewModel quranViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        quranViewModel =
                ViewModelProviders.of(this).get(QuranViewModel.class);
        View root = inflater.inflate(R.layout.fragment_quran, container, false);
        final TextView textView = root.findViewById(R.id.text_view);
        quranViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}



