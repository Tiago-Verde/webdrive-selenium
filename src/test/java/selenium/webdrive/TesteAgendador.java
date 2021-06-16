package selenium.webdrive;

import java.util.Timer;
import java.util.TimerTask;

public class TesteAgendador extends TesteComandosBrowser {
	
		
		public static final long TEMPO = (1000 * 60);
	
		
	public static void main(String[] args) {
			
			
		System.out.println("Inicio");
		Timer timer = null;
		if (timer == null) {
			timer = new Timer();
			TimerTask tarefa = new TimerTask() {
				public void run() {
					try {
						System.out.println("Teste agendador");

						comandosBrowser();
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
		}
	}
	
}


		
	
