package kodlama.io_website.Entities;

public class Course {
	private String courseName;
	private String courseCategory;
	private int courseprice;
	public Course() {
	}
	public Course(String courseName, String courseCategory, int courseprice) {
		this.courseName = courseName;
		this.courseCategory = courseCategory;
		this.courseprice = courseprice;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCategory() {
		return courseCategory;
	}
	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}
	public int getCourseprice() {
		return courseprice;
	}
	public void setCourseprice(int courseprice) {
		this.courseprice = courseprice;
	}
	
}
