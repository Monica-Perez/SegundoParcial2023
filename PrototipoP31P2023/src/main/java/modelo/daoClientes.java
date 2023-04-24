/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import controlador.clsClientes;

/**
 *
 * @author Usuario
 */
public class daoClientes {
    private static final String SQL_SELECT = "SELECT clId, clNombre, clNit, clDebe, clHaber FROM tbl_Clientes ";
    private static final String SQL_INSERT = "INSERT INTO tbl_Clientes(clNombre, clNit, clDebe, clHaber) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_Clientes SET clNombre=?, clNit=?, clDebe=?, clHaber=? WHERE clId = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_Clientes WHERE clId=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT clId, clNombre, clNit, clDebe, clHaber FROM tbl_Clientes WHERE clNombre = ?";
    private static final String SQL_SELECT_ID = "SELECT clId, clNombre, clNit, clDebe, clHaber FROM tbl_Clientes WHERE clId = ?";    

    public List<clsClientes> consultaAplicacion() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsClientes> aplicaciones = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("clId");
                String nombre = rs.getString("clNombre");
                String nit = rs.getString("clNit");
                String debe = rs.getString("clDebe");
                String haber = rs.getString("clHaber");
                clsClientes aplicacion = new clsClientes();
                aplicacion.setIdCliente(id);
                aplicacion.setNombreCliente(nombre);
                aplicacion.setNitCliente(nit);
                aplicacion.setDebeCliente(debe);
                aplicacion.setHaberCliente(haber);
                aplicaciones.add(aplicacion);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return aplicaciones;
    }

    public int ingresaAplicacion(clsClientes aplicacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, aplicacion.getNombreCliente());
            stmt.setString(2, aplicacion.getNitCliente());
            stmt.setString(3, aplicacion.getDebeCliente());
            stmt.setString(4, aplicacion.getHaberCliente());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int actualizaAplicacion(clsClientes aplicacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, aplicacion.getNombreCliente());
            stmt.setString(2, aplicacion.getNitCliente());
            stmt.setString(3, aplicacion.getDebeCliente());
            stmt.setString(4, aplicacion.getHaberCliente());
            stmt.setInt(5, aplicacion.getIdCliente());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int borrarAplicacion(clsClientes aplicacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, aplicacion.getIdCliente());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public clsClientes consultaAplicacionPorNombre(clsClientes aplicacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + aplicacion);
            stmt = conn.prepareStatement(SQL_SELECT_NOMBRE);
            //stmt.setInt(1, aplicacion.getIdAplicacion());            
            stmt.setString(1, aplicacion.getNombreCliente());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("clId");
                String nombre = rs.getString("clNombre");
                String nit = rs.getString("clNit");
                String debe = rs.getString("clDebe");
                String haber = rs.getString("clHaber");

                //aplicacion = new clsAplicacion();
                aplicacion.setIdCliente(id);
                aplicacion.setNombreCliente(nombre);
                aplicacion.setNitCliente(nit);
                aplicacion.setDebeCliente(debe);
                aplicacion.setHaberCliente(haber);
                System.out.println(" registro consultado: " + aplicacion);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return aplicacion;
    }
    public clsClientes consultaAplicacionPorId(clsClientes aplicacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + aplicacion);
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, aplicacion.getIdCliente());            
            //stmt.setString(1, aplicacion.getNombreAplicacion());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("clId");
                String nombre = rs.getString("clNombre");
                String nit = rs.getString("clNit");
                String debe = rs.getString("clDebe");
                String haber = rs.getString("clHaber");

                //aplicacion = new clsAplicacion();
                aplicacion.setIdCliente(id);
                aplicacion.setNombreCliente(nombre);
                aplicacion.setNitCliente(nit);
                aplicacion.setDebeCliente(debe);
                aplicacion.setHaberCliente(haber);
                System.out.println(" registro consultado: " + aplicacion);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return aplicacion;
    }    

}
