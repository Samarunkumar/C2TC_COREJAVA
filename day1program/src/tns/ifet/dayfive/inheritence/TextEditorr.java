package tns.ifet.dayfive.inheritence;

public class TextEditorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word();

		word.write("Hello, ");
		word.formatText(true);
		word.write("World!");
		word.displayContent();

		word.spellCheck();

		System.out.println("Is text in Wordpad bold? " + word.isBold());
		System.out.println("Disabling spell check in Word.");
		word.enableSpellCheck(false);
		word.spellCheck();
	}
}
	}

}
