package Dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Formatter {

	public static java.sql.Date getSqlDate(String strDate){
		java.sql.Date sqlDate=null;
		try{
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate=format.parse(strDate);
		sqlDate=new java.sql.Date(utilDate.getTime());
                System.out.println(sqlDate);
		}catch(Exception e){
                    System.out.println("Error1");
                    System.out.println(e);}
		return sqlDate;
	}
	
	public static java.sql.Date getCurrentDate(){
		java.sql.Date sqlCurrentDate=null;
		try{
			java.util.Date utilDate=java.util.Calendar.getInstance().getTime();
			sqlCurrentDate=new java.sql.Date(utilDate.getTime());
			
		}catch(Exception e){
                    System.out.println("Error");
                    System.out.println(e);}
		return sqlCurrentDate;
	}
        
        public static void main(String[] args) {
            getSqlDate(Calendar.getInstance().getTime().toString());
        }
}
