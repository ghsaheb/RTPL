/**
 * Created by vrasa on 11/30/2017.
 */

import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = new ANTLRFileStream("in.rtpl");
            RTPLLexer lexer=new RTPLLexer(input);
            CommonTokenStream ts=new CommonTokenStream(lexer);
            RTPLParser parser=new RTPLParser(ts);
            RTPLParser.ProgramContext program_ctx;
            program_ctx = parser.program();
        } catch (Exception e) {e.printStackTrace();}
        GUI g = new GUI();
    }
}
