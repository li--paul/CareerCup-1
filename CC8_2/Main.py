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

findPath = FindPath(x, y, limitPoints)
print(findPath.startFind(0, 0))
