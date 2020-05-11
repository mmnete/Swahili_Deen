package com.example.swahilideen.ui.quran;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuranViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QuranViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is quran fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}


