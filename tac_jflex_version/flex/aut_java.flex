
import java.util.*;
import java.io.*;


%%

%class AnalizadorLexico
%unicode
%standalone
%line
%column

//Declaraciones

%{

%}

TERMINAR_LINEA = \r|\n|\r\n
CARACTERIN = [^\r\n]
ESPACIOBLANCO = {TERMINAR_LINEA} | [ \t\f]
COMENTARIO = {COMENTARIOT} | {FINLINEACOMENT}
COMENTARIOT = "/*" [^*] ~"*/" | "*/" "*"+ "/";
FINLINEACOMENT = "//" {CARACTERIN}* {TERMINAR_LINEA}?
ID = [a-zA-Z][a-zA-Z0-9"_""-"]*
LOGICOS_BINARIOS = "&&" | "||";
ARIT = "*" | "/" | "+" | "-";
RELACIONALES = "<" | "<=" | ">" | ">=" | "==" | "!=";
ASIGNACION = "="
INCREMENT = "++" | "--";
NUM = 0 | [1-9][0-9]*


%%
    "null" { System.out.println("Token "+yytext()+ " " );} 
    "return" { System.out.println("Token "+yytext()+ " " );} 
    "for"  { System.out.println("Token "+yytext()+ " " );} 
    "int"  { System.out.println("Token "+yytext()+ " " );} 
    "boolean"  { System.out.println("Token "+yytext()+ " " );} 
    "void"  { System.out.println("Token "+yytext()+ " " );} 
    "public static"  { System.out.println("Token "+yytext()+ " " );} 
    "true"   { System.out.println("Token "+yytext()+ " " );} 
    "false"  { System.out.println("Token "+yytext()+ " " );} 
    {ARIT}  { System.out.println("Token "+yytext()+ " " );} 
    {RELACIONALES}  { System.out.println("Token "+yytext()+ " " );} 
    ";"  { System.out.println("Token "+yytext()+ " " );} 
    {ASIGNACION}  { System.out.println("Token "+yytext()+ " " );} 
    {INCREMENT}  { System.out.println("Token "+yytext()+ " " );} 
    {LOGICOS_BINARIOS} { System.out.println("Token "+yytext()+ " " );} 
    "!" { System.out.println("Token "+yytext()+ " " );} 
    "{"  { System.out.println("Token "+yytext()+ " " );} 
    "}"  { System.out.println("Token "+yytext()+ " " );} 
    "("  { System.out.println("Token "+yytext()+ " " );} 
    ")"  { System.out.println("Token "+yytext()+ " " );} 
    ","  { System.out.println("Token "+yytext()+ " " );} 
    "."  { System.out.println("Token "+yytext()+ " " );} 
    {ID}  { System.out.println("Token "+yytext()+ " " );} 
    {COMENTARIO} {/*Ignoramos comentarios*/}
    {ESPACIOBLANCO} {}
    {NUM}  { System.out.println("Token "+yytext()+ " " );} 

    [^]   {System.out.println("Error lexico" +yytext()+ " ");}



