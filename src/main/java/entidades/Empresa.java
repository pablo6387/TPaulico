
package entidades;

import entidades.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Empresa {
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        empleados = new ArrayList<>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void agregarEmpleados(Empleado e){
        empleados.add(e);
    }
    
    public void mostrarEmpleados(){
        String nombres = "";
        for (Empleado e: empleados){
            nombres = nombres.concat(e.getNombreApellido() + '\n');
            
        }
        JOptionPane.showMessageDialog(null,nombres);
    }
    
}
