package tns.ifet.dayfive.inheritence;

public class Notepad {
	 protected String content;

	    public Notepad() {
	        this.content = "";
	    }

	    public void write(String text) {
	        content += text;
	    }

	    public void displayContent() {
	        System.out.println("Notepad Content: " + content);
	    }
	}
	