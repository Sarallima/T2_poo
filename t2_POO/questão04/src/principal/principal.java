package principal;

import java.util.Calendar;

public class principal {

	public static void main(String[] args) {

		
  int data,mes,ano,hora,minuto;
  
  Calendar cal = Calendar.getInstance();
  data = cal.get(Calendar.DAY_OF_MONTH);
  mes = cal.get(Calendar.MONTH)+1;
  ano= cal.get(Calendar.YEAR);
  
  System.out.println("Data atual:" + data + "/" + mes + "/" + ano);

  switch(mes) {
  case 1:
	  System.out.println("Janeiro");break;
  case 2:
	  System.out.println("Fevereiro");break;
  case 3:
	  System.out.println("Março");break;
  case 4:
	  System.out.println("Abril");break;
  case 5:
	  System.out.println("Maio");break;
  case 6:
	  System.out.println("Junho");break;
  case 7:
	  System.out.println("Julho");break;
  case 8:
	  System.out.println("Agosto");break;
  case 9:
	  System.out.println("Sembro");break;
  case 10: 
	  System.out.println("Outubro");break;
  case 11: 
	  System.out.println("Novembro");break;
  case 12:
	  System.out.println("Dezembro");break;
	  
  }
  System.out.println("------------------");
  hora = cal.get(Calendar.HOUR);
  minuto = cal.get(Calendar.MINUTE);
  System.out.println(hora  +  " horas e "  +  minuto + "minutos");
  
	}

}
