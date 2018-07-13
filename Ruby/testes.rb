chutes = []

chute = 176
tentativa = 1
chutes [tentativa - 1] = chute

chute = 100
tentativa = 3
chutes [tentativa - 1] = chute

chute = 130
tentativa = 2
chutes [tentativa - 1] = chute

puts chute[0]
puts chute[1]
puts chute[2]

for contador in 0..(tentativa-1)
    puts "Chute: " + chutes[contador].to_s
end