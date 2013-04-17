/*
 * LinkView.java
 * 
 * Author: Michael Rawlings
 * 
 * Parses the file and get all urls and put them in an array list.
 */

package parser;

import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LinkView {
	private Document doc; // Holds parsed html information.
	
	public LinkView(String html) {
		parseHTML(html);
	}
	
	/**
	 * Parses the given string using Jsoup.
	 * 
	 * @param html - string passed through.
	 */
	public void parseHTML(String html) {
		doc = Jsoup.parse(html);
	}
	
	/**
	 * Using Jsoup's ability to find urls quickly, goes through the doc
	 * and collects only urls and put them in an array list.
	 * 
	 * @return - an array list of urls (string).
	 */
	public ArrayList<String> getLinks() {
		ArrayList<String> urlList = new ArrayList<String>();
		
		Elements links = doc.select("a[href]"); // searches inside document that has anchor.
		for (Element link : links) {
			urlList.add(link.attr("href"));
		}
		
		Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]"); // searches inside document for img url
		for (Element image : images) {
			urlList.add(image.attr("src"));
		}
		
		return urlList;
	}
}
