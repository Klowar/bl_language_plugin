package pro.doczilla.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import pro.doczilla.language.BLFileType;
import pro.doczilla.language.BLLanguage;
import org.jetbrains.annotations.NotNull;

public class BLFile extends PsiFileBase {

	public BLFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, BLLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return BLFileType.INSTANCE;
	}

	@Override
	public String toString() {
		return "BL File";
	}

}
