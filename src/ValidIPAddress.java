import java.util.Arrays;

public class ValidIPAddress {
	public static void main(String args[]) {
		SolutionIP soln = new SolutionIP();
		System.out.println(soln.validIPAddress("2001:0db8:85a3:00000:0:8A2E:0370:7334"));
	}

}

class SolutionIP {
	public String validIPAddress(String IP) {
		if(isValidIPv4Address(IP))
			return "IPv4";
		else if(isValidIPv6Address(IP))
			return "IPv6";
		else
			return "Neither";
    }
	
	public boolean isValidIPv4Address(String ip) {
		if(ip.length() < 7)
			return false;
		if(ip.charAt(0) == '.')
			return false;
		if(ip.charAt(ip.length() - 1) == '.')
			return false;
		String[] splitIPAddress = ip.split("\\.");
		if(splitIPAddress.length != 4)
			return false;
		for(String ipAddress : splitIPAddress) {
			if(!isValidIPv4Range(ipAddress))
				return false;
		}
		return true;	
	}
	
	public boolean isValidIPv4Range(String ip) {
		if(ip.startsWith("0") && ip.length() > 1)
			return false;
		try {
			int parseIP = Integer.parseInt(ip);
			if(parseIP < 0 || parseIP > 255)
				return false;
			if(parseIP == 0 && ip.charAt(0) != '0')
				return false;
		}
		catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public boolean isValidIPv6Address(String ip) {
		if(ip.length() < 15)
			return false;
		if(ip.charAt(0) == ':')
			return false;
		if(ip.charAt(ip.length() - 1) == ':')
			return false;
		String[] splitIPv6Address = ip.split(":");
		if(splitIPv6Address.length != 8)
			return false;
		for(String ipv6Address : splitIPv6Address) {
			if(!isValidIPv6Range(ipv6Address))
				return false;
		}
		return true;
	}

	public boolean isValidIPv6Range(String ip) {
		if(ip.length() > 4 || ip.length() == 0)
			return false;
		char[] characters = ip.toCharArray();
		for(char c: characters) {
			boolean isDigit = c >= 48 && c <=57;
			boolean isUpperCase = c >= 65 && c <= 70;
			boolean isLowerCase = c >= 97 && c <= 102;
			if(!(isDigit || isUpperCase || isLowerCase))
				return false;
		}
		return true;
	}
}
	


