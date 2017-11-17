package com.example;

import akka.actor.UntypedActor;

public class BillingWorker extends UntypedActor {

	@Override
	public void onReceive(Object message) {
		if (message instanceof MyMessage) {
			System.out.println("Order recieved by " + getSelf());

		} else {
			unhandled(message);
		}
	}

}