allSet = [1, 2, 3, 4, 5]
tempSet = []
subSets = []

def findAllSubsets (allset, tempSet, currentIdx):
	if currentIdx == len(allSet):
		subSets.append(tempSet[:])
	else:
		tempSet.append(allSet[currentIdx])
		findAllSubsets(allSet, tempSet, currentIdx + 1)
		tempSet.pop()

		findAllSubsets(allSet ,tempSet, currentIdx + 1)

findAllSubsets(allSet, tempSet, 0)
print(subSets)


	
	
