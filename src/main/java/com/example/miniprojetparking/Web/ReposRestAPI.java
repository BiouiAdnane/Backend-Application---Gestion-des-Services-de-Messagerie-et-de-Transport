package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Repos;
import com.example.miniprojetparking.Services.ConducteurService;
import com.example.miniprojetparking.Services.ReposService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class ReposRestAPI {
    private ReposService reposService;
    @GetMapping("/repos")
    public List<Repos> repos(){
        return reposService.getListRepos();
    }
    @GetMapping("/repos/{id}")
    public Optional<Repos> getRepos(@PathVariable int id) {
        return reposService.findRepos(id);
    }
    @PostMapping("/repos")
    public Repos saveRepos(@RequestBody Repos repos){
        return reposService.saveRepos(repos);
    }
    @PutMapping("/repos/{id}")
    public Repos updateRepos(@PathVariable int id,@RequestBody Repos repos) {
        repos.setCode_Repos(id);
        return reposService.updateRepos(repos);
    }
    @DeleteMapping("/repos/{id}")
    public void deleteRepos(@PathVariable int id){
        reposService.deleteRepos(id);
    }

}
