
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package teoria_automatas;

import java.io.*;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\067\000\002\002\003\000\002\002\004\000\002\003" +
    "\003\000\002\003\004\000\002\004\013\000\002\005\004" +
    "\000\002\005\006\000\002\005\002\000\002\006\005\000" +
    "\002\017\003\000\002\017\002\000\002\007\012\000\002" +
    "\007\011\000\002\031\007\000\002\026\006\000\002\026" +
    "\005\000\002\012\003\000\002\012\003\000\002\027\005" +
    "\000\002\023\005\000\002\023\003\000\002\030\004\000" +
    "\002\025\003\000\002\014\003\000\002\014\002\000\002" +
    "\020\007\000\002\020\005\000\002\020\006\000\002\020" +
    "\007\000\002\020\006\000\002\020\010\000\002\020\006" +
    "\000\002\020\006\000\002\020\007\000\002\020\010\000" +
    "\002\033\002\000\002\022\007\000\002\022\002\000\002" +
    "\032\003\000\002\032\005\000\002\032\002\000\002\024" +
    "\005\000\002\024\005\000\002\024\005\000\002\024\002" +
    "\000\002\010\002\000\002\015\003\000\002\015\003\000" +
    "\002\015\003\000\002\016\003\000\002\016\003\000\002" +
    "\011\003\000\002\011\003\000\002\021\003\000\002\021" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\143\000\004\023\007\001\002\000\004\002\145\001" +
    "\002\000\006\002\uffff\023\007\001\002\000\004\002\001" +
    "\001\002\000\010\026\011\031\013\032\012\001\002\000" +
    "\004\007\014\001\002\000\004\007\uffd2\001\002\000\004" +
    "\007\uffd1\001\002\000\004\007\uffd3\001\002\000\004\020" +
    "\015\001\002\000\010\021\ufffa\026\017\031\021\001\002" +
    "\000\004\007\141\001\002\000\004\007\uffcf\001\002\000" +
    "\004\021\022\001\002\000\004\007\uffd0\001\002\000\004" +
    "\004\023\001\002\000\012\005\ufff7\006\026\007\ufff7\010" +
    "\ufff7\001\002\000\010\005\uffdc\007\121\010\uffdc\001\002" +
    "\000\010\005\ufff8\007\ufff8\010\ufff8\001\002\000\004\020" +
    "\031\001\002\000\004\005\030\001\002\000\006\002\ufffd" +
    "\023\ufffd\001\002\000\010\007\033\026\017\031\021\001" +
    "\002\000\004\007\115\001\002\000\004\015\111\001\002" +
    "\000\004\021\052\001\002\000\004\011\036\001\002\000" +
    "\004\007\037\001\002\000\004\014\045\001\002\000\004" +
    "\011\041\001\002\000\004\007\042\001\002\000\004\016" +
    "\044\001\002\000\004\021\ufff4\001\002\000\004\021\uffec" +
    "\001\002\000\004\007\046\001\002\000\006\011\uffed\013" +
    "\050\001\002\000\004\011\uffef\001\002\000\004\007\051" +
    "\001\002\000\004\011\uffee\001\002\000\004\004\053\001" +
    "\002\000\014\005\uffe9\006\uffe9\007\054\026\017\031\021" +
    "\001\002\000\004\015\102\001\002\000\004\007\064\001" +
    "\002\000\006\005\uffeb\006\uffeb\001\002\000\006\005\062" +
    "\006\026\001\002\000\006\005\uffea\006\uffea\001\002\000" +
    "\004\005\063\001\002\000\010\005\ufff5\007\ufff5\010\ufff5" +
    "\001\002\000\010\005\ufff6\007\ufff6\010\ufff6\001\002\000" +
    "\006\011\066\015\065\001\002\000\012\007\071\012\070" +
    "\027\073\030\074\001\002\000\014\005\uffe7\006\uffe7\007" +
    "\054\026\017\031\021\001\002\000\006\005\uffe2\006\uffe2" +
    "\001\002\000\012\007\uffcc\011\uffcc\026\uffcc\031\uffcc\001" +
    "\002\000\004\011\100\001\002\000\012\007\uffcb\011\uffcb" +
    "\026\uffcb\031\uffcb\001\002\000\012\007\uffce\011\uffce\026" +
    "\uffce\031\uffce\001\002\000\012\007\uffcd\011\uffcd\026\uffcd" +
    "\031\uffcd\001\002\000\004\011\076\001\002\000\014\005" +
    "\uffe8\006\uffe8\007\054\026\017\031\021\001\002\000\006" +
    "\005\uffe3\006\uffe3\001\002\000\014\005\uffe5\006\uffe5\007" +
    "\054\026\017\031\021\001\002\000\006\005\uffdf\006\uffdf" +
    "\001\002\000\012\007\103\012\070\027\073\030\074\001" +
    "\002\000\004\011\107\001\002\000\012\007\054\011\105" +
    "\026\017\031\021\001\002\000\006\005\uffe4\006\uffe4\001" +
    "\002\000\006\005\uffe1\006\uffe1\001\002\000\014\005\uffe6" +
    "\006\uffe6\007\054\026\017\031\021\001\002\000\006\005" +
    "\uffe0\006\uffe0\001\002\000\006\007\113\012\112\001\002" +
    "\000\004\011\ufff0\001\002\000\004\011\ufff1\001\002\000" +
    "\004\011\ufff2\001\002\000\004\015\116\001\002\000\006" +
    "\007\113\012\112\001\002\000\004\011\ufff3\001\002\000" +
    "\006\005\uffd5\010\131\001\002\000\004\020\122\001\002" +
    "\000\006\007\123\021\uffd9\001\002\000\006\021\uffdb\022" +
    "\127\001\002\000\004\021\125\001\002\000\004\011\126" +
    "\001\002\000\006\005\uffdd\010\uffdd\001\002\000\006\007" +
    "\123\021\uffd9\001\002\000\004\021\uffda\001\002\000\012" +
    "\007\133\011\uffd4\027\073\030\074\001\002\000\004\005" +
    "\ufff9\001\002\000\004\011\140\001\002\000\004\011\137" +
    "\001\002\000\004\011\136\001\002\000\004\005\uffd6\001" +
    "\002\000\004\005\uffd7\001\002\000\004\005\uffd8\001\002" +
    "\000\006\021\ufffc\022\142\001\002\000\010\021\ufffa\026" +
    "\017\031\021\001\002\000\004\021\ufffb\001\002\000\004" +
    "\002\ufffe\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\143\000\010\002\003\003\005\004\004\001\001\000" +
    "\002\001\001\000\006\003\143\004\004\001\001\000\002" +
    "\001\001\000\004\015\007\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\005\017\016\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\006\026\007\024\017\023\001" +
    "\001\000\004\022\117\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\016" +
    "\031\026\034\031\033\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\027" +
    "\037\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\030\042\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\023\046\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\014\055\016\054\020\057\025\056" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\060\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\011\071\021\074\001\001\000\006\016\054" +
    "\020\066\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\016\054\020\076\001" +
    "\001\000\002\001\001\000\006\016\054\020\100\001\001" +
    "\000\002\001\001\000\006\011\071\021\103\001\001\000" +
    "\002\001\001\000\006\016\054\020\105\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\016\054\020\107\001" +
    "\001\000\002\001\001\000\004\012\113\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\012\116\001\001\000\002\001\001\000\004" +
    "\024\131\001\001\000\002\001\001\000\004\032\123\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\032\127\001\001\000\002\001" +
    "\001\000\006\010\134\011\133\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\005\142\016\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public void report_error(String message, Object info) {

