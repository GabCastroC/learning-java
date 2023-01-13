package GABank;

public class contaBanco{
    public String nomeUsuario;
    protected String tipoConta;
    private int numeroConta;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){
        this.setTipo(t);
    }
    public void fecharConta(){

    }
    public void depositar(){

    }
    public void sacar(){

    }
    public void pagarMensal(){

    }
    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;

    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}