
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
    "\000\066\000\002\002\003\000\002\002\004\000\002\003" +
    "\003\000\002\003\004\000\002\004\013\000\002\005\004" +
    "\000\002\005\006\000\002\005\002\000\002\006\003\000" +
    "\002\006\002\000\002\021\003\000\002\021\004\000\002" +
    "\022\003\000\002\022\003\000\002\022\003\000\002\022" +
    "\003\000\002\007\012\000\002\007\011\000\002\032\007" +
    "\000\002\027\006\000\002\027\005\000\002\012\003\000" +
    "\002\012\003\000\002\030\005\000\002\017\005\000\002" +
    "\017\003\000\002\031\004\000\002\031\003\000\002\026" +
    "\003\000\002\026\002\000\002\024\003\000\002\024\004" +
    "\000\002\023\003\000\002\023\003\000\002\015\005\000" +
    "\002\015\007\000\002\016\011\000\002\016\007\000\002" +
    "\016\012\000\002\033\003\000\002\033\005\000\002\033" +
    "\002\000\002\025\005\000\002\020\002\000\002\013\003" +
    "\000\002\013\003\000\002\013\003\000\002\014\003\000" +
    "\002\014\003\000\002\034\003\000\002\034\003\000\002" +
    "\034\003\000\002\011\003\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\143\000\004\031\007\001\002\000\004\002\145\001" +
    "\002\000\006\002\uffff\031\007\001\002\000\004\002\001" +
    "\001\002\000\010\034\011\037\013\040\012\001\002\000" +
    "\004\007\014\001\002\000\004\007\uffd4\001\002\000\004" +
    "\007\uffd3\001\002\000\004\007\uffd5\001\002\000\004\022" +
    "\015\001\002\000\010\023\ufffa\034\017\037\021\001\002" +
    "\000\004\007\141\001\002\000\004\007\uffd1\001\002\000" +
    "\004\023\022\001\002\000\004\007\uffd2\001\002\000\004" +
    "\004\023\001\002\000\016\005\ufff8\006\024\007\032\010" +
    "\034\034\017\037\021\001\002\000\004\022\076\001\002" +
    "\000\004\005\ufff9\001\002\000\016\005\ufff5\006\ufff5\007" +
    "\ufff5\010\ufff5\034\ufff5\037\ufff5\001\002\000\016\005\ufff7" +
    "\006\024\007\032\010\034\034\017\037\021\001\002\000" +
    "\016\005\ufff2\006\ufff2\007\ufff2\010\ufff2\034\ufff2\037\ufff2" +
    "\001\002\000\016\005\ufff3\006\ufff3\007\ufff3\010\ufff3\034" +
    "\ufff3\037\ufff3\001\002\000\006\020\063\022\064\001\002" +
    "\000\004\007\042\001\002\000\004\011\uffd6\001\002\000" +
    "\004\005\037\001\002\000\016\005\ufff4\006\ufff4\007\ufff4" +
    "\010\ufff4\034\ufff4\037\ufff4\001\002\000\006\002\ufffd\031" +
    "\ufffd\001\002\000\004\011\041\001\002\000\016\005\uffd7" +
    "\006\uffd7\007\uffd7\010\uffd7\034\uffd7\037\uffd7\001\002\000" +
    "\006\011\044\020\043\001\002\000\012\007\045\012\047" +
    "\035\051\036\052\001\002\000\016\005\uffdf\006\uffdf\007" +
    "\uffdf\010\uffdf\034\uffdf\037\uffdf\001\002\000\006\011\uffcf" +
    "\022\054\001\002\000\004\011\uffce\001\002\000\004\011" +
    "\uffd0\001\002\000\004\011\053\001\002\000\004\011\uffcd" +
    "\001\002\000\004\011\uffcc\001\002\000\016\005\uffde\006" +
    "\uffde\007\uffde\010\uffde\034\uffde\037\uffde\001\002\000\006" +
    "\007\055\023\uffd8\001\002\000\006\023\uffda\024\061\001" +
    "\002\000\004\023\057\001\002\000\004\011\060\001\002" +
    "\000\016\005\uffdb\006\uffdb\007\uffdb\010\uffdb\034\uffdb\037" +
    "\uffdb\001\002\000\006\007\055\023\uffd8\001\002\000\004" +
    "\023\uffd9\001\002\000\004\007\070\001\002\000\006\007" +
    "\055\023\uffd8\001\002\000\004\023\066\001\002\000\004" +
    "\011\067\001\002\000\016\005\uffdc\006\uffdc\007\uffdc\010" +
    "\uffdc\034\uffdc\037\uffdc\001\002\000\004\022\071\001\002" +
    "\000\006\007\055\023\uffd8\001\002\000\004\023\073\001" +
    "\002\000\004\011\074\001\002\000\016\005\uffdd\006\uffdd" +
    "\007\uffdd\010\uffdd\034\uffdd\037\uffdd\001\002\000\004\005" +
    "\ufff6\001\002\000\010\007\077\034\017\037\021\001\002" +
    "\000\004\020\137\001\002\000\004\007\132\001\002\000" +
    "\004\023\117\001\002\000\004\011\103\001\002\000\004" +
    "\007\104\001\002\000\004\017\112\001\002\000\004\011" +
    "\106\001\002\000\004\007\107\001\002\000\006\021\111" +
    "\023\uffe6\001\002\000\004\023\uffef\001\002\000\004\023" +
    "\uffe7\001\002\000\004\007\113\001\002\000\006\011\uffe8" +
    "\013\115\001\002\000\004\011\uffea\001\002\000\004\007" +
    "\116\001\002\000\004\011\uffe9\001\002\000\004\004\120" +
    "\001\002\000\014\005\uffe4\006\uffe4\007\032\034\017\037" +
    "\021\001\002\000\014\005\uffe0\006\uffe0\007\uffe0\034\uffe0" +
    "\037\uffe0\001\002\000\006\005\130\006\024\001\002\000" +
    "\014\005\uffe3\006\uffe3\007\032\034\017\037\021\001\002" +
    "\000\006\005\uffe5\006\uffe5\001\002\000\014\005\uffe1\006" +
    "\uffe1\007\uffe1\034\uffe1\037\uffe1\001\002\000\006\005\uffe2" +
    "\006\uffe2\001\002\000\004\005\131\001\002\000\016\005" +
    "\ufff0\006\ufff0\007\ufff0\010\ufff0\034\ufff0\037\ufff0\001\002" +
    "\000\016\005\ufff1\006\ufff1\007\ufff1\010\ufff1\034\ufff1\037" +
    "\ufff1\001\002\000\004\020\133\001\002\000\006\007\135" +
    "\012\134\001\002\000\004\011\uffeb\001\002\000\004\011" +
    "\uffec\001\002\000\004\011\uffee\001\002\000\006\007\135" +
    "\012\134\001\002\000\004\011\uffed\001\002\000\006\023" +
    "\ufffc\024\142\001\002\000\010\023\ufffa\034\017\037\021" +
    "\001\002\000\004\023\ufffb\001\002\000\004\002\ufffe\001" +
    "\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\143\000\010\002\003\003\005\004\004\001\001\000" +
    "\002\001\001\000\006\003\143\004\004\001\001\000\002" +
    "\001\001\000\004\013\007\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\005\017\014\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\022\006\034\007\025\014\032\015" +
    "\030\016\035\021\024\022\026\025\027\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\020\007" +
    "\025\014\032\015\030\016\035\021\074\022\026\025\027" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\020\037\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\011\045" +
    "\034\047\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\033" +
    "\055\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\033\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\033\064\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\033\071\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\014\077\027\101\032\100\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\030\104\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\031\107\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\017\113\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\014\032\015\120\016\124" +
    "\023\122\024\123\026\121\001\001\000\002\001\001\000" +
    "\004\007\126\001\001\000\014\014\032\015\120\016\124" +
    "\023\122\024\125\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\135\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\137\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\005\142\014\015\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

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
        System.out.println("Análisis incorrecto");
        report_error(message, info);
        System.exit(1);
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
          case 8: // cuerpo_metodo ::= bloque_inst 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_metodo",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // cuerpo_metodo ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_metodo",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // bloque_inst ::= inst 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloque_inst",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // bloque_inst ::= inst bloque_inst 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloque_inst",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // inst ::= dec_for 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inst",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // inst ::= dec_call 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inst",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // inst ::= dec_asigs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inst",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // inst ::= dec_return 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inst",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // dec_for ::= FOR PAR_OP init_for PAR_CL LL_OP cuerpo_for dec_for LL_CL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_for",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // dec_for ::= FOR PAR_OP init_for PAR_CL LL_OP cuerpo_for LL_CL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_for",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // init_for ::= for_st_1 PUNTOCOMA for_st_2 PUNTOCOMA for_st_3 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("init_for",24, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // for_st_1 ::= type_vars ID ASIGNACION for_st_aux 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_1",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // for_st_1 ::= ID ASIGNACION for_st_aux 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_1",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // for_st_aux ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_aux",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // for_st_aux ::= NUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_aux",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // for_st_2 ::= ID RELACIONALES for_st_arrays 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_2",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // for_st_arrays ::= ID PUNTO ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_arrays",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // for_st_arrays ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_arrays",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // for_st_3 ::= ID INCREMENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_3",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // for_st_3 ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_st_3",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // cuerpo_for ::= bloque_inst_for 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_for",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // cuerpo_for ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_for",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // bloque_inst_for ::= inst_for 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloque_inst_for",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // bloque_inst_for ::= inst_for bloque_inst_for 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloque_inst_for",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // inst_for ::= dec_call 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inst_for",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // inst_for ::= dec_asigs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inst_for",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // dec_asigs ::= type_vars ID PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // dec_asigs ::= type_vars ID ASIGNACION type_asigs PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_asigs",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // dec_call ::= ID ASIGNACION ID PAR_OP dec_call_args PAR_CL PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // dec_call ::= ID PAR_OP dec_call_args PAR_CL PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // dec_call ::= type_vars ID ASIGNACION ID PAR_OP dec_call_args PAR_CL PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // dec_call_args ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call_args",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // dec_call_args ::= ID COMA dec_call_args 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call_args",25, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // dec_call_args ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_call_args",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // dec_return ::= RETURN dec_exp PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_return",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // dec_exp ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_exp",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // type_methods ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_methods",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // type_methods ::= BOOLEAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_methods",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // type_methods ::= VOID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_methods",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // type_vars ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_vars",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // type_vars ::= BOOLEAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_vars",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // type_asigs ::= NUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_asigs",26, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // type_asigs ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_asigs",26, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // type_asigs ::= type_boolean 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_asigs",26, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // type_boolean ::= TRUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_boolean",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // type_boolean ::= FALSE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_boolean",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
