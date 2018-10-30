package boletin5;

/**
 *
 * @author vestevezbugarin
 * @version 1.0 
 * @since 1.0
 */
public class Conta {

    private String nome;
    private String idConta;
    private double saldo;

    //Constructors

    /**
     * void constructor without params
     */
    public Conta() {
    }

    /**
     *
     * @param nome the acount owner name
     * @param idConta the identificator of the acount
     * @param saldo the actual acount balance
     */
    public Conta(String nome, String idConta, double saldo) {
        this.nome = nome;
        this.idConta = idConta;
        this.saldo = saldo;
    }

    //Getters & Setters

    /**
     *
     * @return the name field, reference the name of the acount owner
     */
    public String getNome() {
        return nome;
    }

    /**
     * set the name field
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return the identificator field, reference the unique account identification
     */
    public String getIdConta() {
        return idConta;
    }

    /**
     * set the acount  identificator
     * @param idConta
     */
    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    /**
     *
     * @return the balace field, refernce the actual balence in the acount
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * set the balance field
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Methods

    /**
     * visualize the acount details, params not needed
     */
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

    /**
     *
     * @param ingreso
     * @return if the operation has been done successfully ( in this case a deposit)
     */
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

    /**
     *
     * @param extracto
     * @return if the operation has been done successfully ( in this case a refund)
     */
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

    /**
     *
     * @param conta2
     * @param transferido
     * @return if the operation has been done successfully ( in this case a tranference)
     */
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
