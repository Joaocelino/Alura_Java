puts "Escolhendo um número secreto entre 0 e 200..."
numero_secreto = 175
puts "Escolhido.. que tal adivinhas hoje nosso número secreto?"

 
    puts "\n\n\n\n"
    puts "Tentativa 1"
    puts "Entre com o numero"
    chute = gets
    puts "Será que acertou? Você chutou " + chute

    acertou = numero_secreto == chute.to_i

    if acertou
            puts "Acertou!"
    else 
            maior = numero_secreto > chute.to_i
            if maior
                puts "O numero secreto é maior"
            else 
                puts "O numero secreto é menor"
            end
    end
