package dio.sringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SegundosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundosPassosApplication.class, args);

		//Calculadora calculadora = new Calculadora();

		//System.out.println("O resultado é " + calculadora.somar(2,7));
		// assim eu nao estou trabalhando com o spring que é um inversor de controle
		// nao uso mais new

	}

}
