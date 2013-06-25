package models;

import java.util.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class User extends Model{
	@Id
	public Long id;
	@Required
	public String label;
	public String jayson;
	public int ySayi = 0;
//	public String[] friends;
//public User(String[] got) {
//	String[] friends = got;
	
//}
	public static Finder<Long,User> find = new Finder(
		    Long.class, User.class
		  );
	
	public static List<User> all() {
		return find.all();
	}

	public static void create(User user) {
	user.save();
	}

	public static User fFetch(Long id) {

		return find.ref(id);
	}
	public static String updateJayson(String ek, Long id) {
		User got = find.ref(id);
		got.ySayi++;
		got.jayson = got.jayson.substring(0, got.jayson.length()-1);
		got.jayson += ",\"key"+got.ySayi+"\":\""+ek+"\"}";
		got.update(id);
		String yeniJayson = find.ref(id).jayson;
		System.out.println("adami hasta etmeyin uleeeyn "+yeniJayson);
		return yeniJayson;
	}
	public static void delete(Long id) {
		find.ref(id).delete();
	}

}