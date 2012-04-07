package example;

public class Example implements IExample {

	int count =2;
	
	@Override
	public String message() {
		return "Count is "+count;
	}

	@Override
	public int plusPlus() {
		return ++count;
	}

}
