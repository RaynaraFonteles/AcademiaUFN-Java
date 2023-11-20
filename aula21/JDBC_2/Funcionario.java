/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introducaojdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luanv
 */
public class Funcionario {
    
    private final DB Database = new DB();
    
    private final Integer id;
    private String nome;
    private String cargo;
    private Integer departamento_id;
    private Integer salario;
    
    public Funcionario(Integer id){
        this.id = id;
        this.nome = this.getNome();
        this.cargo = this.getCargo();
        this.departamento_id = this.getDepartamentoId();
        this.salario = this.getSalario();
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public String getNome(){
        String SQL = "SELECT nome FROM funcionarios WHERE id = " + this.getId();
        String nome = "";
        
        try (Connection conn = this.Database.connect(true);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            nome = rs.getString(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return nome;
    }
    
    public void setNome(String nome){
        System.out.println("\n*** Alterando Nome do Funcionário ***");
        String SQL = "UPDATE funcionarios SET nome = '" + nome + "' WHERE id = " + this.getId();
        try (Connection conn = this.Database.connect(true);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        this.nome = nome;
    }
    
    public String getCargo(){
        String SQL = "SELECT cargo FROM funcionarios WHERE id = " + this.getId();
        String cargo = "";
        
        try (Connection conn = this.Database.connect(true);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            cargo = rs.getString(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return cargo;
    }
    
    public void setCargo(String cargo){
        /* IMPLEMENTAR */
    }
    
    public Integer getSalario(){
        String SQL = "SELECT salario FROM funcionarios WHERE id = " + this.getId();
        Integer salario = 0;
        
        try (Connection conn = this.Database.connect(true);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            salario = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return salario;
    }
    
    public void setSalario(Integer salario){
        /* IMPLEMENTAR */
    }
    
    /* DEPTO */
    public Integer getDepartamentoId(){
        String SQL = "SELECT departamento_id FROM funcionarios WHERE id = " + this.getId();
        Integer departamento_id = 0;
        
        try (Connection conn = this.Database.connect(true);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            departamento_id = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return departamento_id;
    }
    
    public String getDepartamentoNome(){
        String SQL = "SELECT nome FROM departamentos WHERE id = " + this.getDepartamentoId();
        String nome = "";
        
        try (Connection conn = this.Database.connect(true);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            nome = rs.getString(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return nome;
    }
    
    public void setDepartamento(Integer departamento_id){
        /* IMPLEMENTAR */
    }
    
}
