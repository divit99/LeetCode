class Solution {
   public String discountPrices(String sentence, int discount) {
		DecimalFormat DF = new DecimalFormat("0.00");
		String[] words = sentence.split(" ");

		StringBuilder res = new StringBuilder();
		boolean addSpace = false;

		for (String word : words) {
			if (addSpace) {
				res.append(" ");
			}
			if (word.startsWith("$")) {
				try {
					long price = Long.parseLong(word.substring(1));
					res.append("$").append(DF.format(price * (100 - discount) / 100.00));
				} catch (Exception e) {
                    res.append(word);
				}
			} else {
				res.append(word);
			}
			addSpace = true;
		}
		return res.toString();
	}
}