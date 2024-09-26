package calculator;

public class MyGenericCalculator implements GenericCalculator<Integer>{

    @Override
    public Integer add(Integer left, Integer right) {
        return left + right;
    }

    @Override
    public Integer multiply(Integer left, Integer right) {
        return left*right;
    }

    public static void main(String[] args) {
        MyGenericCalculator myGenericCalculator = new MyGenericCalculator();
        System.out.println(myGenericCalculator.add(5,3));
        System.out.println(myGenericCalculator.multiply(9,6));
    }
}
