package dio.sringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // aqui eu digo que ele tera um componete e vou la na calculadoora e digo que é tbm um componete
public class MyApp implements CommandLineRunner{   // essa impelmentacao vai fazer com que quando o servidor subir ela inicialize
    
    @Autowired // atraves dele é realizada a injecao de dependencia
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calculadora.somar(2,7));
        
        
    }  
    
    
}
