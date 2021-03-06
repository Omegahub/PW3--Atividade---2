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
	public String		cpf;
	
	
	public String toString(){
		return String.format("nome : %s \n email : %s \n  telefone : %s \n cpf : %s \n  ",nome,email,telefone, ehCpfValido());
	}

	
	public boolean ehCpfValido()
	{
	
			  int     d1, d2;
		      int     digito1, digito2, resto;
		      int     digitoCPF;
		      String  nDigResult;

		      d1 = d2 = 0;
		      digito1 = digito2 = resto = 0;

		      for (int nCount = 1; nCount < cpf.length() -1; nCount++)
		      {
		         digitoCPF = Integer.valueOf (cpf.substring(nCount -1, nCount)).intValue();
		         
		         d1 = d1 + ( 11 - nCount ) * digitoCPF;

		         d2 = d2 + ( 12 - nCount ) * digitoCPF;
		      };
		      
		      resto = (d1 % 11);

		      if (resto < 2)
		         digito1 = 0;
		      else
		         digito1 = 11 - resto;

		      d2 += 2 * digito1;
		      resto = (d2 % 11);
		      if (resto < 2)
		         digito2 = 0;
		      else
		         digito2 = 11 - resto;
		      String nDigVerific = cpf.substring (cpf.length()-2, cpf.length());
		      nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
		      return nDigVerific.equals(nDigResult);
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
