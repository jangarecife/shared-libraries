package org.skat

class SharedClass {
	def myName() {
		return "Poul" 
	}
	
	def printBranch() {
		return env.GIT_BRANCH 
	}
}