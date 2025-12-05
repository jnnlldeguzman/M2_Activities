package Individual;

public class Seatwork4 {

	public static void main(String[] args) {


		S4Executable excel = new S4MSExcel();
		S4Executable word = new S4MSWord();
		
		
		runProgram(excel);
		runProgram(word);
		
		stopProgram(excel);
		stopProgram(word);
		
				
	}

	
	private static void runProgram(S4Executable executableProgram) {
		executableProgram.run();
	}
	
	
	private static void stopProgram(S4Executable executableProgram) {
		executableProgram.stop();
	}	
	
}
