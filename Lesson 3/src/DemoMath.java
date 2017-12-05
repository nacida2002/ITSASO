
public class DemoMath {
    public static void main(String[] args) {
        String message = "Hello my dear world";
        System.out.println(message.startsWith("He"));
        System.out.println("4: " + message.contains("wo"));
        String csvRecord = "Jean-Michel;Depaepe;Prof;Informatique";
        String[] csvAttributes = csvRecord.split(";");
        System.out.println("Prenom: " + csvAttributes[0]);
        System.out.println("Nom: " + csvAttributes[1]);
        System.out.println("Métier: " + csvAttributes[2]);
        System.out.println("Domaine: " + csvAttributes[3]);
    }
    
}
