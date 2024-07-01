/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoloja;

/**
 *
 * @author aluno.ipora
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;


public class Pedido {
    
    private int id;
    private Cliente cliente;
    private List<Produto> produtos;
    private String status;
    private static int count = 1;
    
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Pedido() {
        
    }

    public Pedido(int id, Cliente cliente, List<Produto> produtos) {
        this.id = count++;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.status = "Em processamento";
    }
    
    public void adicionarItem(Produto produto) {
    this.produtos.add(produto);
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    
    public List<Produto> getProdutos(){
        return this.produtos;
    }
    public void setProdutos(List<Produto> produtos){
        this.produtos = produtos;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
}


