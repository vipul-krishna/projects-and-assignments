package com.neu.controller;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.neu.dao.ProductDAO;
import com.neu.exception.ProductException;
import com.neu.pojo.Product;
import com.neu.pojo.Vendor;
import com.neu.validator.ProductValidator;


@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Autowired
	@Qualifier("productDao")
	ProductDAO productDao;
	
	@Autowired
	@Qualifier("productValidator")
	ProductValidator productValidator;
	
	@Autowired
	ServletContext servletContext;
	
	@InitBinder("product")
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(productValidator);
	}
	
	@RequestMapping(value="/product/add.htm", method = RequestMethod.POST)
	public ModelAndView addProduct(HttpServletRequest request, @ModelAttribute("product") Product product, BindingResult result)throws Exception{
		
		productValidator.validate(product, result);
		
		if (result.hasErrors()) {
			System.out.println("Point 1");
			return new ModelAndView("vendor-action", "product", product);
		}
		System.out.println("Point 5");
		try {
			
			//FIle
			System.out.println("Test1111111");
			File directory;
            String check = File.separator; // Checking if system is linux
                                            // based or windows based by
                                            // checking seprator used.

            
            String path = null;
            if (check.equalsIgnoreCase("\\")) {
                path = servletContext.getRealPath("").replace("build\\", ""); // gives real path as Lab9/build/web/
                                                                      // so we need to replace build in the path
                                                                                    }
            if (check.equalsIgnoreCase("/")) {
                System.out.println("inside here 2");
                path = servletContext.getRealPath("").replace("build/", "");
                path += "/"; // Adding trailing slash for Mac systems.
                System.out.println(path+"some path");
            }
            
            directory = new File(path);
            //directory = new File("");
            boolean temp = directory.exists();
            if (!temp) {
                temp = directory.mkdir();
            }
            
            CommonsMultipartFile photoInMemory = product.getPhoto();
            String fileName = photoInMemory.getOriginalFilename();
            System.out.println("filename is: "+fileName);
            File local = new File("E:\\photo\\images",fileName);
            photoInMemory.transferTo(local);
            
            String lp = local.getPath();
//            String lp2 = "file:///"+lp1;
//            String lp = lp2.replace("\\","/");
            
            product.setFilePath(lp);
            System.out.println("File Path is: "+lp);
            
			
			
			
			
			
			
			/////////////////////////////////////////////////////////////////////////////////
			
			Vendor v = (Vendor)request.getSession().getAttribute("vendor");
			System.out.println("Vendor Name is: "+v.getFirstName());
			System.out.println("He represents company: "+v.getCompanyName());
			System.out.println("product brand will be set as:  "+product.getProductBrand());

			Product p = productDao.addNewProduct(product,v,lp,fileName);
			request.getSession().setAttribute("product", p);

			return new ModelAndView("addproduct-success", "product", p);

		} catch(ProductException e) {
			System.out.println("Error while adding items to catalog");
			System.out.println("Exception: " + e.getMessage());
			return new ModelAndView("error", "errorMessage", "error while adding items to catalog");
		}
		
	}
	
	@RequestMapping(value="/product/view.htm", method = RequestMethod.POST)
	public ModelAndView viewProduct(HttpServletRequest request) throws Exception{
		
		//Fetch the vendor object for that product in the same way as done in the above method
		Vendor v  =  (Vendor)request.getSession().getAttribute("vendor");
		String brand = v.getCompanyName();
		System.out.println("brand is:  "+brand);
		
		try {
			
			ArrayList<Product> myList = (ArrayList<Product>) productDao.fetchProductList(brand);
			request.getSession().setAttribute("myList", myList);
			return new ModelAndView("vendor-viewproduct");
			
		} catch (ProductException e) {
			System.out.println("Exception: " + e.getMessage());
			return new ModelAndView("error", "errorMessage", "error while fetching items from catalog");
		}
		
	}

}
