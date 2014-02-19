def fibo(number):
	if number == 0:
		return 0
	elif number == 1:
		return 1
	elif number == 2:
		return 1
	else:
		return(fibo(number - 1) + fibo(number - 2))

number = int(input("Please input a number for fibo calculate: "))

while number < 0:
		print("Number should bigger than zero, try again.")
		number = int(input("Please input a number for fibo calculate: "))
print(fibo(number))