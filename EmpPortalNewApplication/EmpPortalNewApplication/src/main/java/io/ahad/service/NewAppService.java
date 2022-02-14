package io.ahad.service;

import org.springframework.stereotype.Service;

import io.ahad.entity.NewApp;

import java.util.List;

@Service
public interface NewAppService {
    public List<NewApp> getAll();
    public NewApp getById(long id);
    public NewApp add(NewApp newApp);
    public void update(long id, NewApp newApp);
    public void delete(long id);
}
