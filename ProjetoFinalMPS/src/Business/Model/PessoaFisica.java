package Business.Model;

/**
 *
 * @author Carlinhos
 */
public class PessoaFisica {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String email;
    private boolean cadastro;

    public PessoaFisica() {
        this.cadastro = false;
    }

    public PessoaFisica(String n, String c, String d, String e, String t, String em) {
        this.nome = n;
        this.cpf = c;
        this.dataNascimento = d;
        this.endereco = e;
        this.telefone = t;
        this.email = em;
        this.cadastro = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return nome + ", " + cpf + ", " + dataNascimento + ", " + endereco + ", "
                + telefone + ", " + email;
    }

}
