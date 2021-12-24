import java.util.List;
import java.util.stream.Stream;

/**
 * Filter
 */
public interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> specification);
}
