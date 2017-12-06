package org.skat

class SharedClass {
	def myName() {
		return "Poul" 
	}
	
	def checkOut(repo) {
		echo ${repo}
		//git credentialsId: '258ed905-321d-4293-aac8-85858f77819d', url: "git@github.com:${repo}"
    }
	
	def checkOutFrom() {
		git url: "git@github.com:jangarecife/jenkins-workshop.git"
	  }
}