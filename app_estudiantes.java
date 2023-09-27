import javax.swing.JOptionPane;

public class app_estudiantes {
    static cls_estudiantes [] estudiantes = new cls_estudiantes[7]; //creación del vector de objetos

    static int int_posiciones = 0;

    public static void main(String[] args){
        fnt_menu(true);
    }

    private static void fnt_registrar(){
            String id = JOptionPane.showInputDialog(null,"Identificación");
            String nombre = JOptionPane.showInputDialog(null,"Nombre");
            String contacto = JOptionPane.showInputDialog(null,"Contacto");
            String correo = JOptionPane.showInputDialog(null,"Correo");
            String edad = JOptionPane.showInputDialog(null,"Edad");


            estudiantes[int_posiciones] = new cls_estudiantes(id, nombre, contacto, correo, edad);
            int_posiciones += 1;
            JOptionPane.showMessageDialog(null, "Registrado con éxito",
            "Registrar",JOptionPane.INFORMATION_MESSAGE);
        } 

    private static void fnt_menu(boolean menu){
        while(menu == true){
            int m = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<<< MENU PRINCIPAL >>>\n" +
            "1. Registrar\n"+
            "2. Salir" 
            ));

            if (m == 1){
                fnt_registrar();
            }
            if (m == 2){
                System.exit(0);
            }
        }
    }
}
