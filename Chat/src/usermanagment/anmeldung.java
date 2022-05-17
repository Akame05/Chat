package usermanagment;

public class anmeldung 
{
	private String benutzername;
	private String nickname;
	private Passwort passwort;
	
	public anmeldung(String benutzername, Passwort passwort)
	{
		this.benutzername = benutzername;
		this.passwort=passwort;
	}

	public String getBenutzername() 
	{
		return benutzername;
	}

	public Passwort getPasswort() 
	{
		return passwort;
	}

	public String getNickname() 
	{
		return nickname;
	}

	public void setNickname(String nickname) 
	{
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "anmeldung [benutzername=" + benutzername + ", nickname=" + nickname + ", passwort=" + passwort + "]";
	}

}
