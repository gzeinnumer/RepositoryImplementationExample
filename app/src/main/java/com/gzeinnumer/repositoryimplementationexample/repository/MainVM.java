package com.gzeinnumer.repositoryimplementationexample.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class MainVM extends ViewModel {

    DummyRepositoryImpl repository;

    public MainVM() {
        repository = new DummyRepositoryImpl();
    }

    public LiveData<String> getData(){
        return repository.getStringRepository();
    }
}
