public class Main {
	public static void main(String[] args) {
        int totalSum = 1;
        String result = "";
        for (int i = 2; i <= 5; i++) {
        	totalSum = totalSum + i;
        	result = "Chislo " + totalSum + " yavlyaetcy nechetnym";
        	if (totalSum % 2 == 0) {
        		result = "Chislo " + totalSum + " yavlyaetcy chetnym";
        	}
        	System.out.println(result);
        }
    }
}