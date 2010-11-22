/* The following code was generated by JFlex 1.4.3 on 23.11.10 1:06 */

package net.intellij.plugins.soy.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import net.intellij.plugins.soy.SoyElementTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 23.11.10 1:06 from the specification file
 * <tt>soy.flex</tt>
 */
final class _SoyLexer implements FlexLexer {
/** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

/** lexical states */
  public static final int LOOKING_FOR_NAMESPACE_NAME = 8;
  public static final int STATE_IN_JAVA_DOC = 4;
  public static final int LOOKING_FOR_TEMPLATE_NAME = 10;
  public static final int YYINITIAL = 0;
  public static final int LOOKING_FOR_JAVA_DOC_PARAM = 6;
  public static final int STATE_IN_SCRIPTING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\17\1\0\1\10"+
    "\1\0\1\6\2\0\1\10\2\0\1\5\3\0\1\7\1\4\20\0"+
    "\1\12\32\7\4\0\1\7\1\0\1\14\1\7\1\24\1\35\1\22"+
    "\1\32\1\30\1\34\1\27\2\7\1\26\1\16\1\21\1\31\1\13"+
    "\1\7\1\15\1\23\1\25\1\36\1\7\1\33\1\7\1\37\1\7"+
    "\1\11\1\0\1\20\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\2\2\2\1\1\3\1\1\1\4\2\1"+
    "\1\5\11\1\3\6\1\7\1\10\1\11\1\12\2\0"+
    "\1\13\1\6\14\0\1\14\2\0\1\15\1\0\1\16"+
    "\1\6\4\0\1\14\10\0\1\14\5\0\1\14\25\0"+
    "\1\17\1\0\1\20\1\21";

