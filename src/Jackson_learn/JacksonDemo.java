package Jackson_learn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2016/10/19.
 */
public class JacksonDemo {
    public static void main(String[] args) throws ParseException, JsonProcessingException {
        User user = new User();
        user.setName("小明");
        user.setEmail("xiaoming@sina.com");
        user.setAge(20);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        user.setBirthday(dateFormat.parse("1996-10-01"));
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

        List<User> users = new ArrayList<>();
        users.add(user);
        String jsonlist = mapper.writeValueAsString(users);
        System.out.println(jsonlist);
    }
}
