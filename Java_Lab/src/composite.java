
public class composite implements Comparable {
	String key;
	int id;
	
	public composite(int id,String suffix){
		this.key=suffix+id;
		this.id=id;
	}
	
	public String getKey(){
		return key;
	}

	@Override
	public int compareTo(Object o) {
		int diff= this.id-((composite)o).id;
		return diff;
	}
	@Override
	public boolean equals (Object o){
		if(this.key.equals(((composite)o).key))
			return true;
		return false;
		
	}
	
	@Override
	public int hashCode(){
		return this.id + this.key.length();
	}

}
