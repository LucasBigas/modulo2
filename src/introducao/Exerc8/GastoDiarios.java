package introducao.Exerc8;

import java.util.Date;

public class GastoDiarios {
    
    private String tipoGasto;
    private Date dataGasto;
    private float valorGasto;
    private String formasPagamento;
    
    public String getTipoGasto() {
        return tipoGasto;
    }
    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }
    public Date getDataGasto() {
        return dataGasto;
    }
    public void setDataGasto(Date dataGasto) {
        this.dataGasto = dataGasto;
    }
    public float getValorGasto() {
        return valorGasto;
    }
    public void setValorGasto(float valorGasto) {
        this.valorGasto = valorGasto;
    }
    public String getFormasPagamento() {
        return formasPagamento;
    }
    public void setFormasPagamento(String formasPagamento) {
        this.formasPagamento = formasPagamento;
    }

    
}
