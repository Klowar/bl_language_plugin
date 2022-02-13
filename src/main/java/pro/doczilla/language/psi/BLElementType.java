package pro.doczilla.language.psi;

import com.intellij.psi.tree.IElementType;
import pro.doczilla.language.BLLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BLElementType extends IElementType {

	public BLElementType(@NotNull @NonNls String debugName) {
		super(debugName, BLLanguage.INSTANCE);
	}

}
