package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Repos;

import java.util.List;
import java.util.Optional;

public interface ReposService {
    Repos saveRepos (Repos repos)  ;
    List<Repos> getListRepos();
    Optional<Repos> findRepos(int id)  ;
    void deleteRepos(int id);
    Repos updateRepos(Repos repos) ;
}
