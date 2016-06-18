
public enum CarFactory {
//	FordCar() { 
//		@Override
//	Car create() {
//		return new FordCar();
//	}},
//	BmwCar() {
//		@Override
//		Car create() {
//			return new BmwCar();
//		}};
//	abstract Car create();
	FORDCAR, BMWCAR;
	
	public Car create() {
		switch (this) {
		case FORDCAR:
			return new FordCar();
		case BMWCAR:
			return new BmwCar();
		default:
			throw new AssertionError("Illegal Aruguments");
		}
	}
	
}
