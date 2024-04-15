/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 4 & 5
Intellij IDEA*/

package tampilan_ui.output;

public class Label {
    private final int width;
    public String text;

    public Label(String text, int width){
        this.width = width;
        this.text = text;
    }

    public void draw(){
        int spaceBeforeText = (width - text.length() - 2) / 2;
        int spaceAfterText = width - text.length() - 2 - spaceBeforeText;
        System.out.println("|" + " ".repeat(spaceBeforeText) + text + " ".repeat(spaceAfterText) + "|");
    }

}

