package entity;
import java.io.Serializable;
/**
 * 返回结果封装
 * @author Administrator
 *
 */
public class Result implements Serializable {
    private boolean success;
    private String message;

    public Result(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }
}