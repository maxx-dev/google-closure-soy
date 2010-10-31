package net.intellij.plugins.soy.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import net.intellij.plugins.soy.SoyElementTypes;

%%

%class _SoyLexer
%implements FlexLexer
%final
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
InputCharacter = [^\r\n]

Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/*" "*"+ [^/*] ~"*/"

Variable   = "$" [\._a-zA-Z]*
String     = [\"\'] [^\"\']* [\"\']

%%

<YYINITIAL> {

    // Keywords

    "template"                { return SoyElementTypes.KEYWORD; }
    "literal"                 { return SoyElementTypes.KEYWORD; }
    "print"                   { return SoyElementTypes.KEYWORD; }
    "msg"                     { return SoyElementTypes.KEYWORD; }
    "if"                      { return SoyElementTypes.KEYWORD; }
    "elseif"                  { return SoyElementTypes.KEYWORD; }
    "else"                    { return SoyElementTypes.KEYWORD; }
    "if"                      { return SoyElementTypes.KEYWORD; }
    "switch"                  { return SoyElementTypes.KEYWORD; }
    "case"                    { return SoyElementTypes.KEYWORD; }
    "default"                 { return SoyElementTypes.KEYWORD; }
    "foreach"                 { return SoyElementTypes.KEYWORD; }
    "ifempty"                 { return SoyElementTypes.KEYWORD; }
    "for"                     { return SoyElementTypes.KEYWORD; }
    "call"                    { return SoyElementTypes.KEYWORD; }
    "param"                   { return SoyElementTypes.KEYWORD; }
    "css"                     { return SoyElementTypes.KEYWORD; }
    "namespace"               { return SoyElementTypes.KEYWORD; }

    // Other

    "{"                       { return SoyElementTypes.LBRACE; }
    "}"                       { return SoyElementTypes.RBRACE; }
    .                         { return SoyElementTypes.BAD_CHARACTER; }
    {WhiteSpace}              { return SoyElementTypes.WHITE_SPACE; }
    {Comment}                 { return SoyElementTypes.COMMENT; }
    {Variable}                { return SoyElementTypes.VARIABLE; }
    {String}                  { return SoyElementTypes.STRING; }

}
