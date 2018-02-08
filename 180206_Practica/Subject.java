public interface Subject {
	
	public void register(Observer displays);
	
	public void remove(Observer displays);
	
	public void notificar();

}
