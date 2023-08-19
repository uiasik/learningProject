package all.LambdaExpressions;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpressions {
    interface MyFunction{
        double pow(double value, int quantity);
    }



    public void start(){
        MyFunction myFunction = (value, quantity) -> {
            double res = value;
            for (int i = 1; i < quantity; i++) {
                res *= value;
            }
            return res;
        };
        getLambda(i -> i + "pisapopa");
    }

    private void getLambda(Function<String, String> function){
        System.out.println(function.apply("hhfhafiufdshifhiuf"));

    }

}