/*Parafernalia de pepe castro para pillar errores....*/
        StringBuffer m = new StringBuffer("Error");

        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {                
                m.append(" en la linea "+(s.left+1));   
                if (s.right >= 0)                    
                    m.append(", columna "+(s.right+1));
            }
        }

        m.append(" : "+message);

        System.err.println(m);
    }
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

    public void syntax_error(Symbol s){
        System.out.println("Error recuperable de sintaxis: "+s.value+" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error no recuperable de sintaxis: "+s.value+" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {




  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // programa ::= dec_metodos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // dec_metodos ::= metodos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_metodos",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // dec_metodos ::= metodos dec_metodos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_metodos",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // metodos ::= BEGIN_METODOS type_methods ID PAR_OP dec_args PAR_CL LL_OP cuerpo_metodo LL_CL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("metodos",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // dec_args ::= type_vars ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_args",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // dec_args ::= type_vars ID COMA dec_args 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_args",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // dec_args ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_args",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // cuerpo_metodo ::= dec_for_loop dec_call dec_return 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_metodo",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // dec_for_loop ::= dec_for 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_for_loop",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // dec_for_loop ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_for_loop",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // dec_for ::= FOR PAR_OP init_for PAR_CL LL_OP cuerpo_for dec_for LL_CL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_for",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // dec_for ::= FOR PAR_OP init_for PAR_CL LL_OP cuerpo_for LL_CL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_for",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // init_for ::= for_st_1 PUNTOCOMA for_st_2 PUNTOCOMA for_st_3 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("init_for",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // for_st_1 ::= type_vars ID ASIGNACION for_st_aux 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_1",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // for_st_1 ::= ID ASIGNACION for_st_aux 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_1",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // for_st_aux ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_aux",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // for_st_aux ::= NUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_aux",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // for_st_2 ::= ID RELACIONALES for_st_arrays 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_2",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // for_st_arrays ::= ID PUNTO ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_arrays",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // for_st_arrays ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_arrays",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // for_st_3 ::= ID INCREMENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_3",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // cuerpo_for ::= dec_asigs_ops 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_for",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // dec_asigs_ops ::= dec_asigs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs_ops",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // dec_asigs_ops ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs_ops",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // dec_asigs ::= type_vars ID ASIGNACION dec_asigs_aux PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // dec_asigs ::= type_vars ID PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // dec_asigs ::= ID ASIGNACION ID PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // dec_asigs ::= type_vars ID ASIGNACION ID PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // dec_asigs ::= ID ASIGNACION dec_asigs_aux PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // dec_asigs ::= type_vars ID ASIGNACION dec_asigs_aux PUNTOCOMA dec_asigs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // dec_asigs ::= type_vars ID PUNTOCOMA dec_asigs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // dec_asigs ::= ID ASIGNACION dec_asigs_aux dec_asigs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // dec_asigs ::= ID ASIGNACION ID PUNTOCOMA dec_asigs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // dec_asigs ::= type_vars ID ASIGNACION ID PUNTOCOMA dec_asigs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // dec_decl ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_decl",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // dec_call ::= ID PAR_OP dec_call_args PAR_CL PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // dec_call ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // dec_call_args ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call_args",24, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // dec_call_args ::= ID COMA dec_call_args 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call_args",24, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // dec_call_args ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call_args",24, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // dec_return ::= RETURN ID PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_return",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // dec_return ::= RETURN type_boolean PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_return",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // dec_return ::= RETURN dec_ops PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_return",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // dec_return ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_return",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // dec_ops ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_ops",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // type_methods ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_methods",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // type_methods ::= BOOLEAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_methods",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // type_methods ::= VOID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_methods",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // type_vars ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_vars",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // type_vars ::= BOOLEAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_vars",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // type_boolean ::= TRUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_boolean",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // type_boolean ::= FALSE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_boolean",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // dec_asigs_aux ::= NUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs_aux",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // dec_asigs_aux ::= type_boolean 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs_aux",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
