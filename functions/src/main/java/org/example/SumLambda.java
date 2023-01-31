package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class SumLambda implements RequestHandler<Integer, Integer>
{

    @Override
    public Integer handleRequest(Integer integer, Context context) {
        return integer * 2;
    }
}
