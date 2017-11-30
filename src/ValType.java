import java.util.Objects;

/**
 * Created by vrasa on 11/30/2017.
 */
public class ValType {
    private Type t;

    private String s;
    private Float f;
    private Integer i;
    private Boolean b;

    public Type getType() {
        return t;
    }

    public void setValyue(Object o){
        if (o instanceof Integer){
            i = (Integer)o;
        }
        else if (o instanceof Float){
            f = (Float)o;
        }
        else if (o instanceof String){
            s = (String)o;
        }
        else if (o instanceof Boolean){
            b = (Boolean)o;
        }

    }
}
