public class HardcodedPassword {
    public static void main(String[] args) {
        // ❌ Vulnerable: contraseña escrita directamente en el código
        String password = "SuperSecret123!";
        System.out.println("Usando contraseña: " + password);
    }
}
