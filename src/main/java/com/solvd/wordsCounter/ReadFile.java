package com.solvd.wordsCounter;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;


public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		Set<String> set = new HashSet<String>();
		String s = "Count of appearances";
		String text = FileUtils.readFileToString(new File("/workspace/Army/src/main/resources/inputText.txt"), "UTF-8");
		String[] words = StringUtils.split(text);
	    words = StringUtils.stripAll(words, ",.;!$#�?'%&/()=");
		for (int i = 0; i < words.length; i++) { set.add(words[i]); }
		for(String word : set) {
			s = s + "\n" + word + "-> " + String.valueOf(StringUtils.countMatches(text, word));
			}
		FileUtils.writeStringToFile(new File("/workspace/Army/src/main/resources/result.txt"), s,"UTF-8");
				
		
	}
}