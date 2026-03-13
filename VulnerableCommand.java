public class VulnerableCommand {
    public static void main(String[] args) throws Exception {
        String userInput = "calc.exe"; // un atacante podría poner cualquier comando
        // ❌ Vulnerable: ejecución directa de entrada externa
        Runtime.getRuntime().exec(userInput);
    }
}
