public class SecureCommand {
    public static void main(String[] args) throws Exception {
        // ✅ Seguro: solo se permite ejecutar comandos predefinidos
        String userInput = "calc"; // simulación de entrada

        // Lista blanca de comandos permitidos
        if ("calc".equals(userInput)) {
            Runtime.getRuntime().exec("calc.exe");
        } else if ("notepad".equals(userInput)) {
            Runtime.getRuntime().exec("notepad.exe");
        } else {
            System.err.println("Comando no permitido: " + userInput);
        }
    }
}
