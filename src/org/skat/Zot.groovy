package org.skat

def checkOut(repo) {
	git credentialsId: '258ed905-321d-4293-aac8-85858f77819d', url: "git@github.com:${repo}"
}