package ku.ws.practice;

import ku.ws.http.JerseyHTTPClientPractice;

public class Practice2Test {
	public static void main(String[] args) {
		// Jersey HTTP Client Test
		System.out.println("Jersey HTTP Client Test");
		JerseyHTTPClientPractice.getSimpleHTTP();
		
		String xmlStr = JerseyHTTPClientPractice.getFluentHTTP();
		//JDOMParserPractice.parseXMLWithString(xmlStr);
		System.out.println(xmlStr);
		System.out.println("Jersey HTTP Client Test End\n\n");
	}
}
