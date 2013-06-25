package controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonParser;


import com.json.parsers.JSONParser;
import com.json.parsers.JsonParserFactory;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import play.*;
import play.data.*;
import models.*;
import play.mvc.*;

//import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import views.html.*;

public class Application extends Controller {

	static Form<Task> taskForm = Form.form(Task.class);
	static Form<User> userForm = Form.form(User.class);
	public static Result index() {
		return redirect(routes.Application.tasks());
	}

	public static Result tasks() {
		return ok(
				views.html.index.render(Task.all(), taskForm, User.all(), userForm)
				);
	}
//nohup ./start -DapplyEvolutions.default=true -DapplyDownEvolutions.default=true &
	public static Result pictures() {
		//DBConnect.DataAction.describeTable("bwftr");
		//		DataAction.describeTable("bwftr");
		String[] got = new String[10];
		got[0] = "2345";
		got[1] = "23445";
		got[2] = "2745";
		String[] isimler = new String[10];
		isimler[0] = "2345";
		isimler[1] = "23445";
		isimler[2] = "2745";
		Boolean[] isimler2 = new Boolean[10];

		int sayi = 1;
		return ok(
				views.html.pictures.render(Task.all(), got, isimler, sayi, got[0],isimler2)
				);
		//
	}
	public static Result newTask() {
		Form<Task> filledForm = taskForm.bindFromRequest();
		if(filledForm.hasErrors()) {
			return badRequest(
					views.html.index.render(Task.all(), filledForm, User.all(), userForm)
					);
		} else {
			Task.create(filledForm.get());
			return redirect(routes.Application.tasks());  
		}
	}
	public static Result newUser() {
		Form<User> filledForm = userForm.bindFromRequest();
		if(filledForm.hasErrors()) {
			return badRequest(
					views.html.index.render(Task.all(), taskForm, User.all(), filledForm)
					);
		} else {
			User.create(filledForm.get());
			return redirect(routes.Application.tasks());  
		}
	}


