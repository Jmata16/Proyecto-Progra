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
    + "4    Regresar al menu principal\n"
    + "Elija una opción"));
      switch(opcion){
         case 1:
            RegistrodeUsuarios usuario01=new RegistrodeUsuarios();
            usuario01.datosUsuario();
            break;
         case 2:
            RegistrodeUsuarios usuario02=new RegistrodeUsuarios();
             usuario02.verUsuario();
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
//datos
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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setnickname(String nickname) {
        this.nickname = nickname;
    }   
    public void setcontraseña(String contraseña) {
        this.contraseña = contraseña;
    }          
//sistema de registro de usuarios   
  public void datosUsuario(){
        nombre=JOptionPane.showInputDialog(null, "Digite su nombre: ");
        apellidos=JOptionPane.showInputDialog(null, "Digite su apellidos: ");
        contraseña=JOptionPane.showInputDialog(null, "Digite un nickname: ");
        nickname=JOptionPane.showInputDialog(null, "Digite su contraseña: ");
        JOptionPane.showMessageDialog(null, "El Usuario de "+nombre+" "+ apellidos
                +" ha sido registrado bajo el nombre de usuario:"+nickname);
    }
//sistema de vista de usuarios
   public void verUsuario(){
       JOptionPane.showMessageDialog(null, "Pronto el sistema para ver los usuarios registrados ");
    }
   
 //sistema de inactivar usuarios 
   public void inactivarUsuarios(){
       JOptionPane.showMessageDialog(null, "Pronto el sistema de inactivar usuarios:");
    }  
   
}