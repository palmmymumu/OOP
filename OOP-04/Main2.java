public class Main2 {

	public static void main(String args[]){
		System.out.println(extractIt("http://example.com/files/public_files/test.zip"));
		System.out.println(extractIt("www.abc.com/pub/*aaa.html"));
		System.out.println(extractIt("phuket.psu.ac.th/aaa.html"));
		System.out.println(extractIt("www.phuket.psu.ac.th/study/study.php"));
	}

	public static String extractIt(String url) {
		String[] str = url.split("/");
		String filename = str[str.length - 1];
		if (filename.startsWith("*"))
			filename = "_" + filename.substring(1, filename.length() - 1);
		return filename;
	}

}
