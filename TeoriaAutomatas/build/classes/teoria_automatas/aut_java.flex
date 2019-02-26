package teoria_automatas;
import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;

%%

%class AnalizadorLexico
%unicode
%ignorecase
%cup
%cupdebug

%line
%column

//Declaraciones

%{

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

TERMINAR_LINEA = \r|\n|\r\n
CARACTERIN = [^\r\n]
ESPACIOBLANCO = {TERMINAR_LINEA} | [ \t\f]
COMENTARIO = {COMENTARIOT} | {FINLINEACOMENT}
COMENTARIOT = "/*" [^*] ~"*/" | "*/" "*"+ "/"
FINLINEACOMENT = "//" {CARACTERIN}* {TERMINAR_LINEA}?
ENTEROS = 0 | [1-9][0-9]*
ID = [:jletter:][:jletterdigit:]*
BEGIN_METODOS = "public static"
LOGICOS_BINARIOS = "&&" | "||"
LOGICOS_UNARIOS = "!"
FOR = "for"
TIPOS_METODOS = "int" | "boolean" | "void"
TIPOS_VAR = "int" | "boolean"
RETURN = "return"
BOOLEANOS = "true" | "false"
ARIT = "*" | "/" | "+" | "-"
RELACIONALES = "<" | "<=" | ">" | ">=" | "==" | "!="
PUNTOCOMA = ";"
ASIGNACION = "="
INCREMENTO = "++"
DECREMENTO = "--"
LL_OP = "{"
LL_CL = "}"
PAR_OP = "("
PAR_CL = ")"


%%
    {RELACIONALES} {return symbol(sym.RELACIONALES, new String(yytext()));}
    {RETURN} {return symbol(sym.RETURN, new String(yytext()));} 
    {FOR} {return symbol(sym.TIPOS_VAR, new String(yytext()));}
    {TIPOS_VAR} {return symbol(sym.TIPOS_VAR, new String(yytext()));}
    {BEGIN_METODOS} {return symbol(sym.BEGIN_METODOS, new String(yytext()));}
    {TIPOS_METODOS} {return symbol(sym.TIPOS_METODOS, new String(yytext()));}
    {ARIT} {return symbol(sym.ARIT, new String(yytext()));}
    {RELACIONALES} {return symbol(sym.RELACIONALES, new String(yytext()));}
    {BOOLEANOS} {return symbol(sym.BOOLEANOS, new String(yytext()));}
    {ID} {return symbol(sym.ID, new String(yytext()));}
    {PUNTOCOMA} {return symbol(sym.PUNTOCOMA);}
    {ASIGNACION} {return symbol(sym.ASIGNACION, new String(yytext()));}
    {INCREMENTO} {return symbol(sym.INCREMENTO);}
    {DECREMENTO} {return symbol(sym.DECREMENTO);}
    {LOGICOS_BINARIOS} {return symbol(sym.LOGICOS_B);}
    {LOGICOS_UNARIOS} {return symbol(sym.LOGICOS_U);}
    {LL_OP} {return symbol(sym.LL_OP);}
    {LL_CL} {return symbol(sym.LL_CL);}
    {PAR_OP} {return symbol(sym.PAR_OP);}
    {PAR_CL} {return symbol(sym.PAR_CL);}
    "," {return symbol(sym.COMA);}

    {COMENTARIO} {/*Ignoramos comentarios*/}
    {ESPACIOBLANCO} {}
    {ENTEROS} {return symbol(sym.NUM);}



[^]   {System.out.println("ERROR");}



