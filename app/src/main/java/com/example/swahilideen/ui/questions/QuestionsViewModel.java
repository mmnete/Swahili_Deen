package com.example.swahilideen.ui.questions;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuestionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QuestionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is questions fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

