package seminar3.task2;

/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два
числа разного типа, над которыми должна быть произведена операция.
*/
public class Calculator {
    public static <T extends Number, N extends Number> Number sum(T num1, N num2) {
        return new Number() {
            @Override
            public int intValue() {
                return num1.intValue() + num2.intValue();
            }
            @Override
            public long longValue() {
                return num1.longValue() + num2.longValue();
            }
            @Override
            public float floatValue() {
                return num1.floatValue() + num2.floatValue();
            }
            @Override
            public double doubleValue() {
                return num1.doubleValue() + num2.doubleValue();
            }
        };
    }
    public static <T extends Number, N extends Number> Number subtract(T num1, N num2) {
        return new Number() {
            @Override
            public int intValue() {
                return num1.intValue() - num2.intValue();
            }
            @Override
            public long longValue() {
                return num1.longValue() - num2.longValue();
            }
            @Override
            public float floatValue() {
                return num1.floatValue() - num2.floatValue();
            }
            @Override
            public double doubleValue() {
                return num1.doubleValue() - num2.doubleValue();
            }
        };
    }
    public static <T extends Number, N extends Number> Number multiply(T num1, N num2) {
        return new Number() {
            @Override
            public int intValue() {
                return num1.intValue() * num2.intValue();
            }
            @Override
            public long longValue() {
                return num1.longValue() * num2.longValue();
            }
            @Override
            public float floatValue() {
                return num1.floatValue() * num2.floatValue();
            }
            @Override
            public double doubleValue() {
                return num1.doubleValue() * num2.doubleValue();
            }
        };
    }
    public static <T extends Number, N extends Number> Number divide(T num1, N num2) {
        return new Number() {
            @Override
            public int intValue() {
                return num1.intValue() / num2.intValue();
            }
            @Override
            public long longValue() {
                return num1.longValue() / num2.longValue();
            }
            @Override
            public float floatValue() {
                return num1.floatValue() / num2.floatValue();
            }
            @Override
            public double doubleValue() {
                return num1.doubleValue() / num2.doubleValue();
            }
        };
    }
}
