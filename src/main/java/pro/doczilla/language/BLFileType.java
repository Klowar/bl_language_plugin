package pro.doczilla.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BLFileType extends LanguageFileType {

	public static final BLFileType INSTANCE = new BLFileType();

	private BLFileType() {
		super(BLLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "BL File";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "BL language file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "bl";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return BLIcons.FILE;
	}

}
