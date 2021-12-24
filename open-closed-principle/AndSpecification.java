/**
 * AndSpecification
 */
public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first;
    private Specification<T> second;

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }

    public Specification<T> getFirst() {
        return first;
    }

    public void setFirst(Specification<T> first) {
        this.first = first;
    }

    public Specification<T> getSecond() {
        return second;
    }

    public void setSecond(Specification<T> second) {
        this.second = second;
    }
}
