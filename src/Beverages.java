
abstract class Beverages implements poured{
	String bev_name;
	
	Beverages(){
	bev_name = "No name";
}
	Beverages(String n){
	bev_name = n;
}
	public void pour() {
		System.out.print(this + " "+ bev_name + " is being poured\n");
	}
}
