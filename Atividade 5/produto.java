public class produto {

    private int id;
    private String descricao;
    private float preco;
    private int quant; 
    private int cont; 
  
    public produto(){
        super();
    }
  
    public produto(String descricao, float preco, int quant)
    {
        super();
        this.descricao = descricao;
        this.preco = preco;
        this.quant = quant;
    }
  
    public int getld(){
        return id;
    }
    public int getCont(){
        return cont;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public void setQuant(int quant){
        this.quant = quant;
    }
    public boolean emEstoque(){
        return quant > 0;
    }
}