/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 4 & 5
Intellij IDEA*/

package tampilan_ui.output;

public class HLine {
    private int width;   //(-)

    public HLine(int width){
        this.width = width;
    }

    public void draw(){
        System.out.println("+" + "=".repeat(width - 2) + "+");
    }

}

