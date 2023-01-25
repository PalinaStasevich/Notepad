package lt.lhu.nb.view;

public class View {

	public void printNotes(String response) {
		if (response == null) {
			System.out.println("Fail");
		} else {
			System.out.println(response);
			System.out.println();
		}

	}
}
