package com.example.examenandroid_sergipoza.ui.detallEsdev;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class detallEsdevViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public detallEsdevViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}