package version_1_0_0;

import java.util.locale;
import java.text.decimalformat;
import java.text.DecimalFormatSymbols;

public class Main {

	public static void main(String[] args) {

		/*
		 * string padrao = "###.###,##";
		 * decimalformat df = new DecimalFormat(padrao);
		 * DecimalFormatSymbols dfs = new DecimalFormatSymbols(new locale("pt",
		 * "Brazil"));
		 * dfs.setDecimalSeparator(',');
		 * dfs.setgroupingSeparator('.');
		 * df.setgroupingsize(3);
		 * df = new decimalformat(padrao, dfs);
		 */

		Janela j;
		j = new Janela();
		j.setVisible(true);
	}
}
