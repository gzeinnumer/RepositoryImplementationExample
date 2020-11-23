# RepositoryImplementationExample
 
- Implementation
```java
implementation "androidx.lifecycle:lifecycle-viewmodel:2.2.0"
```

- Interface
```java
public interface DummyRepository {
    LiveData<String> getStringRepository();
}
```

- Repository Implementation
```java
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
```

- ViewModel
```java
public class MainVM extends ViewModel {

    DummyRepositoryImpl repository;

    public MainVM() {
        repository = new DummyRepositoryImpl();
    }

    public LiveData<String> getData(){
        return repository.getStringRepository();
    }
}
```

- MainActivity
```java
MainVM viewModel = new ViewModelProvider(this).get(MainVM.class);

viewModel.getData().observe(this, new Observer<String>() {
    @Override
    public void onChanged(String s) {
        Log.d(TAG, "onChanged: "+s);
    }
});
```

---

```
Copyright 2020 M. Fadli Zein
```