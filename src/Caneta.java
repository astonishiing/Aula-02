public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERROR! não pode rabiscar");
        }else{
            System.out.println("Estou Rabiscando");
        }

    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
