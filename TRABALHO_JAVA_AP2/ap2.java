// TRABALHO AP2 GRUPO 4
// CIÊNCIA DE DADOS E INTELIGÊNCIA ARTIFICIAL - PROGRAMAÇÃO ORIENTADA A OBJETOS 

// BEATRIZ FERREIRA BABINSKI - 202301165768
// JOÃO -
// ANA -

// QUESTÃO 1

//devemos importar a biblioteca array
import java.util.ArrayList;

    public class empregado  {
        public static void main (String[]args){
            // array list é um array com vários métodos que facilita a manipulação dos elementos 

// classe empregado 
    private int matricula;
    private String nome;
    private  float salario;  


   // construtor de empregado 

    public empregado(int matricula,String nome, float salario){

 this.matricula = matricula ;
 this.nome =  nome;
 this.salario = salario;
    
// MÉTODOS GET E SET, PARA AJUDAR NA MANUTENÇÃO E PARA O ENCAPSULAMENTO, conseguir alterar o codigo priv

    public void setMatricula ( int matricula) {
        this.matricula=matricula;
        }
    public String getMatricula () {
         return matricula;
    }


    


    public void setNome( String nome) {
        this.nome=nome;
        }
    public String getNome () {
         return nome;
    }


    public void setSalario ( float salario) {
        this.salario=salario;
        }
    public float getSalario () {
         return salario;
    }

// CALCULAR O SALÁRIO NOVO 
public void calcularNewSalario (){

}

// utilizando um metodo add
     
}



