package pro.doczilla.language;

import com.intellij.lexer.FlexAdapter;

public class BLLexerAdapter extends FlexAdapter {

	public BLLexerAdapter() {
		super(new BLLexer(null));
	}

}
