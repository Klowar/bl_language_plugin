package pro.doczilla.language;

import com.intellij.lang.Language;

public class BLLanguage extends Language {

	public static final BLLanguage INSTANCE = new BLLanguage();

	private BLLanguage() {
		super("BL");
	}
}
