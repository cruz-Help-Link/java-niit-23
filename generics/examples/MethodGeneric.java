import java.util.stream.Collectors;

public class MethodGeneric {
    public <T> List<T> fromArrayToList(T[] a) {   
        return Arrays.stream(a).collect(Collectors.toList());
    }
}