  private static int [] zzUnpackAction() {
    int [] result = new int[101];
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
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\340"+
    "\0\300\0\u0100\0\u0120\0\300\0\u0140\0\u0160\0\u0180\0\u01a0"+
    "\0\300\0\u01c0\0\u01e0\0\u0200\0\u0220\0\u0240\0\u0260\0\u0280"+
    "\0\u02a0\0\u02c0\0\300\0\u02e0\0\u0300\0\140\0\u0320\0\300"+
    "\0\u0340\0\u0360\0\u0120\0\300\0\u0380\0\u03a0\0\u03c0\0\u03e0"+
    "\0\u0400\0\u0420\0\u0440\0\u0460\0\u0480\0\u04a0\0\u04c0\0\u04e0"+
    "\0\u0500\0\u0520\0\u0540\0\u0560\0\300\0\u0580\0\300\0\u05a0"+
    "\0\u05c0\0\u05e0\0\u0600\0\u0620\0\300\0\u0640\0\u0660\0\u0680"+
    "\0\u06a0\0\u06c0\0\u06e0\0\u0700\0\u0720\0\u0740\0\u0760\0\u0780"+
    "\0\u07a0\0\u07c0\0\u07e0\0\u0800\0\u0820\0\u0840\0\u0860\0\u0880"+
    "\0\u08a0\0\u08c0\0\u08e0\0\u0900\0\u0920\0\u0940\0\u0960\0\u0980"+
    "\0\u09a0\0\u09c0\0\u09e0\0\u0a00\0\u0a20\0\u0a40\0\u0a60\0\u0a80"+
    "\0\u0aa0\0\u0a60\0\u0ac0\0\300\0\300";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[101];
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
    "\1\7\1\10\2\11\1\12\3\7\1\13\1\14\5\7"+
    "\1\11\21\7\1\10\2\11\1\15\1\7\1\16\1\7"+
    "\1\13\2\7\1\17\2\7\1\20\1\11\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\2\7\1\31"+
    "\2\7\1\32\2\7\5\33\1\34\4\33\1\35\25\33"+
    "\17\36\1\0\20\36\17\37\1\7\1\40\17\37\17\41"+
    "\1\7\1\40\17\41\42\0\1\11\42\0\1\42\32\0"+
    "\10\43\1\44\27\43\4\0\1\45\1\46\41\0\1\16"+
    "\3\0\4\16\2\0\17\16\14\0\1\47\1\50\45\0"+
    "\1\51\30\0\1\52\14\0\1\53\34\0\1\54\44\0"+
    "\1\55\20\0\1\56\6\0\1\57\36\0\1\60\44\0"+
    "\1\61\42\0\1\62\36\0\1\63\30\0\1\64\21\0"+
    "\1\65\46\0\1\66\24\0\17\37\2\0\17\37\17\41"+
    "\2\0\17\41\5\0\1\67\32\0\1\45\1\70\1\33"+
    "\35\45\5\71\1\72\32\71\15\0\1\73\51\0\1\74"+
    "\40\0\1\75\25\0\1\76\46\0\1\75\35\0\1\77"+
    "\43\0\1\100\33\0\1\101\2\0\1\102\34\0\1\75"+
    "\32\0\1\103\46\0\1\104\34\0\1\105\32\0\1\106"+
    "\54\0\1\107\21\0\1\110\25\0\1\33\35\0\5\71"+
    "\1\111\32\71\4\0\1\33\1\72\46\0\1\112\44\0"+
    "\1\53\40\0\1\113\37\0\1\114\42\0\1\115\34\0"+
    "\1\75\43\0\1\75\24\0\1\116\46\0\1\117\33\0"+
    "\1\120\43\0\1\121\31\0\1\122\40\0\1\123\22\0"+
    "\4\71\1\33\1\111\32\71\16\0\1\75\44\0\1\124"+
    "\43\0\1\125\34\0\1\126\41\0\1\127\26\0\1\130"+
    "\35\0\1\131\40\0\1\115\61\0\1\132\15\0\1\133"+
    "\36\0\1\134\56\0\1\75\41\0\1\75\17\0\1\135"+
    "\37\0\1\102\50\0\1\136\40\0\1\53\27\0\1\137"+
    "\35\0\1\140\50\0\1\141\51\0\1\75\17\0\1\142"+
    "\44\0\1\143\35\0\1\144\37\0\1\145\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2784];
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
private static final char[] EMPTY_BUFFER = new char[0];
private static final int YYEOF = -1;
private static java.io.Reader zzReader = null; // Fake

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
    "\6\0\1\11\1\1\1\11\2\1\1\11\4\1\1\11"+
    "\11\1\1\11\4\1\1\11\1\1\2\0\1\11\1\1"+
    "\14\0\1\1\2\0\1\11\1\0\1\11\1\1\4\0"+
    "\1\11\10\0\1\1\5\0\1\1\25\0\1\1\1\0"+
    "\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[101];
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

/** the current state of the DFA */
private int zzState;

/** the current lexical state */
private int zzLexicalState = YYINITIAL;

/** this buffer contains the current text to be matched and is
    the source of the yytext() string */
private CharSequence zzBuffer = "";

/** this buffer may contains the current text array to be matched when it is cheap to acquire it */
private char[] zzBufferArray;

/** the textposition at the last accepting state */
private int zzMarkedPos;

/** the textposition at the last state to be included in yytext */
private int zzPushbackPos;

/** the current text position in the buffer */
private int zzCurrentPos;

/** startRead marks the beginning of the yytext() string in the buffer */
private int zzStartRead;

/** endRead marks the last character in the buffer, that has been read
    from input */
private int zzEndRead;

/**
 * zzAtBOL == true <=> the scanner is currently at the beginning of a line
 */
private boolean zzAtBOL = true;

/** zzAtEOF == true <=> the scanner is at the EOF */
private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  _SoyLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _SoyLexer(java.io.InputStream in) {
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
    while (i < 108) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

public final int getTokenStart(){
  return zzStartRead;
}

public final int getTokenEnd(){
  return getTokenStart() + yylength();
}

public void reset(CharSequence buffer, int start, int end,int initialState){
  zzBuffer = buffer;
  zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
  zzCurrentPos = zzMarkedPos = zzStartRead = start;
  zzPushbackPos = 0;
  zzAtEOF  = false;
  zzAtBOL = true;
  zzEndRead = end;
  yybegin(initialState);
}

// For Demetra compatibility
public void reset(CharSequence buffer, int initialState){
  zzBuffer = buffer;
  zzBufferArray = null;
  zzCurrentPos = zzMarkedPos = zzStartRead = 0;
  zzPushbackPos = 0;
  zzAtEOF = false;
  zzAtBOL = true;
  zzEndRead = buffer.length();
  yybegin(initialState);
}

/**
 * Refills the input buffer.
 *
 * @return      <code>false</code>, iff there was new input.
 *
 * @exception   java.io.IOException  if any I/O-Error occurs
 */
private boolean zzRefill() throws java.io.IOException {
  return true;
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
public final CharSequence yytext() {
  return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
  return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


/**
 * Resumes scanning until the next regular expression is matched,
 * the end of input is encountered or an I/O-Error occurs.
 *
 * @return      the next token
 * @exception   java.io.IOException  if any I/O-Error occurs
 */
  public IElementType advance() throws java.io.IOException {
  int zzInput;
  int zzAction;

  // cached fields:
  int zzCurrentPosL;
  int zzMarkedPosL;
  int zzEndReadL = zzEndRead;
  CharSequence zzBufferL = zzBuffer;
  char[] zzBufferArrayL = zzBufferArray;
  char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

  while (true) {
    zzMarkedPosL = zzMarkedPos;

    zzAction = -1;

    zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


    zzForAction: {
      while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
          { yybegin(LOOKING_FOR_TEMPLATE_NAME); return SoyElementTypes.KEYWORD;
          }
        case 18: break;
        case 12: 
          { return SoyElementTypes.KEYWORD;
          }
        case 19: break;
        case 14: 
          { yybegin(STATE_IN_JAVA_DOC); return SoyElementTypes.COMMENT;
          }
        case 20: break;
        case 3: 
          { yybegin(STATE_IN_SCRIPTING); return SoyElementTypes.START_SCRIPT;
          }
        case 21: break;
        case 10: 
          { return SoyElementTypes.TEMPLATE_NAME;
          }
        case 22: break;
        case 6: 
          { return SoyElementTypes.COMMENT;
          }
        case 23: break;
        case 8: 
          { return SoyElementTypes.NAMESPACE_NAME;
          }
        case 24: break;
        case 4: 
          { return SoyElementTypes.VARIABLE;
          }
        case 25: break;
        case 11: 
          { return SoyElementTypes.STRING;
          }
        case 26: break;
        case 13: 
          { yybegin(YYINITIAL); return SoyElementTypes.COMMENT;
          }
        case 27: break;
        case 7: 
          { yybegin(STATE_IN_JAVA_DOC);
    return SoyElementTypes.JAVA_DOC_PARAM;
          }
        case 28: break;
        case 5: 
          { yybegin(YYINITIAL); return SoyElementTypes.END_SCRIPT;
          }
        case 29: break;
        case 15: 
          { yybegin(LOOKING_FOR_JAVA_DOC_PARAM); return SoyElementTypes.COMMENT;
          }
        case 30: break;
        case 2: 
          { return SoyElementTypes.WHITE_SPACE;
          }
        case 31: break;
        case 9: 
          { yybegin(YYINITIAL);
          }
        case 32: break;
        case 1: 
          { return SoyElementTypes.BAD_CHARACTER;
          }
        case 33: break;
        case 17: 
          { yybegin(LOOKING_FOR_NAMESPACE_NAME); return SoyElementTypes.KEYWORD;
          }
        case 34: break;
      default:
        if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
          zzAtEOF = true;
            zzDoEOF();
            return null;
        }
        else {
            zzScanError(ZZ_NO_MATCH);
        }
    }
  }
}


}
