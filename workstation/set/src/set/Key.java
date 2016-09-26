package set;

public class Key implements Comparable{
		String str;
		Integer i;
		public Key(int i) {
			this.i=i;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this.i==((Key)obj).i)
				return true;
			return false;
		}
		
		@Override
		public int compareTo(Object o) {
			int diff =this.i-(((Key)o).i);
			return diff;
		}
		
		@Override
		public int hashCode(){
			return i;
		}  
		
}