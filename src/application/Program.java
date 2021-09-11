package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Marcelo", "marcelofuhr@me.com", new Date(), 9500.00, obj);
		System.out.println(obj);
		System.out.println(seller);
	}
}
