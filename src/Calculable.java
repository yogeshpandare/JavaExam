
public interface Calculable {
int change (int i) ;

default int change(long l) {
	return (int) (l*3);
}
}
