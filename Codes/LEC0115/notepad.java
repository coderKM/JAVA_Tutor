package LEC0115;

public class notepad {
	public static void main(String[] args) {

		String ab = "a a as dd";

		String[] arr = getWords(ab);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int countWords(String str) {
		int strLength = str.length();
		int count = 1;
		for (int x = 0; x < strLength; x++)
			if (str.charAt(x) == ' ') {
				count++;
			}
		return count;
	}

	public static String[] getWords(String str){
		int words = countWords(str);
		String subStr, newStr = str;
		int startInd = 0, indexSpace;
		String[] list = new String[words];
		for(int x = 0; x < words; x++){
			indexSpace = newStr.indexOf(' ');
			subStr = str.substring(startInd, indexSpace);
			newStr = newStr.substring(indexSpace +1);
			startInd = indexSpace;
			list[x] = subStr;
		}
		return list;
	}
//	public static String[] getWords(String str){
//		String[] strArr = new String[countWords(str)];
//		int arrIndex = 0;
//		String arrElement = "";
//				
//		for(int i = 0 ; i < str.length(); i++){
//			if(str.charAt(i) == ' '){
//				strArr[arrIndex] = arrElement;
//				arrIndex++;
//				arrElement = "";
//		} else {
//			arrElement+= str.charAt(i);
//		}
//		}
//		return strArr;
//	}
}
