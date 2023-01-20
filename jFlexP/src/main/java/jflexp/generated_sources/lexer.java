/* The following code was generated by JFlex 1.4.3 on 11/06/18 19.00 */

package jflexp.generated_sources;

import java_cup.runtime.*;
import java.io.*;
import jflexp.Parse;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/06/18 19.00 from the specification file
 * <tt>G:/Release/jFlexP/src/main/jflex/scanner.flex</tt>
 */
public class lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int LOADTL = 26;
  public static final int GOTO = 6;
  public static final int OUTTOL = 34;
  public static final int LAST_POINT = 12;
  public static final int CIRCLE = 18;
  public static final int SWITCH = 28;
  public static final int FEDRAT = 10;
  public static final int INTOL = 32;
  public static final int INDIRV = 14;
  public static final int TOOLNO = 4;
  public static final int COMMENT = 2;
  public static final int CUTTER = 24;
  public static final int LINE = 16;
  public static final int CUTCOM = 22;
  public static final int COOLNT = 20;
  public static final int YYINITIAL = 0;
  public static final int REWIND = 30;
  public static final int SPINDL = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 13, 13, 13, 
    12, 12, 12, 12
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\3\0\1\4"+
    "\3\0\1\35\1\36\1\0\1\32\1\31\1\32\1\34\1\30\12\33"+
    "\7\0\1\6\1\0\1\23\1\14\1\15\1\21\1\16\1\27\1\13"+
    "\2\0\1\17\1\25\1\11\1\12\1\5\1\0\1\7\1\20\1\10"+
    "\1\24\1\22\1\26\uffa8\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\0\1\2\11\0\2\1\15\0\2\1"+
    "\2\3\1\0\1\4\1\5\1\2\3\0\1\2\1\0"+
    "\1\6\2\7\2\10\2\0\1\11\2\12\4\0\1\13"+
    "\1\14\23\0\1\15\25\0\1\16\5\0\1\17\7\0"+
    "\1\20\7\0\1\21\1\22\1\23\1\24\7\0\1\25"+
    "\10\0\1\26\1\0\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\37\0\76\0\135\0\174\0\233\0\272\0\331"+
    "\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193\0\u01b2\0\u01d1"+
    "\0\u01f0\0\u020f\0\u022e\0\u024d\0\u026c\0\u028b\0\u02aa\0\u02c9"+
    "\0\u02e8\0\u0307\0\u0326\0\u0345\0\u0364\0\u0383\0\u03a2\0\u01d1"+
    "\0\u03c1\0\u03e0\0\u01d1\0\u01d1\0\u03ff\0\u041e\0\u043d\0\u045c"+
    "\0\u047b\0\u049a\0\u01d1\0\u04b9\0\u01d1\0\u04d8\0\u01d1\0\u04f7"+
    "\0\u0516\0\u01d1\0\u0535\0\u01d1\0\u0554\0\u0573\0\u0592\0\u05b1"+
    "\0\u05d0\0\u01d1\0\u05ef\0\u060e\0\u062d\0\u064c\0\u066b\0\u068a"+
    "\0\u06a9\0\u06c8\0\u06e7\0\u0706\0\u0725\0\u0744\0\u0763\0\u0782"+
    "\0\u07a1\0\u07c0\0\u07df\0\u07fe\0\u081d\0\u01d1\0\u083c\0\u085b"+
    "\0\u087a\0\u0899\0\u08b8\0\u08d7\0\u08f6\0\u0915\0\u0934\0\u0953"+
    "\0\u0972\0\u0991\0\u09b0\0\u09cf\0\u09ee\0\u0a0d\0\u0a2c\0\u0a4b"+
    "\0\u0a6a\0\u0a89\0\u0aa8\0\u01d1\0\u0ac7\0\u0ae6\0\u0b05\0\u0b24"+
    "\0\u0b43\0\u01d1\0\u0b62\0\u0b81\0\u0ba0\0\u0bbf\0\u0bde\0\u0bfd"+
    "\0\u0c1c\0\u01d1\0\u0c3b\0\u0c5a\0\u0c79\0\u0c98\0\u0cb7\0\u0cd6"+
    "\0\u0cf5\0\u01d1\0\u01d1\0\u01d1\0\u01d1\0\u0d14\0\u0d33\0\u0d52"+
    "\0\u0d71\0\u0d90\0\u0daf\0\u0dce\0\u01d1\0\u0ded\0\u0e0c\0\u0e2b"+
    "\0\u0e4a\0\u0e69\0\u0e88\0\u0ea7\0\u0ec6\0\u01d1\0\u0ee5\0\u01d1"+
    "\0\u01d1\0\u01d1\0\u01d1\0\u01d1\0\u01d1\0\u01d1\0\u01d1\0\u01d1"+
    "\0\u01d1\0\u01d1\0\u01d1";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\17\2\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\0\1\26\1\27\1\0\1\30\1\31\1\32\1\33"+
    "\1\34\1\0\1\35\13\0\1\36\1\37\1\40\34\36"+
    "\1\0\1\41\1\40\1\20\4\0\1\42\17\0\1\43"+
    "\1\44\1\0\1\45\4\0\1\41\1\40\1\20\24\0"+
    "\1\43\1\44\2\46\1\45\3\0\1\41\1\40\1\20"+
    "\3\0\1\47\2\0\1\50\15\0\1\43\1\20\1\46"+
    "\1\51\1\45\3\0\1\41\1\40\1\20\21\0\1\52"+
    "\2\0\1\43\1\44\2\46\1\45\3\0\1\41\1\40"+
    "\2\20\24\0\1\44\2\46\1\45\1\0\1\53\1\0"+
    "\1\54\1\55\2\20\23\0\1\43\1\44\2\46\1\45"+
    "\3\0\1\56\1\57\2\20\5\0\1\60\4\0\1\61"+
    "\10\0\1\43\1\44\2\46\1\45\1\62\1\53\1\0"+
    "\1\63\1\64\2\20\3\0\1\65\5\0\1\66\4\0"+
    "\1\67\4\0\1\43\1\44\2\46\1\45\1\62\2\0"+
    "\1\41\1\40\1\20\6\0\1\60\15\0\1\43\7\0"+
    "\1\41\1\40\1\20\6\0\1\70\15\0\1\43\7\0"+
    "\1\41\1\40\1\20\24\0\1\43\1\0\2\46\1\45"+
    "\3\0\1\41\1\40\1\20\24\0\1\43\2\0\1\71"+
    "\5\0\1\20\77\0\1\72\40\0\1\73\54\0\1\74"+
    "\20\0\1\75\6\0\1\76\33\0\1\77\50\0\1\100"+
    "\23\0\1\101\36\0\1\102\37\0\1\103\36\0\1\104"+
    "\31\0\1\105\20\0\1\106\25\0\1\107\33\0\1\110"+
    "\11\0\1\111\12\0\2\36\1\0\36\36\1\40\34\36"+
    "\2\0\1\40\60\0\1\112\45\0\1\45\36\0\1\46"+
    "\1\45\7\0\1\113\52\0\1\114\50\0\1\51\1\45"+
    "\27\0\1\115\13\0\1\55\36\0\1\57\45\0\1\116"+
    "\40\0\1\117\25\0\1\64\53\0\1\120\31\0\1\121"+
    "\37\0\1\122\34\0\1\116\7\0\1\123\50\0\1\71"+
    "\12\0\1\124\37\0\1\125\33\0\1\126\57\0\1\127"+
    "\22\0\1\130\34\0\1\131\36\0\1\132\3\0\1\133"+
    "\36\0\1\72\32\0\1\134\34\0\1\135\43\0\1\136"+
    "\36\0\1\137\37\0\1\140\34\0\1\141\34\0\1\142"+
    "\35\0\1\143\54\0\1\20\32\0\1\144\22\0\1\145"+
    "\42\0\1\146\37\0\1\147\45\0\1\150\24\0\1\151"+
    "\50\0\1\152\25\0\1\153\40\0\1\154\37\0\1\102"+
    "\36\0\1\155\42\0\1\156\27\0\1\157\40\0\1\160"+
    "\37\0\1\161\35\0\1\162\40\0\1\163\33\0\1\164"+
    "\35\0\1\165\35\0\1\166\46\0\1\167\27\0\1\170"+
    "\12\0\1\171\24\0\1\172\34\0\1\173\44\0\1\174"+
    "\32\0\1\175\53\0\1\176\33\0\1\177\24\0\1\200"+
    "\32\0\1\201\42\0\1\202\36\0\1\203\37\0\1\204"+
    "\43\0\1\205\26\0\1\206\37\0\1\207\42\0\1\210"+
    "\45\0\1\211\21\0\1\212\41\0\1\213\42\0\1\214"+
    "\33\0\1\215\40\0\1\216\41\0\1\217\31\0\1\72"+
    "\44\0\1\20\32\0\1\220\34\0\1\221\43\0\1\222"+
    "\41\0\1\223\33\0\1\224\36\0\1\225\46\0\1\226"+
    "\17\0\1\227\36\0\1\230\35\0\1\231\54\0\1\232"+
    "\26\0\1\233\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3844];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\2\0\1\1\11\0\1\1\1\11\15\0"+
    "\2\1\1\11\1\1\1\0\2\11\1\1\3\0\1\1"+
    "\1\0\1\11\1\1\1\11\1\1\1\11\2\0\1\11"+
    "\1\1\1\11\4\0\1\1\1\11\23\0\1\11\25\0"+
    "\1\11\5\0\1\11\7\0\1\11\7\0\4\11\7\0"+
    "\1\11\10\0\1\11\1\0\14\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    Parse file = new Parse();
    
    private static int m = 40;

    public static int getM(){
        return m;
    }

    public static void setM(int n){
        m = n;
    }

    public static void nextM(){
        m += 10;
    }
