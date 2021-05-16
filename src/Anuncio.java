import java.util.Date;

public class Anuncio  {

    private String nome;
    private String cliente;
    private Date dataInicio , dataTermino;
    private Double investiventoPorDia;
    

    public Anuncio() {
        super();
    }
    
    
    
    public Anuncio(String nome, String cliente, Date dataInicio, Date dataTermino) {
        super();
     
 
}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public Date getDataInicio() {
		return dataInicio;
	}



	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}



	public Date getDataTermino() {
		return dataTermino;
	}



	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}



	public Double getInvestiventoPorDia() {
		return investiventoPorDia;
	}



	public void setInvestiventoPorDia(Double investiventoPorDia) {
		this.investiventoPorDia = investiventoPorDia;
	}
	
	
	
	
}