package clase.neww.v3;

@FunctionalInterface
public interface TriFunction <T,U,V,R> {
	
	R apply(T t,U u, V v);

}
