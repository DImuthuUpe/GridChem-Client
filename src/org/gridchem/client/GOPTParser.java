package org.gridchem.client;
//----------------------------------------------------
// The following code was generated by CUP v0.10k TUM Edition 20050516
// Wed Feb 08 14:13:50 CST 2006
//----------------------------------------------------

import java_cup.runtime.*;
import org.gridchem.client.util.Env;
import org.gridchem.client.common.Settings;
import org.gridchem.client.gui.panels.myccg.job.JobPanel;

import javax.swing.*;

import org.gridchem.client.*;

import java.util.*;
import java.io.*;

/** CUP v0.10k TUM Edition 20050516 generated parser.
  * @version Wed Feb 08 14:13:50 CST 2006
  */
public class GOPTParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public GOPTParser() {super();}

  /** Constructor which sets the default scanner. */
  public GOPTParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\003\005\000\002\002\004\000\002\004" +
    "\003\000\002\005\004\000\002\005\003\000\002\006\004" +
    "\000\002\006\003\000\002\007\004\000\002\007\003\000" +
    "\002\007\003\000\002\010\004\000\002\011\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\004\004\005\001\002\000\012\006\016\007" +
    "\011\010\012\011\010\001\002\000\012\006\uffff\007\uffff" +
    "\010\uffff\011\uffff\001\002\000\004\002\007\001\002\000" +
    "\004\002\000\001\002\000\004\015\026\001\002\000\004" +
    "\013\025\001\002\000\004\014\024\001\002\000\014\005" +
    "\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb\001\002\000\014" +
    "\005\ufff8\006\ufff8\007\ufff8\010\ufff8\011\ufff8\001\002\000" +
    "\014\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9\001\002" +
    "\000\004\012\023\001\002\000\014\005\022\006\016\007" +
    "\011\010\012\011\010\001\002\000\014\005\ufffd\006\ufffd" +
    "\007\ufffd\010\ufffd\011\ufffd\001\002\000\014\005\ufffe\006" +
    "\ufffe\007\ufffe\010\ufffe\011\ufffe\001\002\000\004\002\001" +
    "\001\002\000\014\005\ufffa\006\ufffa\007\ufffa\010\ufffa\011" +
    "\ufffa\001\002\000\014\005\ufff7\006\ufff7\007\ufff7\010\ufff7" +
    "\011\ufff7\001\002\000\014\005\ufffc\006\ufffc\007\ufffc\010" +
    "\ufffc\011\ufffc\001\002\000\014\005\ufff6\006\ufff6\007\ufff6" +
    "\010\ufff6\011\ufff6\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\006\003\005\004\003\001\001\000\014\005" +
    "\016\006\017\007\012\010\014\011\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\006\020\007\012\010\014\011\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$GOPTParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions() throws IOException
    {
      action_obj = new CUP$GOPTParser$actions(this);
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
    return action_obj.CUP$GOPTParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$GOPTParser$actions {

 
  //__________________________________
  public static boolean DEBUG = true;
      public ParseGSCF2 temp1;
    public ParseGSCF2 temp2;
   public ParseGSCF2 temp3;
  private static JTable table;               
  private static final String tableLabel = "SCF Intermediate Results:";
// private static String cycle = "0";
 
  
  public static JTable getTable() {
    return table;
  }

  public static String getTableLabel() {
    return tableLabel;
  }

//   }

  private final GOPTParser parser;

  /** Constructor */
  CUP$GOPTParser$actions(GOPTParser parser) throws IOException {
    this.parser = parser;
       //temp1 = new ParseGSCF2(Settings.defaultDirStr + 
    temp1 = new ParseGSCF2(Env.getApplicationDataDir() +
	       		Settings.fileSeparator + "Energy_data");
    //temp2 = new ParseGSCF2(Settings.defaultDirStr +
    temp2 = new ParseGSCF2(Env.getApplicationDataDir() +
	       		Settings.fileSeparator + "temporary2");
    //temp3 = new ParseGSCF2(Settings.defaultDirStr +
   	temp3 = new ParseGSCF2(Env.getApplicationDataDir() +
	       		Settings.fileSeparator + "temporary3");
    temp1.putField("TitleText: Energy versus Iteration"+" - "+JobPanel.jobName+"\n");
    temp1.putField("XLabel: Iteration\n YLabel: Energy\n");
    temp1.putField("DataSet: Energy\n");
     temp1.putField("1, "); 
    temp2.putField("TitleText: Gradient versus Iteration"+" - "+JobPanel.jobName+"\n");
    temp2.putField("XLabel: Iteration\n YLabel: Maximum Gradient\n");
    temp2.putField("DataSet: Maximum Gradient\n");
    temp3.putField("\n\n");
    temp3.putField("XLabel: Iteration\n YLabel: RMS Gradient\n");
    temp3.putField("DataSet: RMS Gradient\n");
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$GOPTParser$do_action(
    int                        CUP$GOPTParser$act_num,
    java_cup.runtime.lr_parser CUP$GOPTParser$parser,
    java.util.Stack            CUP$GOPTParser$stack,
    int                        CUP$GOPTParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$GOPTParser$result;

      /* select the action based on the action number */
      switch (CUP$GOPTParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // grad2 ::= RmsGrad RGRAD 
            {
              Object RESULT = null;
		int rgleft = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left;
		int rgright = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right;
		Float rg = (Float)((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).value;
		 //___________________________________________________________________
   if (DEBUG) System.out.println("CUP:gopt: RMS Force "+rg);
   float rms = rg.floatValue();
   temp3.putField(rms);
 
 
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(7/*grad2*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // grad1 ::= MaxGrad MGRAD 
            {
              Object RESULT = null;
		int mgleft = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left;
		int mgright = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right;
		Float mg = (Float)((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).value;
		 //___________________________________________________________________
   if (DEBUG) System.out.println("CUP:gopt: Maximum Force "+mg);
   float maxim = mg.floatValue();
   temp2.putField(maxim);
 
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(6/*grad1*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // cycle ::= grad2 
            {
              Object RESULT = null;
              // propagate RESULT from NT$1
              if ( ((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-2)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-3)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-3)).right;
		Integer c = (Integer)((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-3)).value;
       
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(5/*cycle*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // cycle ::= grad1 
            {
              Object RESULT = null;
              // propagate RESULT from NT$1
              if ( ((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-2)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-3)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-3)).right;
		Integer c = (Integer)((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-3)).value;
              
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(5/*cycle*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // cycle ::= NSearch ITERATION 
            {
              Object RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right;
		Integer c = (Integer)((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).value;
		 //___________________________________________________________________
   if (DEBUG) System.out.println("CUP:gopt:  ITERATION "+c); 
        int cycl = c.intValue();
      temp1.putField(cycl+1);
      temp1.putField(", ");
      temp2.putField(cycl);
      temp2.putField(", ");
      temp3.putField(cycl);
      temp3.putField(", ");
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(5/*cycle*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // scfcycle ::= cycle 
            {
              Object RESULT = null;

              CUP$GOPTParser$result = new java_cup.runtime.Symbol(4/*scfcycle*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // scfcycle ::= Energ ENERGY 
            {
              Object RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right;
		Float e = (Float)((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).value;
		 //___________________________________________________________________
   if (DEBUG) System.out.println("CUP:gopt:  ENERGY "+e);
             float energ = e.floatValue();
            temp1.putField(energ);
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(4/*scfcycle*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // scfpat ::= scfcycle 
            {
              Object RESULT = null;

              CUP$GOPTParser$result = new java_cup.runtime.Symbol(3/*scfpat*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // scfpat ::= scfpat scfcycle 
            {
              Object RESULT = null;
		 if (DEBUG) System.out.println("CUP:gopt: in scfpat"); 
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(3/*scfpat*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // scfintro ::= FOUNDITER 
            {
              Object RESULT = null;
		 if (DEBUG) System.out.println("CUP:gopt:  found the start of Iteration"); 
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(2/*scfintro*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= startpt EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).value;
		RESULT = start_val;
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$GOPTParser$parser.done_parsing();
          return CUP$GOPTParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // startpt ::= scfintro scfpat SCFDONE 
            {
              Object RESULT = null;
		 if (DEBUG) System.out.println("CUP:gopt:  end of parse tree "); 
 	       table = new JTable();
	
//       table = parseSCF.getTable();
 	     
              CUP$GOPTParser$result = new java_cup.runtime.Symbol(1/*startpt*/, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$GOPTParser$stack.elementAt(CUP$GOPTParser$top-0)).right, RESULT);
            }
          return CUP$GOPTParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

