package ocaJavaSE8.p6.inheritance;

import java.time.LocalDateTime;

public interface StaticMethodInterfaces {

	// typical abstract method defined in interface
	abstract void conductInterview();

	// starting with Java 8 interfaces can be augmented by adding methods with
	// default implementation using the keyword default
	default void submitInterviewStatus() {
		System.out.println("Accept");
		// NODE default method must have a body {} with or without code
	}

	// starting with Java 8 interfaces are allowed to define static methods
	static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
		System.out.println("Interview scheduled on: " + dateTime);
		System.out.println("Book conference room for: " + duration + " hrs");
	}

	// NOTE: An interface can extends multiple interfaces, which define static
	// method with the same name; the signatures of these methods don't matter.
	// This is because static methods are never inherited, so no conflicts can occur.
}
