package consumer;

import java.util.List;
import java.util.logging.Logger;

import sorting.util.MySortingUtil;

public class MySortingUtilConsumer {
	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Ranga", "Aiza", "Anna", "Adam", "Eve"));
		logger.info(sorted.toString());
	}

}
