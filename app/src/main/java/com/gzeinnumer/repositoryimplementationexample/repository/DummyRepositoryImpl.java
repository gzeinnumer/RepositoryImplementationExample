package com.gzeinnumer.repositoryimplementationexample.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class DummyRepositoryImpl implements DummyRepository{

    public DummyRepositoryImpl() {
    }

    @Override
    public LiveData<String> getStringRepository() {
        MutableLiveData<String> str = new MutableLiveData<>();
        str.setValue("String From DummyRepositoryImpl");

        return str;
    }
}
