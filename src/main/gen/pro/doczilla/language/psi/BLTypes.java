// This is a generated file. Not intended for manual editing.
package pro.doczilla.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import pro.doczilla.language.psi.impl.*;

public interface BLTypes {

  IElementType PROPERTY = new BLElementType("PROPERTY");

  IElementType COMMENT = new BLTokenType("COMMENT");
  IElementType CRLF = new BLTokenType("CRLF");
  IElementType KEY = new BLTokenType("KEY");
  IElementType SEPARATOR = new BLTokenType("SEPARATOR");
  IElementType VALUE = new BLTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new BLPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
