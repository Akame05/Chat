package usermanagment;

public class Registrieren
{

	private String name;
	private String nachname;
	private String email;
	private int nummer;
	private Passwort passwort;
	private String benutzername;
	
	
	public Registrieren(String name, String nachname, String email, int nummer, Passwort passwort, String benutzername)
	{
		this.name=name;
		this.nachname=nachname;
		this.email=email;
		this.nummer=nummer;
		this.passwort=passwort;
		this.benutzername=benutzername;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getNachname()
	{
		return nachname;
	}
	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public int getNummer()
	{
		return nummer;
	}
	public void setNummer(int nummer)
	{
		this.nummer = nummer;
	}
	public Passwort getPasswort()
	{
		return passwort;
	}
	public void setPasswort(Passwort passwort)
	{
		this.passwort = passwort;
	}
	public String getBenutzername()
	{
		return benutzername;
	}
	public void setBenutzername(String benutzername)
	{
		this.benutzername = benutzername;
	}
	
	@Override
	public String toString()
	{
		return "Willkommen" + " " + benutzername;
	}
}
