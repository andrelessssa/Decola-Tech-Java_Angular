package dio_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import dio_jpa.model.User;
import dio_jpa.repository.UseerRepository;



@EnableJpaRepositories(basePackages = "dio_jpa.repository")
@ComponentScan(basePackages = "dio_jpa")
public class StartApp implements CommandLineRunner {

    @Autowired
    private UseerRepository repository;
    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setNome("André");
        user.setUsername("andre");
        user.setPassword("1234");

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
