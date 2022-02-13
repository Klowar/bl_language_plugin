// This is a generated file. Not intended for manual editing.
package pro.doczilla.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static pro.doczilla.language.psi.BLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import pro.doczilla.language.psi.*;

public class BLPropertyImpl extends ASTWrapperPsiElement implements BLProperty {

  public BLPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BLVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BLVisitor) accept((BLVisitor)visitor);
    else super.accept(visitor);
  }

}
