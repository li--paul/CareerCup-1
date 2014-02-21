class FindPath:
	result = [] # store current path
	results = [] # store all the paths

	def __init__(self, finalX, finalY, limitPoints):
		self.finalX = finalX
		self.finalY = finalY
		self.limitPoints = limitPoints

	def findPath(self, currentX, currentY):
		self.result.append([currentX, currentY])
		if currentX == self.finalX - 1 and currentY == self.finalY - 1: # if we arrive the destination
			tem = self.result[:] # construct a slice of original result list
			self.results.append(tem) # add the solution to the all paths list
		if currentX + 1 < self.finalX and self.isValid([currentX + 1, currentY]): # go right
			self.findPath(currentX + 1, currentY)
		if currentY + 1 < self.finalY and self.isValid([currentX, currentY + 1]): # go down
			self.findPath(currentX, currentY + 1)
		self.result.pop() # remove a searched point


	def isValid(self, point):
		if point in self.limitPoints:
			return False
		return True

	def startFind(self, startX, startY):
		self.findPath(startX, startY)
		if len(self.results): # there is at least on solution
			return self.results
		return("N") # no solution
		