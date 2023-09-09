public class Fraction {
    public int numerator;//分子
    public int denominator;//分母

    public Fraction(int numerator, int denominator){

        if (denominator == 0){
            System.out.println("分母不能为零");
        }

        //构造器 默认的无参空构造就没了
        this.numerator = numerator;
        this.denominator = denominator;
    }

/*
    //再写一个无参空构造
    public Fraction(){

    }
*/

    //非静态方法属于对象 使用对象.方法名的方式去调用
    public Fraction multiple(Fraction f){

        // f3 = f1 * f2
        Fraction result = new Fraction(numerator,denominator);
        result.numerator = this.numerator * f.numerator;
        result.denominator = this.denominator * f.denominator;

        return result;
    }


    public String toString() {

        //输出 3/12
        return this.numerator + "/" + denominator;
    }
}
