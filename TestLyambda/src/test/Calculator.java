package test;

import java.util.function.Consumer;

@FunctionalInterface
public interface Calculator {

	
	void sum(Consumer<Integer> cons);
	 
	
}
