package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Repos;
import com.example.miniprojetparking.Repositorys.ReposRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class ReposServiceImpl implements ReposService{
    private ReposRepo reposRepo;
    @Override
    public Repos saveRepos(Repos repos) {
        return reposRepo.save(repos);
    }

    @Override
    public List<Repos> getListRepos() {
        return reposRepo.findAll();
    }

    @Override
    public Optional<Repos> findRepos(int id) {
        return reposRepo.findById(id);
    }

    @Override
    public void deleteRepos(int id) {
        reposRepo.deleteById(id);
    }

    @Override
    public Repos updateRepos(Repos repos) {
        return reposRepo.save(repos);
    }
}
