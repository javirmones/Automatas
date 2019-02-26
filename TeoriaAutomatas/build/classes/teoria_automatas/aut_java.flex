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
METODOS = "public static"
LOGICOS = "&&" | "||" | "!"
FOR = "for"
TIPOS_VAR = "int" | "boolean" | "void"
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

<YYINITIAL> {
    
    {FOR} {return symbol(sym.FOR, new String(yytext()));}
    {TIPOS_VAR} {return symbol(sym.TIPOS_VAR, new String(yytext()));}
    "true" {return symbol(sym.TRUE, new String(yytext()));}
    "false" {return symbol(sym.FALSE, new String(yytext()));}
    {ID} {return symbol(sym.ID, new String(yytext()));}
    {METODOS} {return symbol(sym.METODOS, new String(yytext()));}
    {PUNTOCOMA} {return symbol(sym.PUNTOCOMA);}
    {RELACIONALES} {return symbol(sym.RELACIONALES, new String(yytext()));}
    {ASIGNACION} {return symbol(sym.ASIGNACION, new String(yytext()));}
    {INCREMENTO} {return symbol(sym.INCREMENTO);}
    {DECREMENTO} {return symbol(sym.DECREMENTO);}
    {LOGICOS} {return symbol(sym.LOGICOS);}
    "+" {return symbol(sym.MAS);}
    "-" {return symbol(sym.MENOS);}
    "/" {return symbol(sym.DIV);}
    "*" {return symbol(sym.POR);}
    {LL_OP} {return symbol(sym.LL_OP);}
    {LL_CL} {return symbol(sym.LL_CL);}
    {PAR_OP} {return symbol(sym.PAR_OP);}
    {PAR_CL} {return symbol(sym.PAR_CL);}
    "," {return symbol(sym.COMA);}

    {COMENTARIO} {}
    {ESPACIOBLANCO} {}
    {ENTEROS} {return symbol(sym.NUMERO);}

}

[^]   {System.out.println("ERROR");}



