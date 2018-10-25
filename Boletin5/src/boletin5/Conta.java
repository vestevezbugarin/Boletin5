package boletin5;

public class Conta {

    private String nome;
    private String idConta;
    private double saldo;

    //Constructors
    public Conta() {
    }

    public Conta(String nome, String idConta, double saldo) {
        this.nome = nome;
        this.idConta = idConta;
        this.saldo = saldo;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Methods
    public void visualizar() {
        System.out.println("*************************************************************"
                + "\n*                     Detalles da conta                     *"
                + "\n*************************************************************"
                + "\n*"
                + "\n*  Nº de conta:  " + this.idConta
                + "\n*  Titular:      " + this.nome
                + "\n*  Saldo actual: " + this.saldo
                + "\n*"
                + "\n*************************************************************");
    }

    public boolean ingreso(float ingreso) {
        if (ingreso > 0) {
            saldo += ingreso;
            System.out.println("*************************************************************"
                    + "\n*O ingreso realizouse correctamente. Saldo actual: " + saldo + "  *"
                    + "\n*************************************************************");
            return true;
        } else {
            System.out.println("O ingreso non pode ser negativo ou igual a 0.");
        }
        return false;
    }

    public boolean reintegro(float extracto) {
        if (extracto > 0 && saldo >= extracto) {
            saldo -= extracto;
            System.out.println("*************************************************************"
                    + "\n*O reintegro realizouse correctamente. Saldo actual: " + saldo + "*"
                    + "\n*************************************************************");
            return true;
        } else {
            System.out.println("O saldo da conta é insuficiente ou non se pode retirar esta cantidade");
        }
        return false;
    }

    public boolean transferencia(Conta conta2, float transferido) {
        if (transferido > 0 && saldo >= transferido) {
            saldo -= transferido;
            conta2.setSaldo(conta2.getSaldo() + transferido);
            System.out.println("*************************************************************"
                    + "\n*Transferencia realizada correctamente. Saldo actual: " + saldo + "*"
                    + "\n*************************************************************");
            return true;
        } else {
            System.out.println("O saldo da conta é insuficiente ou non se pode tranferir esta cantidade");
        }
        return false;
    }
}
