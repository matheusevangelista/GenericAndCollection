
public class Box < T > implements View{
	
	public T value;
	
	public void set(T value){
		this.value = value;
	}
	
	public T get(){
		return this.value;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Valor igual a "+this.value);
	}

}
