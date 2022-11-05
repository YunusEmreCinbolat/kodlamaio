package kodlama.io_website.Business;

import kodlama.io_website.DataAccess.ProductDao;
import kodlama.io_website.Entities.Course;

public class ProductManager {
	private ProductDao[] productdao;
	private Course[] course;
	
	public ProductManager(ProductDao[] productdao1, Course[] course) {
		this.productdao=productdao1;
	    this.course=course;	
	}
	
	public void add(Course course) {
	
			for (ProductDao productdao : productdao) {
				for (Course course1 : this.course) {
					productdao.add(course1);
				}
			}
		}
		
	}