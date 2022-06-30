package proyecto;

import javax.swing.JOptionPane;
public class RegistrodeUsuarios {
    //variables
    private String nombre;
    private String apellidos;
    private String nickname;
    private String contraseña;
    public RegistrodeUsuarios(){
        this.nombre="";
        this.apellidos="";
        this.nickname="";
        this.contraseña="";
    } 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
  public void menuUsuarios(){
       byte opcion=0;
   do{
      opcion=Byte.parseByte(JOptionPane.showInputDialog(
     "          Menú de Usuarios  \n"
    + "1    Registrar un Usuario\n"
    + "2    Ver usuarios\n"
    + "3    Inactivar usuarios\n"
    + "4    Regresar al menu principal\n"
    + "Elija una opción"));
      switch(opcion){
         case 1:
            //sistema de registro de usuarios 
            nombre=JOptionPane.showInputDialog(null, "Digite su nombre: ");
            apellidos=JOptionPane.showInputDialog(null, "Digite su apellidos: ");
            nickname=JOptionPane.showInputDialog(null, "Digite un nickname: ");
            contraseña=JOptionPane.showInputDialog(null, "Digite su contraseña: ");
            JOptionPane.showMessageDialog(null, "El Usuario de "+nombre+" "+ apellidos
                +" ha sido registrado bajo el nombre de usuario: "+nickname);             
            break;
         case 2: 
             //sistema de vista de usuarios
            JOptionPane.showMessageDialog(null, "Nombre: "+nombre+" Apellidos: "+ apellidos
                +" nombre de usuario: "+nickname);
            break;
         case 3:
              //sistema de inactivar usuarios 
             JOptionPane.showMessageDialog(null, "Pronto el sistema de inactivar usuarios:");
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
}