public static void decM(){
        m -= 10;
    }

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 88) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { yybegin(GOTO); return symbol(sym.GOTO);
          }
        case 35: break;
        case 22: 
          { return symbol(sym.GOFWD);
          }
        case 36: break;
        case 30: 
          { yybegin(FEDRAT); return symbol(sym.FEDRAT);
          }
        case 37: break;
        case 28: 
          { yybegin(SPINDL); return symbol(sym.SPINDL);
          }
        case 38: break;
        case 7: 
          { yybegin(CIRCLE);
          }
        case 39: break;
        case 21: 
          { yybegin(INTOL);  return symbol(sym.INTOL);
          }
        case 40: break;
        case 8: 
          { yybegin(LAST_POINT);
          }
        case 41: break;
        case 24: 
          { yybegin(TOOLNO); return symbol(sym.TOOLNO);
          }
        case 42: break;
        case 3: 
          { yybegin(YYINITIAL);
          }
        case 43: break;
        case 9: 
          { return symbol(sym.LPAREN);
          }
        case 44: break;
        case 33: 
          { yybegin(CUTCOM); return symbol(sym.CUTCOM);
          }
        case 45: break;
        case 32: 
          { yybegin(CUTTER); return symbol(sym.CUTTER);
          }
        case 46: break;
        case 12: 
          { yybegin(COMMENT);
          }
        case 47: break;
        case 26: 
          { yybegin(INDIRV); return symbol(sym.INDIRV);
          }
        case 48: break;
        case 5: 
          { return symbol(sym.COMMA);
          }
        case 49: break;
        case 14: 
          { return symbol(sym.NUMBER, new String("0"));
          }
        case 50: break;
        case 15: 
          { return symbol(sym.OFF);
          }
        case 51: break;
        case 23: 
          { yybegin(REWIND); return symbol(sym.REWIND);
          }
        case 52: break;
        case 31: 
          { yybegin(COOLNT); return symbol(sym.COOLNT);
          }
        case 53: break;
        case 20: 
          { return symbol(sym.TLON);
          }
        case 54: break;
        case 19: 
          { return symbol(sym.LINE);
          }
        case 55: break;
        case 10: 
          { yybegin(LINE);
          }
        case 56: break;
        case 17: 
          { return symbol(sym.TURN);
          }
        case 57: break;
        case 29: 
          { yybegin(SWITCH); return symbol(sym.SWITCH);
          }
        case 58: break;
        case 27: 
          { yybegin(LOADTL); return symbol(sym.LOADTL);
          }
        case 59: break;
        case 13: 
          { return symbol(sym.ON);
          }
        case 60: break;
        case 34: 
          { return symbol(sym.CIRCLE);
          }
        case 61: break;
        case 25: 
          { yybegin(OUTTOL); return symbol(sym.OUTTOL);
          }
        case 62: break;
        case 18: 
          { return symbol(sym.MMPR);
          }
        case 63: break;
        case 6: 
          { return symbol(sym.RPAREN);
          }
        case 64: break;
        case 11: 
          { return symbol(sym.NUMBER);
          }
        case 65: break;
        case 4: 
          { return symbol(sym.SLASH);
          }
        case 66: break;
        case 2: 
          { return symbol(sym.NUMBER, new String(yytext()));
          }
        case 67: break;
        case 1: 
          { 
          }
        case 68: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
