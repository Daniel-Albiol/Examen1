public class Password {
    private int longitud = 8;
    private String contrasenya;

    // Constructores

    public String Password() {

        longitud = 8;
        return contrasenya = generarPassword();
        // Math.abs(longitud);
    }

    public String Password (int l){
        String pass = "";
        pass = generarPassword();
        return pass;
    }
    // Métodos

    public Boolean esFuerte(String frase){

        boolean fuerte;
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        char c;
        char MAYUSCULAS[] = new char{"ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
        int NUMEROS []= new int{"0123456789"};
        char MINUSCULAS []= new char {"abcdefghijklmnopqrstuvwxyz"};

        for (int i = 1; i < frase.length(); i++){
            c = frase.charAt(i);
            if (c == MAYUSCULAS [i] ){
                mayusculas += 1;

            }
            if (c == MINUSCULAS[] [i] ){
                minusculas += 1;

            }
            if (c == NUMEROS [i] ){
                numeros += 1;

            }
        }
        if (mayusculas > 2 && minusculas > 1 && numeros > 5){
            fuerte = true;
        }
        else {
            fuerte = false;
    }
        return fuerte;
    }

    public String generarPassword() {
        char MAYUSCULAS[] = new char["ABCDEFGHIJKLMNOPQRSTUVWXYZ"];
        int NUMEROS []= new int["0123456789"]
        char MINUSCULAS []= new char ["abcdefghijklmnopqrstuvwxyz"];


        return generarPassword(getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS){
           
        }


        public static String getPassword(String key, int length) {
            String pswd = "";

            for (int i = 0; i < length; i++) {
                pswd+=(key.charAt((int)(Math.random() * key.length())));
            }

            return pswd;
        }
    }

    public Password() {
        contrasenya = "";
    }
    public int getLongitud() {
        return longitud;
    }
    public String getContrasenya() {
        return contrasenya;
    }
    public void setLongitud(int longitud){
        longitud = longitud;
    }

}

