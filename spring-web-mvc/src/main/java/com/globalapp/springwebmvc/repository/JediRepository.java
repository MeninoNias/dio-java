package com.globalapp.springwebmvc.repository;

import com.globalapp.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    private List<Jedi> jediRepository;

    public JediRepository() {
        this.jediRepository = new ArrayList<>();
        jediRepository.add(new Jedi("Luke", "Nias"));
    }

    public List<Jedi> getJediRepository() {
        return this.jediRepository;
    }


    public void add(Jedi jedi) {
        this.jediRepository.add(jedi);

    }
}
