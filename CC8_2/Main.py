from FindPath import *
import random

while True:
	x = (int)(input("Please input x: "))
	if x > 2:
		break

while True:
	y = (int)(input("Please input y: "))
	if y > 2:
		break

limitPoints = []
for i in range(max(x, y)):
	limitPoint = [random.randint(0, x - 1), random.randint(0, y -1)]
	if limitPoint in limitPoints:
		pass
	else:
		limitPoints.append(limitPoint)

print("limitPoints are")
for limitPoint in limitPoints:
	print(limitPoint)

findPath = FindPath(x, y, limitPoints)
print("Result is: ")
for path in findPath.startFind(0, 0):
	if path is "N":
		print("No Way")
		break
	print(path)
