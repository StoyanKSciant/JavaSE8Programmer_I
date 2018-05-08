package ocaJavaSE8.p6.inheritance.interface_inheritance;

public class BankAccount implements PremiumAccount {
	public static void main(String[] args) {
		Account acct = new BankAccount();
		System.out.println(acct.getId());
	}
}
