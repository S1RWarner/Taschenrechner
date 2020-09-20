import java.util.Scanner;

/**
 * Ein simpler Taschenrechner
 * @author Okke
 * @version 15
 */
public class Taschenrechner {
    public static void main(String[] args){
        System.out.println("Willkommen zu unserem tollen Rechner");
        System.out.println("____________________________________");
        System.out.println("Bitte beachten Sie, dass das Programm die Operationen in Zweierblöcken berechnet");
        System.out.println("2+2*2 würde somit als (2+2)*2 gerechnet werden.");
        System.out.println();
        System.out.println("Updates sind in Bearbeitung");
        System.out.println();
        System.out.println("Wollen sie dennoch fortfahren");
        disclaimer();
    }


    public static void disclaimer(){

        Scanner entscheidung = new Scanner(System.in);
        String jaNein = entscheidung.nextLine();
        switch (jaNein){
            case "ja":
            case "Ja":
                //Zu der Funktion von der es weiter geht
                whichCalculation();
                break;
            case "nein":
            case "Nein":
                System.out.println("Okay, schönen Tag noch.");
                System.exit(0);
                break;
            default:
                System.out.println("Mögliche Eingaben wären ja, Ja, nein und Nein." +
                        "Versuch's nochmal");
                disclaimer();

        }
    }

    public static void whichCalculation() {
        //Auswahlmenü der verschiedenen Operationen
        System.out.println("Gute entscheidung");
        System.out.println("Diese Rechnungen sind möglich:");
        System.out.println("1. Simple + - * / rechnungen");
        System.out.println("2. Quadratwurzel ziehen");
        System.out.println("3. Die Fakultät einer bestimmten Zahl berechnen");
        System.out.println("4. Den Prozentsatz einer Zahl berechnen");
        System.out.println("5. Den Bruch aus zwei Zahlen rechnen");
        System.out.println("6. Die Potenz von einer Zahl berechnen");
        System.out.println("7. Modulo einer Zahl");


        basicCalc();
        quadratWurzel();
        fakultaet();
        prozent();
        brueche();
        potenz();
        modulo();
    }

    public static void basicCalc(){
        System.out.println("Bitte geben sie die erste Zahl für die Rechnung ein");
        Scanner ersteZahl = new Scanner(System.in);
        double a = ersteZahl.nextDouble();

        System.out.println("Bitte geben sie die ersten Rechenoperator ein.");
        Scanner operator = new Scanner(System.in);
        String sign = operator.nextLine();

        System.out.println("Bitte geben sie die erste Zahl für die Rechnung ein");
        Scanner zweiteZahl = new Scanner(System.in);
        double b = ersteZahl.nextDouble();
        //Anzeigen der Rechnung

        doBasicCalc(a, b, sign);

    }

    public static void doBasicCalc(double a, double b, String sign) {
        System.out.print(a + sign + b);
        switch (sign) {
            case "*":

            case "/":

            case "+":

            case "-":

            default:

        }
    }

    public static void modulo() {
    }

    public static void potenz() {
    }

    public static void brueche() {
    }

    public static void prozent() {
    }

    public static void fakultaet() {
    }

    public static void quadratWurzel() {
    }
}