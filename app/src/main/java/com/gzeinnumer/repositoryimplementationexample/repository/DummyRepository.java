package com.gzeinnumer.repositoryimplementationexample.repository;

import androidx.lifecycle.LiveData;

public interface DummyRepository {
    LiveData<String> getStringRepository();
}
