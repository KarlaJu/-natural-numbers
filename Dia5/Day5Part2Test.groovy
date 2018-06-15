class Day5Part2Test extends GroovyTestCase{	
	def day5 = new Day5Part2()

	void testContainsAtLeastAPairOfSameLetters(){
		String text = "asdfgjwer"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 0
	}

	void testTwo(){
		String text = "asdgmymdfdg"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 1
	}
	void testletras(){
		String text = "anaqwean"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 1

	}
	void testNice(){
		String text = "qjhvhtzxzqqjkmpb"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 1
	}

	
}
