package net.intellij.plugins.soy;

import com.intellij.lang.Language;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;

public interface SoyElementTypes {

    IFileElementType FILE = new IFileElementType(Language.findInstance(SoyLanguage.class));

    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

    IElementType KEYWORD = new SoyElementType("KEYWORD");

    IElementType COMMENT = new SoyElementType("COMMENT");

    IElementType VARIABLE = new SoyElementType("VARIABLE");
    IElementType LBRACE = new SoyElementType("LBRACE");
    IElementType RBRACE = new SoyElementType("RBRACE");
    IElementType STRING = new SoyElementType("STRING");

    IElementType FUNCTION_KEYWORD = new SoyElementType("FUNCTION_KEYWORD");

    TokenSet WHITE_SPACES = TokenSet.create(
            WHITE_SPACE
    );

    TokenSet COMMENTS = TokenSet.create(
            COMMENT
    );

    TokenSet BRACES = TokenSet.create(
            LBRACE, RBRACE
    );
}
