import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Cliente {
	public static void main(String[] args) {
		
	}
	
	public String 	nome;
	public String 	email;
	public String 	telefone;
	public Date 	dtnasc;
	public int 		cpf;
	
	
	public String toString(){
		return String.format("maior : %s \n  ", ehMaiorIdade());
	}

	
	public boolean ehCpfValido()
	{
		return true;
	}
	
	public boolean ehMaiorIdade()
	{
		LocalDate nasc = dtnasc.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		if(LocalDate.now().until(nasc, ChronoUnit.YEARS) * -1 >= 18 )
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	

	
	
}
