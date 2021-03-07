/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CheckTime {

    public int dayInMonth(int month, int year) {
	int maxDay;
	if(year < 1000 || year >3000){
	    return 0;
	}
	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
	    return maxDay = 31;
	}
	if (month == 4 || month == 6 || month == 9 || month == 11) {
	    return maxDay = 30;
	}
	if (month == 2) {
	    if (isLeap(year)) {
		return maxDay = 29;
	    } else {
		return maxDay = 28;
	    }
	}
	return maxDay = 0;
    }

    public boolean isLeap(int year) {
	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
	    return true;
	}
	return false;
    }

    public boolean isValidDate(int day, int month, int year) {
	if (month < 1 || month > 12) {
	    return false;
	}
	if (day < 1) {
	    return false;
	}
	if (day > dayInMonth(month, year)) {
	    return false;
	}
	return true;
    }

    public static void main(String[] args) {
	int day, month, year;
	CheckTime dao=new CheckTime();
	Scanner sc = new Scanner(System.in);
	try {
	    System.out.println("Please enter day: ");
	    day = sc.nextInt();
	    System.out.println("Please Enter month: ");
	    month=sc.nextInt();
	    System.out.println("Please Enter Year: ");
	    year=sc.nextInt();
	    if(dao.isValidDate(day, month, year)){
		System.out.println("Valid Date!");
	    }else{
		System.out.println("InValid Day!!");
	    }
	} catch (NumberFormatException e) {
	}	
    }
}
