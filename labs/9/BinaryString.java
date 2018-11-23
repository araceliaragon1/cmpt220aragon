
public class BinaryString {

	public static void main(String[] args) {
		String s = "101101";
		System.out.println(bin2Dec(s));
	}
	
	public static double bin2Dec (String binaryString) throws NumberFormatException {
		double total = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1' || binaryString.charAt(i) == '0') {
				if (binaryString.charAt(i) == '1') {
					total = Math.pow(2, binaryString.length() - 1 -i) + total;
				}
			}else {
				throw new NumberFormatException("Not a binary string.");
			}
		}
		return total;
		
		
	}

}
