package springvalid;

public class Enum1 {
	public enum Season{WINTERs,SPRING,SUMMER,FALL}
	public static void main(String[] args) {
			for(Season s: Season.values()) {
				System.out.println(s);
			}
		System.out.println("value of WINTER is:"+Season.valueOf("WINTER"));
		System.out.println("index of WINTER is:"+Season.valueOf("WINTER").ordinal());
		System.out.println("index of SUMMER is:"+Season.valueOf("SUMMER").ordinal());
	}
}
