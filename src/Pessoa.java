public class Pessoa {

    public String nome;
    public double peso;
    public double altura;
    public String dataNascimento;

    public Pessoa(String nome, double peso, double altura, String dataNascimento) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }

    public double imc() {
        return peso / (altura * altura);
    }

    public String imcTexto() {
        double imc = this.imc();
        boolean isAbaixoPeso = imc < 18.5;
        boolean isPesoIdeal = imc > 18.6 && imc < 24.9;
        boolean isLevementeAcimaPeso = imc > 25 && imc < 29.9;
        boolean isObesidadeGrau1 = imc > 30 && imc < 34.9;
        boolean isObesidadeGrau2 = imc > 35 && imc < 39.9;
        boolean isObesidadeGrau3 = imc > 40;

        if (isAbaixoPeso)
            return ("Abaixo do peso");
        if (isPesoIdeal)
            return ("Peso ideal");
        if (isLevementeAcimaPeso)
            return ("Levemnte Acima do Peso");
        if (isObesidadeGrau1)
            return ("Obesidade Grau I");
        if (isObesidadeGrau2)
            return ("Obesidade Grau II");
        
        return ("Obesidade Grau III");
    }

    @Override
    public String toString() {
        return "{" +
                " nome='"+this.nome+"'" +
                ", peso='"+this.peso+"'" +
                ", altura='"+this.altura+"'" +
                ", dataNascimento='"+this.dataNascimento+"'" +
                "}";
    }
}
