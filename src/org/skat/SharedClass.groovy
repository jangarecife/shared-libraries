package org.skat

class SharedClass {
	def myName() {
		return "Poul" 
	}
	
	def pipeline() {
		git credentialsId: '258ed905-321d-4293-aac8-85858f77819d', url: 'git@github.com:jangarecife/jenkins-workshop.git'
		
	}
}