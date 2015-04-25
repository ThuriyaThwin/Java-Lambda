
package com.solt.strategy;

public class GreenApple extends FilterApple{

    public GreenApple() {
        setAlgorithm(new FilterApplesByColorAlgorithm());
    }
    
}
