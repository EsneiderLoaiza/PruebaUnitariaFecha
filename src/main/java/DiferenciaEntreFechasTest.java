
import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tutorialesvip.tutorialunittest.util.DiferenciaEntreFechas;


public class DiferenciaEntreFechasTest {
		
		@Autowired
		DiferenciaEntreFechas diferenciaEntreFechas;
	
		@Test
		void calculateYearsOfIndependency() {
			
			System.out.println("Inicia test");
			diferenciaEntreFechas = new DiferenciaEntreFechas();
			
			LocalDate today = LocalDate.now();
			String fechaIndependencia = "27/02/1844";
			
			Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia);
			
//			System.out.println(resultado.getDays());
//			System.out.println(resultado.getMonths());
//			System.out.println(resultado.getYears());
			
			Assertions.assertEquals(4, resultado.getDays());
			Assertions.assertEquals(4, resultado.getMonths());
			Assertions.assertEquals(177, resultado.getYears());
			
			System.out.println("Fin test");
		}	


}
