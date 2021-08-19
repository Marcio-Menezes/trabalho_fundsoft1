/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author Marcio
 */
public class veiculo {
    String modelo;
    String tipo;
    String cor;
    int cod;
    int quant_porta;
    int quant_banco;
    double preco;
    boolean sistema_multimidia;
    boolean airbags;

    public veiculo(String modelo, String tipo, String cor, int cod, int quant_porta, int quant_banco, double preco, boolean sistema_multimidia, boolean airbags) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
        this.cod = cod;
        this.quant_porta = quant_porta;
        this.quant_banco = quant_banco;
        this.preco = preco;
        this.sistema_multimidia = sistema_multimidia;
        this.airbags = airbags;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQuant_porta() {
        return quant_porta;
    }

    public void setQuant_porta(int quant_porta) {
        this.quant_porta = quant_porta;
    }

    public int getQuant_banco() {
        return quant_banco;
    }

    public void setQuant_banco(int quant_banco) {
        this.quant_banco = quant_banco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isSistema_multimidia() {
        return sistema_multimidia;
    }

    public void setSistema_multimidia(boolean sistema_multimidia) {
        this.sistema_multimidia = sistema_multimidia;
    }

    public boolean isAirbags() {
        return airbags;
    }

    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }
    
    
    
}
