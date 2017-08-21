
import javax.servlet.annotation.WebServlet;

import ai.api.model.Fulfillment;

@WebServlet("/webhook")
public class MyWebhookServlet extends AIWebhookServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doWebhook(AIWebhookRequest input, Fulfillment output) {
		  // output.setSpeech("You said: " + input.getResult().getFulfillment().getSpeech());
		System.out.println("-----------------You said:---------------------");
	}
}
