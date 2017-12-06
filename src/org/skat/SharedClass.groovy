package org.skat

def checkOut(repo) {
	git credentialsId: '258ed905-321d-4293-aac8-85858f77819d', url: "git@github.com:${repo}"
}
//	def getShortCommit(commit = "HEAD") {
//		return getShell().pipe("git rev-parse ${commit}").substring(0,6)
//	}

//def checkOutFrom() {
//	git url: "git@github.com:jangarecife/jenkins-workshop.git, credentialsId: '258ed905-321d-4293-aac8-85858f77819d'"
//}
class SharedClass {
	def myName() {
		return "Poul"
	}


}