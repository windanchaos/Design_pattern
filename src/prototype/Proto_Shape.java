package prototype;
import factory.*;

public abstract class Proto_Shape implements Shape,Cloneable {
	private String id;
	protected String type;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public Object clone(){
		Object clone=null;
		try {
			clone=super.clone();
		} catch (CloneNotSupportedException e) {
			 e.printStackTrace();
		}
		return clone;
	}
	@Override
	public void draw(){
		
	}
}
