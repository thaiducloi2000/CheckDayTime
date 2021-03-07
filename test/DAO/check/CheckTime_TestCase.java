/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.check;

import DAO.CheckTime;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author PC
 */
public class CheckTime_TestCase {
    CheckTime dao=new CheckTime();
    
    
//    @Test
//    public void isValidDay_RunWell(){
//	Assert.assertEquals(true,dao.isValidDate(29, 2, 2000));
//	Assert.assertEquals(false,dao.isValidDate(30, 2, 2000));
//	Assert.assertEquals(false,dao.isValidDate(-1, 2, 2000));
//	Assert.assertEquals(true,dao.isValidDate(31, 12, 2001));
//	Assert.assertEquals(false,dao.isValidDate(29, 2, 2001));
//	Assert.assertEquals(false,dao.isValidDate(31, 11, 2000));
//	Assert.assertEquals(true,dao.isValidDate(30, 11, 2000));
//	Assert.assertEquals(false,dao.isValidDate(30, 13, 2000));
//	Assert.assertEquals(false,dao.isValidDate(-1, 1, 2000));
//    }
    
    @Test
    public void DayInMonth_1(){
	Assert.assertEquals(0, dao.dayInMonth(12, 3001));
    }
    @Test
    public void DayInMonth_2(){
	Assert.assertEquals(31, dao.dayInMonth(12, 2000));
    }
    @Test
    public void DayInMonth_3(){
	Assert.assertEquals(31, dao.dayInMonth(12, 2001));
    }
    @Test (expected = RuntimeException.class)
    public void DayInMonth_4(){	
	int a=Integer.parseInt("a");
	Assert.assertEquals(0, dao.dayInMonth(12, a));
    }
    @Test
    public void DayInMonth_5(){
	Assert.assertEquals(31, dao.dayInMonth(12, 3000));
    }
    @Test
    public void DayInMonth_6(){
	Assert.assertEquals(0, dao.dayInMonth(4, 3001));
    }
    @Test
    public void  DayInMonth_7(){
	Assert.assertEquals(30, dao.dayInMonth(4, 2000));
    }
    @Test
    public void  DayInMonth_8(){
	Assert.assertEquals(30, dao.dayInMonth(4, 2001));
    }
    @Test (expected = RuntimeException.class)
    public void  DayInMonth_9(){
	int a=Integer.parseInt("a");
	Assert.assertEquals(0, dao.dayInMonth(4, a));
    }
    @Test
    public void  DayInMonth_10(){
	Assert.assertEquals(30, dao.dayInMonth(4, 3000));
    }
    @Test
    public void DayInMonth_11(){
	Assert.assertEquals(0, dao.dayInMonth(2, 3001));
    }
    @Test
    public void DayInMonth_12(){
	Assert.assertEquals(29, dao.dayInMonth(2, 2000));
    }
    @Test
    public void DayInMonth_13(){
	Assert.assertEquals(28, dao.dayInMonth(2, 2001));
    }
    @Test(expected = RuntimeException.class)
    public void DayInMonth_14(){
	int a=Integer.parseInt("a");
	Assert.assertEquals(0, dao.dayInMonth(2, a));
    }
    @Test 
    public void DayInMonth_15(){
	Assert.assertEquals(28, dao.dayInMonth(2, 1000));
    }
    @Test
    public void DayInMonth_16(){
	Assert.assertEquals(0, dao.dayInMonth(13, 2000));
    }
    @Test(expected = RuntimeException.class)
    public void DayInMonth_17(){
	int a=Integer.parseInt("a");
	Assert.assertEquals(0, dao.dayInMonth(13, a));
    }
    @Test(expected = RuntimeException.class)
    public void DayInMonth_18(){
	int a=Integer.parseInt("a");
	Assert.assertEquals(0, dao.dayInMonth(a, 1000));
    }

    @Test
    public void CheckDay_1(){
	Assert.assertEquals(true, dao.isValidDate(29, 2, 2000));
    }
    @Test
    public void CheckDay_2(){
	Assert.assertEquals(false, dao.isValidDate(29, 2, 2001));
    }
    @Test
    public void CheckDay_3(){
	Assert.assertEquals(true, dao.isValidDate(28, 2, 2001));
    }
    @Test
    public void CheckDay_4(){
	Assert.assertEquals(false, dao.isValidDate(31, 2, 2000));
    }
    @Test
    public void CheckDay_5(){
	Assert.assertEquals(false, dao.isValidDate(31, 2, 2000));
    }
    @Test
    public void CheckDay_6(){
	Assert.assertEquals(true, dao.isValidDate(31, 12, 2000));
    }
    @Test 
    public void CheckDay_7(){
	Assert.assertEquals(false, dao.isValidDate(31, 11, 2000));
    }
    @Test
    public void CheckDay_8(){
	Assert.assertEquals(false, dao.isValidDate(31, 13, 2001));
    }
    @Test (expected = RuntimeException.class)
    public void CheckDay_9(){
	int a=Integer.parseInt("a");
	Assert.assertEquals(false, dao.isValidDate(30, a, 2001));
    }
    @Test
    public void CheckDay_10(){
	Assert.assertEquals(true, dao.isValidDate(30, 11, 2000));
    }
    @Test
    public void CheckDay_11(){
	Assert.assertEquals(false, dao.isValidDate(-1, 2, 2000));
    }
    @Test
    public void CheckDay_12(){
	Assert.assertEquals(false, dao.isValidDate(-1, 12, 2000));
    }
    @Test
    public void CheckDay_13(){
	Assert.assertEquals(false, dao.isValidDate(32, 11, 2000));
    }
    @Test
    public void CheckDay_14(){
	Assert.assertEquals(false, dao.isValidDate(32, 2, 2000));
    }
    @Test (expected = RuntimeException.class)
    public void CheckDay_15(){
	int a=Integer.parseInt("a");
	Assert.assertEquals(false, dao.isValidDate(a, 2, 2000));
    }
}
