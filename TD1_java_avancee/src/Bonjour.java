
public class Bonjour {
	public static String bonjour(String... noms) {
		if(noms == null)
			return "Bonjour, ami.";
		if(noms.length == 1) {
			if(noms[0].equals(noms[0].toUpperCase()))
				return "BONJOUR, " + noms[0].toUpperCase() + " !";
			return "Bonjour, " + noms[0] + ".";
		}else{
			String res = "Bonjour, ";
			for(int i = 0; i <noms.length -2; i++) {
				res += noms[i] + ", ";
			}
			res += noms[noms.length -2] + " et " + noms[noms.length -1 ] + ".";
			return res;
		}
	}
}