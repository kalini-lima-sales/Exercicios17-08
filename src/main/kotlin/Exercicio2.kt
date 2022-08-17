fun main(){

    /*4- Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos.*/

    var idade = 0
    var sexo = 0
    var opc = 0
    var pCalmas = 0
    var mNervosas = 0
    var hAgressivos = 0
    var outrosCalmos = 0
    var pNerMais40 = 0
    var pCalMenos18 = 0
    var cont = 0

    while(cont < 10) {
        println("Pessoa ${cont + 1}")
        print("Digite a sua idade: ")
        idade = readln().toInt()
        print("Digite o seu sexo: (1 - Feminino / 2 - Masculino / 3 - Outro): ")
        sexo = readln().toInt()
        print("Selecione sua característica (1 - Calma / 2 - Nervosa / 3 - Agressiva): ")
        opc = readln().toInt()

        if (opc == 1) {
            pCalmas++
        }

        if (sexo == 1 && opc == 2) {
            mNervosas++
        }

        if (sexo == 2 && opc == 3) {
            hAgressivos++
        }

        if (sexo == 3 && opc == 1) {
            outrosCalmos++
        }

        if (idade > 40 && opc == 2) {
            pNerMais40++
        }

        if (idade < 18 && opc == 1) {
            pCalMenos18
        }

        cont++

    }

    println("o número de pessoas calmas: $pCalmas")
    println("o número de mulheres nervosas: $mNervosas")
    println("o número de homens agressivos: $hAgressivos")
    println("o número de outros calmos: $outrosCalmos")
    println("o número de pessoas nervosas com mais de 40 anos: $pNerMais40")
    println("o número de pessoas calmas com menos de 18 anos: $pCalMenos18")

}