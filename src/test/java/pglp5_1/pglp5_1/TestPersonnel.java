package pglp5_1.pglp5_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestPersonnel {

	 public static void main(String[] args) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
			for(int i = 0;i<10;i++){
				list.add(i);
			}
		  Personnel per = new Personnel();
		  per.setNom("toto");
		  per.setPrenom("tutu");
		  per.setFonction("2019-03-03");
		  per.setTelephone(list);
		  
		 }
		}
