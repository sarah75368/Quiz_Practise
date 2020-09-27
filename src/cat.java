
public class cat {
	public String name = "feefoo";
	public float weight =  (float) 10.0;
	cat() {}
	cat(float w) {
		name = "feefoo";
		weight = w;
	}
	cat(float w, String n) {
		name = n;
		weight = w;
	}
	void print_name() {System.out.println(name);}
	void print_weight() {System.out.println(weight);}
	public static void main(String[] args) {
		cat c1 = new cat();
		c1.print_name();
		c1.print_weight();

		cat c2 = new cat(9);
		c2.print_name();
		c2.print_weight();
		
		cat c3 = new cat(12,"doodoo");
		c3.print_name();
		c3.print_weight();
	}

}
