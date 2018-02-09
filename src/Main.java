/**
 * Created by vrasa on 11/30/2017.
 */
import java.util.*;
import java.io.*;
import javax.tools.*;
import java.lang.reflect.Method;
import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.uncommons.maths.random.Probability;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        String rtplFile = "in.rtpl";

        // Static Evaluation
        System.out.println(".:STATIC EVALUATION:.");
        CharStream input = new ANTLRFileStream(rtplFile);
        RTPLLexer lexer=new RTPLLexer(input);
        CommonTokenStream ts=new CommonTokenStream(lexer);
        RTPLParser parser=new RTPLParser(ts);
        RTPLParser.ProgramContext program_ctx;
        program_ctx = parser.program();
//            new GUI();

        // Dynamic Evaluation
        System.out.println("\n.:DYNAMIC EVALUATION:.");
        BigDecimal result = null;
        Map variables = new HashMap();
        BufferedWriter out = new BufferedWriter(new FileWriter("Code.java", false));
        BufferedReader in = new BufferedReader(new FileReader(rtplFile));
        String str;
        out.write("import java.util.*;\npublic class Code  {\n");
        boolean hasCode = false;
        int timeInMillis = 0;
        int i = 0;
        boolean safetyFlag = false;
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
    //            System.out.println("Static Evaluation");
     //           System.out.println("\t" + "preal:" + tokens[2]);
                variables.put(tokens[2],0);
     //           System.out.println("Dynamic Evaluation");
                for(Object key: variables.keySet())
                    System.out.println("\t" + key + " = " + variables.get(key));
                continue;
            } else if (str.contains("boolean") && str.contains("$")){
     //           System.out.println("Static Evaluation");
                System.out.println("\t"+"Generating Random Value");
                System.out.println("\t\t" + "boolean: " + tokens[2]);
                System.out.println("\t\t" + tokens[3] + " : "+ variables.get(tokens[3]));
                BigDecimal temp = (BigDecimal)variables.get(tokens[3]);
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
                System.out.println("\t\t" +"random value: "+z);
            } else if(str.contains("=")){
                if(variables.containsKey(tokens[1])) {
                    System.out.println("Dynamic Evaluation");
                    System.out.println("\t"+tokens[1]+" = "+tokens[2]);
                    Expression variable_value = new Expression(tokens[2]);
                    variables.put(tokens[1], variable_value.eval());
                    //System.out.println(tokens[1]+"="+((BigDecimal)variables.get(tokens[1])).doubleValue());
                    continue;
                }if(str.contains("@estimation")){
  //                  System.out.println("\t" + "Annotation: " + tokens[1]);
                    continue;
                }
                if(str.contains("@safety")){
 //                   System.out.println("\t" + "Annotation: " + tokens[2]);
                    safetyFlag = true;
                    timeInMillis = Integer.parseInt(tokens[2]);
                    continue;
                }
            }
            else if (str.contains("while") && safetyFlag){
                safetyFlag = false;
                out.write("\nlong safetyTimer" + i + " = System.currentTimeMillis();");
                out.write("\n" + str);
                out.write("\nif (System.currentTimeMillis() > " + timeInMillis + " + safetyTimer" + i +"){System.out.println(\"Safety time reached\"); break;} ");
                i = i + 1;
                continue;
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


        String s="Code.java";
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(System.in,System.out,System.err,s);
        try{
            //load the Template at runtime
            Class template = Class.forName("Code");
            Object t = template.newInstance();

            //call the run method
            Class noparams[] = {};
            Method run = template.getDeclaredMethod("run", noparams);
            run.invoke(t, null);
        }catch(Exception ex){
            ex.printStackTrace();
        }

  //      File file = new File("Code.java");
    //    file.delete();
      //  file = new File("Code.class");
        //file.delete();

    }
}