package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import junit.framework.TestCase;
import org.junit.Assert;


public class IntLinkedListTest extends TestCase{
    public void testpush(){
        IntLinkedList LinekdList = new IntLinkedList();
        LinekdList.push(2);
        int testValue = 2;
        int result = LinekdList.pop();
        Assert.assertEquals(testValue,result);
    }

    public void testpop(){
        IntLinkedList LinekdList = new IntLinkedList();
        LinekdList.push(2);
        LinekdList.push(3);
        int testValue = 3;
        int result = LinekdList.pop();
        Assert.assertEquals(testValue,result);
    }
    public void testisEmpty(){
        IntLinkedList LinekdList = new IntLinkedList();
        LinekdList.push(2);
        LinekdList.pop();
        Assert.assertTrue(LinekdList.isEmpty());
    }
    public void testisFull(){
        IntLinkedList LinekdList = new IntLinkedList();
        LinekdList.push(2);
        LinekdList.push(3);
        Assert.assertFalse(LinekdList.isFull());
    }
    public void testtop(){
        IntLinkedList LinekdList = new IntLinkedList();
        LinekdList.push(2);
        LinekdList.push(3);
        int testValue = 3;
        LinekdList.top();
        int result = LinekdList.top();
        Assert.assertEquals(testValue,result);
    }

}