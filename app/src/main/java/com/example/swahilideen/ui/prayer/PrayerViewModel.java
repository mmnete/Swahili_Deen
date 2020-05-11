package com.example.swahilideen.ui.prayer;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrayerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PrayerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is prayer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
