package kodlama.io_website;

import java.util.Iterator;
import java.util.Scanner;

import kodlama.io_website.Business.ProductManager;
import kodlama.io_website.DataAccess.HibernateProductDao;
import kodlama.io_website.DataAccess.JdbcProductDao;
import kodlama.io_website.DataAccess.ProductDao;
import kodlama.io_website.Entities.Course;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac adet kurs girilecek: ");
		int adet=scan.nextInt();
		Course[] course = new Course[3];
		String CourseName;
		String CourseCategory;
		int CoursePrice;
		for (int i=0;i<adet;i++) {
			System.out.println("kurs adi giriniz");
			CourseName=scan.next();
			System.out.println("kurs kategori giriniz: ");
			CourseCategory=scan.next();
			if(i>0) {
				for (Course course2 : course) {
					if(course2.getCourseName()==CourseName){
						System.out.println("Bu adda kurs vardir baska ad giriniz:");
						CourseName=scan.next();
					}
					if(course2.getCourseCategory()==CourseCategory){
						System.out.println("Bu adda kurs kategori vardir vardir baska kategori giriniz:");
						CourseCategory=scan.next();
					}
					
				}
					
			}
			System.out.println("kurs fiyati giriniz");
			CoursePrice=scan.nextInt();
			if(CoursePrice<0) {
				System.out.println("kurs fiyati - olamaz yeni fiyat giriniz");
				CoursePrice=scan.nextInt();
			}
			course[i].setCourseName(CourseName);
			course[i].setCourseCategory(CourseCategory);
			course[i].setCourseprice(CoursePrice);
			
			
		}
		ProductDao[] productdao= {new HibernateProductDao(),new JdbcProductDao()};
		ProductManager productmanager= new ProductManager(productdao,course);
		
	}

}
