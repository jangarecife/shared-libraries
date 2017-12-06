package org.skat

class SharedClass {
	def myName() {
		return "Poul" 
	}
	
	def checkOut(repo) {
		git url: "git@github.com:${repo}"
    }
}