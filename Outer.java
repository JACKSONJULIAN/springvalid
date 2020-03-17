package springvalid;

public class Outer {
	
		
	
private static String message="HelloWorld";
private static class Message{
	public void printMessage() {
		System.out.println("message from nested static class:"+message);
						}
					}
private class Inner{
	public void display() {
		System.out.println("message from non static inner class"+message);
				}
			}
			public static void main(String[] args) {
						Outer.Message msg=new Outer.Message();
						msg.printMessage();
					Outer outer=new Outer();
					Outer.Inner inner=outer.new Inner();
						inner.display();
							//Outer.Inner nonStaticIner=new Outer().new Inner();
							//nonStaticIner.display();
			}
}