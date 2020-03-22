package projetoed;

public class No implements Cloneable {
	private int conteudo;
	private No prox;
	
	public No(){
		setProx(null);
	}

	public int getConteudo() {
		return conteudo;
	}

	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
        
        @Override
    public No clone() throws CloneNotSupportedException {
        return (No) super.clone();
    }
}
