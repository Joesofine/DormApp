package com.example.dormapp.ui.foodclub;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FoodclubViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FoodclubViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}