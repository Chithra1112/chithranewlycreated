package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {
	public void fileUpload() throws AWTException {

		Robot robot = new Robot();

		StringSelection filePath = new StringSelection(
				"C:\\Users\\SIJU\\Desktop\\manual testing materials\\Test scenario for facebook login.docx");

		// copy the path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		// press control+v for pasting
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(2);
		robot.keyPress(KeyEvent.VK_V);

		// release control+v for releasing
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2);
		robot.keyRelease(KeyEvent.VK_V);

		// for pressing n releasing enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("File uploaded successfully");

	}
}
