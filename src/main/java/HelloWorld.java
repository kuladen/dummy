import java.util.Arrays;
import java.util.Map;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	public static int CNTR = 0;

	private String name;

	private Printer printer;

	private Map<String, Float> accounts;

	public HelloWorld(String name, Printer p) {
		super();
		this.name = name;
		this.printer = p;
		HelloWorld.CNTR++;
	}

	public void setAccounts(Map<String, Float> accounts) {
		this.accounts = accounts;
	}

	public void setName(String name) {
		this.name = name + "***";
	}

	public void printHello() {
		printer.print("Spring 3 : Hello ! " + name + " " + CNTR);
		System.out.println(Arrays.toString(accounts.keySet().toArray()));
	}
}