package ocaJavaSE8.p6.inheritance;

import java.time.LocalDateTime;

public class StaticMethodInterfacesTest {

	public static void main(String[] args) {
		StaticMethodInterfaces stMInt = new Manager();
//		inv.bookConferenceRoom(LocalDateTime.now(), 2);	// won't compile

		Manager mgr = new Manager();
//		mgr.bookConferenceRoom(LocalDateTime.now(), 2); // won't compile

		// static method in an interface can't be cakked using a reference
		// variable. It must be called using the interface name.
		StaticMethodInterfaces.bookConferenceRoom(LocalDateTime.now(), 2);
	}
}
