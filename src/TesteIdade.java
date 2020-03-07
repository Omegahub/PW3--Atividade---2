import java.util.Date;

public class TesteIdade {
	public static void main(String[] args) {
		
		Cliente cl = new Cliente();
		
		Date dtget = DateTimeUtils.aniver(19, 11, 2002);
		cl.dtnasc = dtget;
	
		System.out.println(cl.dtnasc);
		System.out.println(cl.toString());
		
				
	}
	
	

}
