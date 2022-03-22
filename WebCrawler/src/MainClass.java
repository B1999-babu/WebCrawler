import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		Crawler crawler=new Crawler();
		crawler.getLinks("https://ayu.health");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Multi-Speciality-Hospital---Electronic-City-14");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Multi-Specialty-Hospital---Marathahalli-15");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Eye-Clinic-Bellandur-20");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Super-Speciality-Hospital---Malleshwaram-21");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Multi-Speciality-Hospital----Nandhini-layout-39");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Multi-Speciality-Hospital----Kalyan-nagar-43");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Multi-Speciality-Hospital---Bellandur-47");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Multi-Speciality-Hospital---Gandhi-Nagar-50");
		crawler.getLinks("https://ayu.health/bangalore/hospital/Ayu-Health-Multi-Speciality-Hospital---Chamrajpet-56");
		
		
		crawler.getDoctors("https://ayu.health");
		crawler.getDoctors("https://ayu.health/jaipur/hospital/Ayu-Health-Multispecialty-Hospital-kathipura-Jaipur-129");
		crawler.getDoctors("https://ayu.health/jaipur/hospital/Ayu-Health-Multispeciality-Hospital-Lalkothi-Jaipur-121");
		
	}
	

}
