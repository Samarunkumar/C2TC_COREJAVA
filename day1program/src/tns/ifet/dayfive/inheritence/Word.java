package tns.ifet.dayfive.inheritence;

public record Word() {
	public static void main(String[] args) {
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

	private void enableSpellCheck(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private String isBold() {
		// TODO Auto-generated method stub
		return null;
	}

	private void spellCheck() {
		// TODO Auto-generated method stub
		
	}

	private void displayContent() {
		// TODO Auto-generated method stub
		
	}

	private void formatText(boolean b) {
		// TODO Auto-generated method stub
		
	}

	void write(String string) {
		// TODO Auto-generated method stub
		
	}
}

