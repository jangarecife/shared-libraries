import org.skat.*

def call() {
	def sc = new SharedClass()
	
    echo "HALLO! " + sc.myName()

	echo "Branch: " + sc.printBranch()
	
}