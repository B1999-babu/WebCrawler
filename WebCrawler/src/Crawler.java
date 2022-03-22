import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler {

	List<String> titles = new ArrayList<>();
	List<String> urlVisited = new ArrayList<>();
	List<String> doctors = new ArrayList<>();

	public int PageCount = 1;
	public int DrPagecount = 1;

	public void getLinks(String startURL) throws IOException {

		if (urlVisited.contains(startURL)) {
			urlVisited.add(startURL);

		} else {
			int i = 1;
			Document doc = Jsoup.connect(startURL).timeout(6000).get();

			Elements links = doc.select("a[href]");
		
			int NoOfLinks = doc.select("a[href]").size();

			String title = doc.title();
			titles.add(title);

			System.out.println();
			System.out.println();

			System.out.println("number of links  " + NoOfLinks + "  " + "Page No: " + increment());
			System.out.println("Title : " + title);

			for (Element link : links) {

				System.out.println("\nlink " + i++ + " :" + link.attr("href"));
				System.out.println("text : " + link.text());
				

			}
		}
	}

	public void getDoctors(String doctorUrl) throws IOException {
		if (doctors.contains(doctorUrl)) {
			doctors.add(doctorUrl);
		} else {
			int i = 1;
			Document doc1 = Jsoup.connect(doctorUrl).timeout(6000).get();

			Elements Doctors = doc1.getElementsByTag("h3");
			String title1 = doc1.title();

			System.out.println();
			System.out.println();
			System.out.println("No of Doctors : " + Doctors.size() + " Page No: " + DrPageIncrement());
			System.out.println("Title " + title1);
			for (Element doctor : Doctors) {
				System.out.println("Doctors : " + i++ + "  " + doctor.text());
			}
		}
	}

	public int increment() {
		return PageCount++;

	}

	public int DrPageIncrement() {
		return DrPagecount++;

	}

}
