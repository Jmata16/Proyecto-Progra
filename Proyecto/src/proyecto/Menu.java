/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;
public class Menu {
    public void Menu(){
     
   byte opcion=0;


   do{
      opcion=Byte.parseByte(JOptionPane.showInputDialog(
     "          Menú Principal  \n"
    + "1    Registro de Usuarios\n"
    + "2    Catálogos\n"
    + "3    Facturación\n"
    + "4    Cajas\n"
    + "5    Salir\n"
    + "Elija una opción"));
      switch(opcion){
         case 1:
            RegistrodeUsuarios registro01=new RegistrodeUsuarios();
            registro01.Registro();
            break;
         case 2:
            Catalogo catalog01=new Catalogo();
            catalog01.catalog();
            break;
         case 3:
            Facturacion Factura01=new Facturacion();
            Factura01.Factura();
            break;
         case 4:
            Cajas Caja01=new Cajas();
            Caja01.Caja();
            break;
         case 5:
            opcion=5;
            break;
         default:
            JOptionPane.showMessageDialog(null, "Opción no valida");
            break;
            
      }
      
   }while(opcion!=5);   
   System.exit(0);
   
   }
}
