/**
 * Created by vrasa on 11/30/2017.
 */
public class Type {
    public static final Type Int = new Type("int");
    public static final Type Float = new Type("float");
    public static final Type Boolean = new Type("boolean");
    public static final Type String = new Type("string");

    public Type(String name){
        this.type = name;
    }
    public String getType(){
        return type;
    }
    private String type;
}
