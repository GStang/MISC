package Jackson_test;



import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by DELL on 2016/10/20.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String json = "{ \"code\" : 1, \"msg\" : \"success\", \"data\" : { \"id\" : 1, \"name\" : \"wuhaojie\", \"password\" : \"123456\", \"age\" : 20, \"text\" : \"a grade 3 student\" } }\n";
        ObjectMapper objectMapper = new ObjectMapper();
        Response response = objectMapper.readValue(json,Response.class);
       //System.out.println(user);
    }
}
