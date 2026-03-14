public class HardcodedPassword {
    public static void main(String[] args) {
        // ✅ Seguro: la contraseña se obtiene de una variable de entorno
        String password = System.getenv("APP_PASSWORD");

        if (password == null) {
            System.err.println("Error: la variable de entorno APP_PASSWORD no está definida.");
            return;
        }

        System.out.println("Usando contraseña desde entorno.");
        // Aquí podrías usar la contraseña para conectarte a un servicio
    }
}

