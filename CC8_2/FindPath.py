class FindPath:
	result = []
	def __init__(self, finalX, finalY, limitPoints):
		self.finalX = finalX
		self.finalY = finalY
		self.limitPoints = limitPoints

	def findPath(self, currentX, currentY):
		self.result.append([currentX, currentY])
		hasRoute = False
		if currentX == self.finalX - 1 and currentY == self.finalY - 1:
			return True
		if currentX + 1 < self.finalX and self.isValid([currentX + 1, currentY]):
			hasRoute = self.findPath(currentX + 1, currentY)
		if hasRoute is False and currentY + 1 < self.finalY and self.isValid([currentX, currentY + 1]):
			hasRoute = self.findPath(currentX, currentY + 1)
		return hasRoute


	def isValid(self, point):
		if point in self.limitPoints:
			return False
		return True

	def startFind(self, startX, startY):
		if self.findPath(startX, startY):
			return self.result
		return "No Way"
		