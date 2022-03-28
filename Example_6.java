public class Example_6{
	private int length_rect,width_rect;
	public void rect_angle(int l,int w){
		length_rect=l;
		width_rect=w;
	}
	public int get_area(){
		return length_rect*width_rect;
	}
	public static void main(String[]args){
		Example_6 rect_1=new Example_6();
		int area;
		rect_1.rect_angle(23,56);
		area=rect_1.get_area();
		System.out.println("area: "+area);
	}
}	