package filereading;

import java.io.*;


public class Demo {

	public static void main(String[] args) {

		String filePath = "./src/test/resources/testFiles/Testing.text";
		BufferedReader br=null;
		FileReader fileReader=null;
		File file=null;
		int lineCount=0;
		int wordCount=0;
		int charCount=0;
		try{

			file = new File(filePath);
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);

			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				lineCount++;
				String [] words =line.split("\\s+");
				wordCount+=words.length;

				for(String word: words){
					charCount+=word.length();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (NullPointerException | IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println(lineCount);
		System.out.println(wordCount);
		System.out.println(charCount);
	}
}
