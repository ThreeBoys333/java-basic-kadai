package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void referer(String[] words) {
		
		HashMap<String, String> dictionaryMap = new HashMap<String, String>();
		
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach","桃");
		dictionaryMap.put("banana","バナナ");
		dictionaryMap.put("lemon","レモン");
		dictionaryMap.put("pear","梨");
		dictionaryMap.put("kiwi","キウィ");
		dictionaryMap.put("strawberry","いちご");
		dictionaryMap.put("grape","ぶどう");
		dictionaryMap.put("muscat","マスカット");
		dictionaryMap.put("cherry","さくらんぼ");
		
		String jpWords;
		
		for( int i = 0; i < words.length; i++ ) {
			jpWords = dictionaryMap.get( words[i] );
			if( jpWords == null ) {
				System.out.println( words[i] + "は辞書に存在しません");
			} else {
				System.out.println( words[i] + "の意味は" + jpWords );
			}
			
		}
	}
}
