### Relacionado a essa Aula-02, iremos abordar sobre objetos e métodos

Objetos: Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas **características, comportamento e estado atual**

- Atributos = características (Coisas que eu tenho?)

* Comportamentos = métodos (Coisas que  faço?)

* Estado = estado atual (Como estou agora?)

* Quando ter uma classe e queremos transforma-la em objeto isso é **instanciar**

_OBS: Para criar um objeto tenho antes que definir uma classe_

---------------------------------------------------------------------------------------------------------------------------------------------------------------
Explicação passo a passso do codigo:

## 1° adicionamos atributos (Classe Caneta)
```
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
```
## 2° adicionamos os métodos (Classe Caneta)
```
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
```

## 3° Instânciação do objeto (Classe Main)
```
Caneta c1 = new Caneta();
```
## 4° Criação do método status(), para mostrar o "status" do meu objeto (Classe Caneta)

```
void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
```
this : significa auto-referencia, então quem chamou o método status irá ser substituído por "this"

## 5° Chamada para um atributo (Classe Main)

```
c1.cor = "Azul";
c1.ponta = 0.5f;
```

## 6° Chamada para um método (Classe Main)
```
c1.status();
```

-----------------------------------------------------------------------------------------------------------------------------------------------------------------
### Exemplo de uso do "this"
<sup>Esse exemlplo não esta no codigo</sup>
```
c1.tampar()
```
Quando eu chamo o método "tampar()". Quem foi que chamou tampar()? O c1, certo?

Indo no método tampar temos, "this.tampada = true".
- this é o nome do objeto que chamou. E quem chamou? O "c1". Então o "this" ira ser substituído por "c1", no momento em que "c1" chamar o método "tampar()"
- this é uma referência ao próprio objeto que chamou
- sempre que quisermos modificar um atributo dentro da própria classe coloque o "this" afrente da linha que irá receber esse atributo

Perceba que todos os objetos que são de uma mesma classe têm os mesmo atributos e os mesmos métodos, podem ou não ter os mesmos estados

*@astonishiing*
