package kodlama.io_website.DataAccess;

import kodlama.io_website.Entities.Course;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Course course) {
		
		System.out.println("hibernate: "+ course.getCourseName());
		
	}

}
