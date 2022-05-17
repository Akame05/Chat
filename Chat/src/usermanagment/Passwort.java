package usermanagment;

public class Passwort 
{
	private Passwort passwort;
	
	public Passwort(Passwort passwort)
	{
		this.passwort=passwort;
	}

	public Passwort getPasswort() {
		return passwort;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passwort other = (Passwort) obj;
		if (passwort == null) {
			if (other.passwort != null)
				return false;
		} else if (!passwort.equals(other.passwort))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passwort == null) ? 0 : passwort.hashCode());
		return result;
	}


}
