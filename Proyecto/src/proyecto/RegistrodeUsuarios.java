package proyecto;

import javax.swing.JOptionPane;
public class RegistrodeUsuarios {
  public void Registro(){
       byte opcion=0;


   do{
      opcion=Byte.parseByte(JOptionPane.showInputDialog(
     "          Menú de Usuarios  \n"
    + "1    Registrar un Usuario\n"
    + "2    Ver usuarios\n"
    + "3    Inactivar usuarios\n"
    + "4    Regresar al menu principal(Para salir)\n"
    + "Elija una opción"));
      switch(opcion){
         case 1:
            RegistrodeUsuarios usuario01=new RegistrodeUsuarios();
            usuario01.datosUsuario();
            break;
         case 2:
             JOptionPane.showMessageDialog(null, "Aqui va Ver Usuarios");;
            break;
         case 3:
             JOptionPane.showMessageDialog(null, "Aqui va Inactivar usuarios");;
            break;
         case 4:
             opcion=4;
             break;
         default:
            JOptionPane.showMessageDialog(null, "Opción no valida");
            break;  
      }
   }while(opcion!=4); 
    }
    private String nombre;
    private String apellidos;
    private String nickname;
    private String contraseña;
  public void datosUsuario(){
        nombre=JOptionPane.showInputDialog(null, "Digite su nombre: ");
        apellidos=JOptionPane.showInputDialog(null, "Digite su apellidos: ");
        nickname=JOptionPane.showInputDialog(null, "Digite un nickname: ");
        nickname=JOptionPane.showInputDialog(null, "Digite su contraseña: ");
        JOptionPane.showMessageDialog(null, "Usuario registrado");
    }
  
}
