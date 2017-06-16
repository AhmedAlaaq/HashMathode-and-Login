package security;

import java.security.NoSuchAlgorithmException;

public class main {
public static void main(String[] args) throws NoSuchAlgorithmException{
	HashWachtWoord hw = new HashWachtWoord();
	SaltRandom salt = new SaltRandom();
	/*System.out.println(salt.SaltRandom());
	System.out.println(salt.SaltRandom().length());*/
	String sal = "5GZDUY5COL2N7OAW5ZTM1UAW7HAGY9SQ75TXLMGB69UKBFB1Z75RFH27TUC85DSN";
	System.out.println(HashWachtWoord.hashWachtWoord("superdelox", sal));
	/*System.out.println(hw.hashWachtWoord("Ahmed", salt.SaltRandom()).length());*/
	
}
}
