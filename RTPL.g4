grammar RTPL;

program
    :
        ( funcdef )+
    ;
funcdef
    :
    {ArrayList<Type> inputTypes = new ArrayList<Type>();}
      ret=type func_name=ID '(' ( t1=type ID {inputTypes.add($t1.retType);} (',' t2=type ID {inputTypes.add($t2.retType);} )*)? ')' block
    {
        System.out.print("Function " + $func_name.getText() + " : " );
        if (inputTypes.size() == 0) System.out.print("NO_INPUT");
        else {
            for (int i=0;i<inputTypes.size();i++){
                if (i==0) System.out.print(inputTypes.get(i).getType());
                else System.out.print(", " + inputTypes.get(i).getType());
            }
        }
        System.out.println(" -> " + $ret.retType.getType());
    }
    ;
vardef
    : t=type vars+=ID ('=' expr)? (',' vars+=ID ('=' expr)?)*
    { for (Token var:$vars) System.out.println("Variable " + var.getText() + " : " + $t.retType.getType()); }
    ;
type returns [Type retType]
    :
    | 'string' '(' CONST_NUM ')' {$retType = Type.String;}
    | 'boolean' {$retType = Type.Boolean;}
    | 'int' {$retType = Type.Int;}
    | 'float' {$retType = Type.Float;}
    ;
block
    : '{' (statement)* '}'
    ;
statement
    : (if_stm
    | other_stm)
    ;
other_stm
    : (vardef ';'
    | expr ';'
    | while_stm
    | return_stm ';'
    | break_stm ';'
    | block)
    ;
if_stm
    : ('if' '(' expr ')' statement
    | 'if' '(' expr ')' if_stm_else 'else' statement)
    ;
if_stm_else
    : ('if' '(' expr ')' if_stm_else 'else' if_stm_else
    | other_stm)
    ;
expr returns [Type retType]
    : expr_assign
    ;
expr_assign returns [Type retType]
    : expr_or '=' expr_assign
    | expr_or
    ;
expr_or returns [Type retType]
    : expr_and expr_or_tmp
    ;
expr_or_tmp
    : '||' expr_and expr_or_tmp
    |
    ;
expr_and returns [Type retType]
    : expr_eq expr_and_tmp
    ;
expr_and_tmp
    : '&&' expr_eq expr_and_tmp
    |
    ;
expr_eq returns [Type retType]
    : expr_cmp expr_eq_tmp
    ;
expr_eq_tmp
    : op=('=='|'!=') expr_cmp expr_eq_tmp
    |
    ;
expr_cmp returns [Type retType]
    : expr_add expr_cmp_tmp
    ;
expr_cmp_tmp
    : op=('<'|'>') expr_add expr_cmp_tmp
    |
    ;
expr_add returns [Type retType]
    : expr_mult expr_add_tmp
    ;
expr_add_tmp
    : op=('+'|'-') expr_mult expr_add_tmp
    |
    ;
expr_mult returns [Type retType]
    : expr_un expr_mult_tmp
    ;
expr_mult_tmp
    : op=('*'|'/') expr_un expr_mult_tmp
    |
    ;
expr_un returns [Type retType]
    : op=('!'|'-') expr_un
    | expr_func
    ;
expr_func returns [Type retType]
    : expr_other expr_func_tmp
    ;
expr_func_tmp
    : ('(' (expr (',' expr)*)? ')')
    |
    ;
expr_other returns [Type retType]
    : (CONST_NUM
    | CONST_STR
    | ID
    | '(' expr ')')
    ;
while_stm
    : 'while' '(' expr ')' statement
    ;
return_stm
    : 'return' (expr)?
    ;
break_stm
    : 'break'
    ;

CONST_NUM:
    [0-9]+ ('.' [0-9]+)?
    ;
/*
CONST_CHAR:
    '\'' . '\''
    ;
*/
CONST_STR:
    '"' ~('\r' | '\n' | '"')* '"'
    ;
/*
CONST_FUNC:
    'tail' | 'head' | 'size' | 'read' | 'write'
    ;
*/
ID:
    [a-zA-Z_][a-zA-Z0-9_]*
    ;
SLC:
    '//'(~[\r\n])* -> skip
    ;
MLC:
    '/*'((~[*])|'*'(~[/])+)*('*')* '*/' -> skip
    ;
WS:
    [ \r\t\n]+ -> skip
    ;
