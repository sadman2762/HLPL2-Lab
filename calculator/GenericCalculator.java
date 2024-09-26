package calculator;

public interface GenericCalculator<T>{
    T add(T left, T right);
    T multiply(T left, T right);
}
