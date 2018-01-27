/**
 * Created by vrasa on 11/30/2017.
 */
import java.util.*;
import java.io.*;
import javax.tools.*;
import java.lang.reflect.Method;
import com.udojava.evalex.Expression;
import org.uncommons.maths.random.Probability;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{
        //    new GUI();
        BigDecimal result = null;
        Map variables = new HashMap();
        String rtplFile = "in.rtpl";
        BufferedWriter out = new BufferedWriter(new FileWriter("Code.java", false));
        BufferedReader in = new BufferedReader(new FileReader(rtplFile));
        String str;
        out.write("import java.util.*;\npublic class Code  {\n");
        boolean hasCode = false;
        while ((str = in.readLine()) != null){
            Probability x;
            String delims = "[ ={}\n\t,;\r]+";
            String[] tokens = str.split(delims);
            for (String token : tokens) {
             //   System.out.println("token:" + token);
            }
            if (str.contains("main")){
                out.write("public static void run(){");
                hasCode = true;
                continue;
            } else if(str.contains("preal")){
                System.out.println("Static Evaluation");
                System.out.println("\t" + "preal:" + tokens[2]);
                variables.put(tokens[2],0);
                System.out.println("Dynamic Evaluation");
                for(Object key: variables.keySet())
                    System.out.println("\t" + key + " = " + variables.get(key));
                continue;
            } else if (str.contains("boolean") && str.contains("$")){
                System.out.println("Static Evaluation");
                System.out.println("\t"+"Generating Random Value");
                System.out.println("\t\t" + "boolean: " + tokens[2]);
                System.out.println("\t\t" + tokens[4] + ": "+ variables.get(tokens[4]));
                BigDecimal temp = (BigDecimal)variables.get(tokens[4]);
                x = new Probability(temp.doubleValue());
                double z = Math.random();
                if (z < x.doubleValue()) {
                    System.out.println("\t\t" + "true");
                    str = "boolean " + tokens[2] + " = " + "true;";
                }
                else {
                    System.out.println("\t\t" +"false");
                    str = "boolean " + tokens[2] + " = " + "false;";
                }
                System.out.println("\t\t" +"random value:"+z);
            } else if(str.contains("=")){
                if(variables.containsKey(tokens[1])) {
                    System.out.println("Dynamic Evaluation");
                    System.out.println("\t"+tokens[1]+" = "+tokens[2]);
                    Expression variable_value = new Expression(tokens[2]);
                    variables.put(tokens[1], variable_value.eval());
                    //System.out.println(tokens[1]+"="+((BigDecimal)variables.get(tokens[1])).doubleValue());
                    continue;
                }
            }
            str=str.replace("string","String");
            str=str.replace("float","double");
            str=str.replace("sysout","System.out.println");
            out.write("\n" + str);
        }

        if (hasCode)
            out.write("\n}");
        in.close();
        out.close();

/*
        String s="Code.java";
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(System.in,System.out,System.err,s);
        try{
			Class code = Class.forName("Code");
			Object t = code.newInstance();
			Class noparams[] = {};
			Method main = code.getDeclaredMethod("run", noparams);
			main.invoke(t, null);
		}catch(Exception ex){
			ex.printStackTrace();
		}

        File file = new File("Code.java");
        file.delete();
        file = new File("Code.class");
        file.delete();
    */
    }
}