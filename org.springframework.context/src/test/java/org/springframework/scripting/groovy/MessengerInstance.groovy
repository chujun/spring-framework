package org.springframework.scripting.groovy;

import org.springframework.scripting.Messenger

class GroovyMessengerV2 implements Messenger {

	GroovyMessengerV2() {
		println "GroovyMessenger"
	}

	def String message;
}

return new GroovyMessengerV2();
