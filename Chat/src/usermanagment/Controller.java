package usermanagment;


public class Controller 
{
	private UserGui user;
	private Passwort pw;
	
	public Controller()
	{
		this.user = new UserGui();
		registriereLsitener();
	}
	public void registriereLsitener()
	{
		user.getBtnNewAnmelden().addActionListener(e-> {anmelden();});
	}
	
	public void anmelden()
	{
		String passwortEingabe = user.getTextPasswort().getText(); //1
		int passwortHashEingabe = passwortHashCode(passwortEingabe); //2
		
		int passwortHashDB = 5; //3 => ABFRAGE DB
		
		if (passwortHashEingabe == passwortHashDB) //4
		{
			// Anmeldung ok
			System.out.println("");
		}
		{
			// stimmt nicht
			System.out.println("");
		}
			
		
		try
		{
			
		}
		catch (Exception e)
		{
			
		}
		
		/*
		 * 1. Daten aus GUI holen
		 * 2. PW - Hash
		 * 3. Datenbankabfrage
		 * 4. Vergleich von 3 und 2 => USER klartext => PW als HASH!!!
		 * 
		 * => stimmt => ANMELDUNG OK
		 * => stimmt nicht => Meldung "Anmeldung fehlerhaft" => SOCKET.close
		 * 
		 * */
		
	}

	public int passwortHashCode(String passwort) {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passwort == null) ? 0 : passwort.hashCode());
		return result;
	}
	
}
