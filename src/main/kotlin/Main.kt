fun main(){

        //2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

        var par: Int = 0
        var impar: Int = 0

        for(i in 1..10){
            print("Digite o número inteiro $i:")
            val num = readln().toInt()

        if(num % 2 ==0) {
            par++

        }else{
            impar++

        println("Números pares digitados: $par")
        println("Números ímapres digitados: $impar")
        }
        }
}