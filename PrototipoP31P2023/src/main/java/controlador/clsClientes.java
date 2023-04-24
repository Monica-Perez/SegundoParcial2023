/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.daoClientes;

/**
 *
 * @author Usuario
 */
public class clsClientes {

    private int IdCliente;
    private String NombreCliente;
    private String NitCliente;
    private String DebeCliente;
    private String HaberCliente;

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public void setNitCliente(String NitCliente) {
        this.NitCliente = NitCliente;
    }

    public void setDebeCliente(String DebeCliente) {
        this.DebeCliente = DebeCliente;
    }

    public void setHaberCliente(String HaberCliente) {
        this.HaberCliente = HaberCliente;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public String getNitCliente() {
        return NitCliente;
    }

    public String getDebeCliente() {
        return DebeCliente;
    }

    public String getHaberCliente() {
        return HaberCliente;
    }

    public clsClientes(int IdCliente, String NombreCliente, String NitCliente, String DebeCliente, String HaberCliente) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.NitCliente = NitCliente;
        this.DebeCliente = DebeCliente;
        this.HaberCliente = HaberCliente;
    }

    public clsClientes(int IdCliente, String NombreCliente, String NitCliente, String DebeCliente) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.NitCliente = NitCliente;
        this.DebeCliente = DebeCliente;
    }

    public clsClientes(int IdCliente, String NombreCliente, String NitCliente) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.NitCliente = NitCliente;
    }

    public clsClientes(int IdCliente, String NombreCliente) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
    }

    public clsClientes(int IdCliente) {
        this.IdCliente = IdCliente;
    }
    
    public clsClientes() {
    }
    
    //Metodos de acceso a la capa controlador
    public clsClientes getBuscarInformacionAplicacionPorNombre(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.consultaAplicacionPorNombre(aplicacion);
    }
    public clsClientes getBuscarInformacionAplicacionPorId(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.consultaAplicacionPorId(aplicacion);
    }    
    public List<clsClientes> getListadoAplicaciones()
    {
        daoClientes daoAplicacion = new daoClientes();
        List<clsClientes> listadoUsuarios = daoAplicacion.consultaAplicacion();
        return listadoUsuarios;
    }
    public int setBorrarAplicacion(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.borrarAplicacion(aplicacion);
    }          
    public int setIngresarAplicacion(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.ingresaAplicacion(aplicacion);
    }              
    public int setModificarAplicacion(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.actualizaAplicacion(aplicacion);
    }              

}
