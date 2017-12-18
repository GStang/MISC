package Jackson_test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2016/10/20.
 */
public class Response {
    private int code;
    private String msg;
    private User data;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
