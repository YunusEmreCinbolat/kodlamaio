package kodlama.io_website.DataAccess;

import kodlama.io_website.Entities.Course;

public class JdbcProductDao implements ProductDao {

	public void add(Course course) {
		System.out.println("JDBC: "+ course.getCourseName());
	}

}
