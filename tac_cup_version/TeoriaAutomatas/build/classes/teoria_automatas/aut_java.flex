package teoria_automatas;
import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;

%%

%class AnalizadorLexico
%unicode
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
COMENTARIOT = "/*" [^*] ~"*/" | "*/" "*"+ "/";
FINLINEACOMENT = "//" {CARACTERIN}* {TERMINAR_LINEA}?
ID = [a-zA-Z][a-zA-Z0-9"_""-"]*
LOGICOS_BINARIOS = "&&"
RELACIONALES = "<" | "<=" | ">" | ">=" | "==";
ASIGNACION = "="
INCREMENT = "++" | "--";
NUM = 0 | [1-9][0-9]*


%%
    "*" {return symbol(sym.POR, new String(yytext()));} 
    "/" {return symbol(sym.DIV, new String(yytext()));} 
    "-" {return symbol(sym.MENOS, new String(yytext()));} 
    "+" {return symbol(sym.MAS, new String(yytext()));}  
    "null" {return symbol(sym.NULL, new String(yytext()));} 
    "return" {return symbol(sym.RETURN, new String(yytext()));} 
    "for" {return symbol(sym.FOR, new String(yytext()));}
    "int" {return symbol(sym.INT, new String(yytext()));}
    "boolean" {return symbol(sym.BOOLEAN, new String(yytext()));}
    "void" {return symbol(sym.VOID, new String(yytext()));}
    "public static" {return symbol(sym.BEGIN_METODOS, new String(yytext()));}
    "true"  {return symbol(sym.TRUE, new String(yytext()));}
    "false" {return symbol(sym.FALSE, new String(yytext()));}
    {RELACIONALES} {return symbol(sym.RELACIONALES, new String(yytext()));}
    ";" {return symbol(sym.PUNTOCOMA , new String(yytext()));}
    {ASIGNACION} {return symbol(sym.ASIGNACION, new String(yytext()));}
    {INCREMENT} {return symbol(sym.INCREMENT, new String(yytext()));}
    {LOGICOS_BINARIOS} {return symbol(sym.LOGICOS_B, new String(yytext()));}
    "!" {return symbol(sym.LOGICOS_U, new String(yytext()));}
    "!=" {return symbol(sym.DISTINTO, new String(yytext()));}
    "{" {return symbol(sym.LL_OP, new String(yytext()));}
    "}" {return symbol(sym.LL_CL, new String(yytext()));}
    "(" {return symbol(sym.PAR_OP, new String(yytext()));}
    ")" {return symbol(sym.PAR_CL, new String(yytext()));}
    "," {return symbol(sym.COMA, new String(yytext()));}
    "." {return symbol(sym.PUNTO, new String(yytext()));}
    "||" {return symbol(sym.OR, new String(yytext()));}
    {ID} {return symbol(sym.ID, new String(yytext()));}
    {COMENTARIO} {/*Ignoramos comentarios*/}
    {ESPACIOBLANCO} {}
    {NUM} {return symbol(sym.NUM, new String(yytext()));}

    [^]   {System.out.println("Error lexico" +yytext());}



