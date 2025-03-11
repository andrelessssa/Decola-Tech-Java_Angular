package dio_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio_jpa.model.User;
import dio_jpa.reposytory.UseerRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UseerRepository repository;
    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setNome("André");
        user.setUsername("andre");
        user.setPassword("1234");

        User user2 = new User();
        user.setNome("André");
        user.setUsername("andree");
        user.setPassword("1235");

        repository.save(user);

        // pra listar um for

        for(User u : repository.findAll()){
            System.out.println(u);
        }

       
        
    }
    
}