	public static Result userVarMI(String id1, String isim) {
		//DBConnect.DataAction.describeTable("bwftr");

		System.out.println("userVarMi");

		Long id = Long.parseLong(id1);

		User spec = User.fFetch(id);
		System.out.println(spec.id+ " id burada veriyor");
		boolean yavsak = false;
		try {
			System.out.println(spec.label+ " label varmis yavsak");
			//			System.out.println(spec.friends[0]);
		} catch (javax.persistence.EntityNotFoundException e) {
			yavsak =true;
			System.err.println("Caught EntityNotFoundException: " + e.getMessage());
		}
		String[] arkadas = new String[9];
		arkadas[0] = " it oglu it";
		arkadas[1] = " gaat pezevenk";
		User spec2 = new User();
		spec2.id= id;
		spec2.label = isim;
		//		spec2.label= "ibnetor 3";
		spec2.jayson = "{\"key0\":\"0\"}";
		//		spec2.friends = got;
		try {
			User.create(spec2);
		} catch (javax.persistence.PersistenceException e) {
			yavsak = true;
			System.err.println("Caught PersistenceException: " + e.getMessage());
		}

		System.out.println(" gecti1");
		if(!yavsak) {
			System.out.println("gotu kolla");
			return ok("true");
		}
		else {
			//			AmazonDynamoDBSample.class.describeTable("bwftr");


			//Task.create(spec2);
			System.out.println("Bir bok yok, hepsini gecti");
			return ok("false");
		}


	}
	public static Result getAccess(String id) {
//		SendEmail.email();
//		DBConnect.DataAction.describeTable("bwftr");
		System.out.println("getAccess");
		String[] got = new String[4];
		String[] isimler = new String[4];
		Boolean[] linkler = new Boolean[4];

		String meID = "";
		int sayi = 0;
		String code = id;
		String url1 = "https://graph.facebook.com/oauth/access_token?client_id=142249709146437&redirect_uri=http://ec2-54-214-154-70.us-west-2.compute.amazonaws.com:9000/getAccess/&client_secret=06ebdadb62ede3f33c1974cacdbffe61&code="+code;

		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line = "";
		String result = "";/*
		try {
			url = new URL(url1);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			System.out.println("burasi?");
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			System.out.println("burasi?");

			while ((line = rd.readLine()) != null) {
				result += line;
			}
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result);
		if(result.length()< 32)
			return badRequest(
					views.html.pictures.render(Task.all(), got, isimler, sayi, meID)
					);
		else
			result = result.substring(13, result.length() - 16);
		String token = result;*/
		String token = "CAACBYBdiEUUBAPGZBzy8tN1Qnjkzi1tVJDRuwtxBUKzBLV8AQvnHnednRoOzZBDaNTggjzh6DMbNZAnhWgNHz5tQdL8yL20h1PG6X5qcxpYqZAMrG12R64RWWiVIxmImJ0LS7tu3ZBM3mZAkUBChE2szvfOxd2troZD";


		System.out.println(token);
		result="";
		String graphURL = "https://graph.facebook.com/me/friends/?access_token="+token;

		try {
			url = new URL(graphURL);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			while ((line = rd.readLine()) != null) {
				result += line;
			}
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		String isimJay = result;
		JsonParserFactory factory=JsonParserFactory.getInstance();


		JSONParser parser=factory.newJsonParser();
		Map jsonData=parser.parseJson(result);

		List al=(List) jsonData.get("data");

		got = new String[al.size()];
		isimler = new String[al.size()];
		linkler = new Boolean[al.size()];
		String rid = "";
		String isim = "";
		for( int j =0; j<al.size(); j++) {
			rid = (String) ((Map)al.get(j)).get("id");
			got[j]= rid;
			isim = (String) ((Map)al.get(j)).get("name");
			isimler[j] = turkceye(isim);
		}


		sayi = isimler.length/4 - 1;


		result="";
		String meURL = "https://graph.facebook.com/me/?access_token="+token;

		try {
			url = new URL(meURL);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			while ((line = rd.readLine()) != null) {
				result += line;
			}
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		factory=JsonParserFactory.getInstance();


		parser=factory.newJsonParser();
		jsonData=parser.parseJson(result);
		String name=(String) (jsonData).get("name");
		System.out.println("name: "+ name);
		meID = (String) (jsonData).get("id");
		userVarMI(meID,name);
		String yeni = getJaysonS(Long.parseLong(meID));
		factory=JsonParserFactory.getInstance();


		parser=factory.newJsonParser();
		jsonData=parser.parseJson(yeni);
		System.out.println("yazilanlar: "+ (String) (jsonData).get("key1"));
		System.out.println("matt mazur'a kayacam "+jsonData.containsValue("837307"));

		for( int j =0; j<isimler.length; j++) {
			if(jsonData.containsValue(got[j])) {
				isimler[j] = "İstek alındı";
			linkler[j]= false;
			} else
				linkler[j] = true;
		}


		return ok(
				views.html.pictures.render(Task.all(), got, isimler, sayi, meID,linkler)
				);
	}
	public static Result getJayson(Long id) {
		return ok(User.fFetch(id).jayson);
	}
	public static String getJaysonS(Long id) {
		return User.fFetch(id).jayson;
	}
	public static Result varMI() {

		System.out.println("varMi");
		String yazan = request().getQueryString("yazan");
		String yazilan = request().getQueryString("yazilan");
		Long id = Long.parseLong(yazilan+yazan);
		Long id2 = Long.parseLong(yazan+yazilan);
		Task spec = Task.fFetch(id);
		System.out.println(spec.id+ " id burada veriyor");
		boolean yavsak = false;
		try {
			System.out.println(spec.label+ " buna yazan var, karsilikli");



		} catch (javax.persistence.EntityNotFoundException e) {
			yavsak =true;
			System.err.println("Caught IOException: " + e.getMessage());
		}
		Task spec2 = new Task();
		spec2.id= id2;
		spec2.label= yazan;

		User ibne = User.fFetch(Long.parseLong(yazan));
		System.out.println("yazan pezevengin adi: "+ ibne.label);
		System.out.println("yazan pezevengin listesi: "+ ibne.jayson);
		User.updateJayson(yazilan, ibne.id);
		//		ibne.jayson += spec.label;
		//		System.out.println("yazan pezevengin yeni listesi: "+ ibne.jayson);

		try {
			Task.create(spec2);
		} catch (javax.persistence.PersistenceException e) {
			yavsak = true;
			System.err.println("Caught IOException: " + e.getMessage());
		}

		System.out.println(" gecti1");
		if(!yavsak) {
			System.out.println("gotu kolla");
			SendEmail.email();
			return ok("true");
		}
		else {
			System.out.println(" gecti2");


			//Task.create(spec2);
			System.out.println("Bir bok yok, yazdim seni");
			return ok("false");
		}


	}
	public static Result mobVarMI(String yazan, String yazilan, String isim) {

		System.out.println(yazan + " varMi "+ yazilan);
		//String yazan = request().getQueryString("yazan");
		//String yazilan = request().getQueryString("yazilan");
		Long id = Long.parseLong(yazilan+yazan);
		Long id2 = Long.parseLong(yazan+yazilan);
		Task spec = Task.fFetch(id);
		System.out.println(spec.id+ " id burada veriyor");
		boolean yavsak = false;
		try {
			System.out.println(spec.label+ " buna yazan var, karsilikli");
		} catch (javax.persistence.EntityNotFoundException e) {
			yavsak =true;
			System.err.println("Caught IOException: " + e.getMessage());
		}
		Task spec2 = new Task();
		spec2.id= id2;
		spec2.label= yazan;
		try {
			Task.create(spec2);
			System.out.println("task oldu");
		} catch (javax.persistence.PersistenceException e) {
			yavsak = true;
			System.err.println("task olmadi Caught IOException: " + e.getMessage());
		}
		User ibne = User.fFetch(Long.parseLong(yazan));

		try {
			System.out.println("yazan pezevengin adi: "+ ibne.label);		
			} catch (javax.persistence.EntityNotFoundException e) {
			yavsak =true;
			userVarMI(yazan,isim);

			System.err.println("create etti, Caught IOException: " + e.getMessage());
		}
		User ibne2 = User.fFetch(Long.parseLong(yazan));
		System.out.println("yazan pezevengin adi: "+ ibne2.label);		
		User.updateJayson(yazilan, ibne2.id);
		//		System.out.println("yazan pezevengin yeni listesi: "+ ibne.jayson);

		
		/*User ibne = User.fFetch(Long.parseLong(yazan));
		System.out.println("yazan pezevengin adi: "+ ibne.label);
		System.out.println("yazan pezevengin listesi: "+ ibne.jayson);
		User.updateJayson(yazilan, ibne.id);
		//		ibne.jayson += spec.label;
		//		System.out.println("yazan pezevengin yeni listesi: "+ ibne.jayson);

		

		*/
		System.out.println(" gecti1");

		if(!yavsak) {
			System.out.println("gotu kolla");
			return ok("true");
		}
		else {
			System.out.println(" gecti2");


			//Task.create(spec2);
			System.out.println("Bir bok yok, yazdim seni");
			return ok(yazan + " false "+ yazilan);
		}


	}
	public static Result deleteTask(Long id) {
		Task.delete(id);
		return redirect(routes.Application.tasks());
	}
	public static Result deleteUser(Long id) {
		User.delete(id);
		return redirect(routes.Application.tasks());
	}
	public static Result denemeget() {
		System.out.println("imelihnm"+ request());
		return ok("imelih");
	}

	public static String turkceye(String terc) {
		String turkce = terc;

		if(terc == null || terc.equals(""))
			return "";
		String harf = "ç";
		Pattern datePattern = Pattern.compile("\\\\u00e7");
		Matcher dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);
		harf = "Ç";
		datePattern = Pattern.compile("\\\\u00c7");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);


		harf = "İ";
		datePattern = Pattern.compile("\\\\u0130");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);
		harf = "ı";
		datePattern = Pattern.compile("\\\\u0131");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);


		harf = "Ğ";
		datePattern = Pattern.compile("\\\\u011e");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);
		harf = "ğ";
		datePattern = Pattern.compile("\\\\u011f");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);


		harf = "Ş";
		datePattern = Pattern.compile("\\\\u015e");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);
		harf = "ş";
		datePattern = Pattern.compile("\\\\u015f");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);


		harf = "Ö";
		datePattern = Pattern.compile("\\\\u00d6");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);
		harf = "ö";
		datePattern = Pattern.compile("\\\\u00f6");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);


		harf = "Ü";
		datePattern = Pattern.compile("\\\\u00dc");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);
		harf = "ü";
		datePattern = Pattern.compile("\\\\u00fc");
		dateMatcher = datePattern.matcher(turkce);
		turkce = dateMatcher.replaceAll(harf);


		return turkce;

	}


}
