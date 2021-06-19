import de.redsix.pdfcompare.PdfComparator;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		// Variable declaration - the files to be selected, where they should be saved and also the criteria for them to be considered 'equal' or 'not equal'.
		String file1 = "C:\\Users\\gui\\Desktop\\Compare PDF\\file1.pdf";
		String file2 = "C:\\Users\\gui\\Desktop\\Compare PDF\\file2.pdf";
		String resultFile = "C:\\Users\\gui\\Desktop\\Compare PDF\\Results\\Result";
		String ignoreFile = "C:\\Users\\gui\\eclipse-workspace\\ComparePDF\\ignore.conf";
		
		// Method that select the two files, compare, ignore the area that should be ignored and save the result.  
		new PdfComparator(file1, file2).withIgnore(ignoreFile).compare().writeTo(resultFile);
		
		// Compare method
		boolean isEquals = new PdfComparator(file1, file2).withIgnore(ignoreFile).compare().writeTo(resultFile);
		if (!isEquals) {
		    System.out.println("The files are different!");
		}else {
			System.out.println("The files are equal!");
		}
		
		System.out.println("Process completed!");
	}
}
