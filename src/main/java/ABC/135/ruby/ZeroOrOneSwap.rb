n = gets.to_i
list = gets.split.map &:to_i

count = 0
for i in 0...n do
  if i+1 != list[i]
    count += 1
  end
end

if count <=2
    puts 'YES'
else
    puts 'NO'
end