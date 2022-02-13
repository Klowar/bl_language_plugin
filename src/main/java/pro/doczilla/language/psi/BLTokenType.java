package pro.doczilla.language.psi;

import com.intellij.psi.tree.IElementType;
import pro.doczilla.language.BLLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BLTokenType extends IElementType {

	public BLTokenType(@NotNull @NonNls String debugName) {
		super(debugName, BLLanguage.INSTANCE);
	}

	@Override
	public String toString() {
		return "BLTokenType." + super.toString();
	}

}
