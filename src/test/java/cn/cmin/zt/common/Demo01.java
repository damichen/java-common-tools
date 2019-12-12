package cn.cmin.zt.common;

import cn.cmin.zt.common.utlis.CheckUtils;
import org.junit.Assert;
import org.junit.Test;

public class Demo01 {

    @Test
    public void fun01(){
        Assert.assertEquals(CheckUtils.isAnyEmpty("11","sss"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(""),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(null,"11","sss"),false);
    }
    @Test
    public void fun02(){
        Object arr[] ={ 1, 2, 3, 4, 5};
        Object arr2[]=null;
        Object arr3[]=new String[]{"1","2"};
        Object arr4[]={};
        Assert.assertEquals(CheckUtils.isEmpty(arr),false);
        Assert.assertEquals(CheckUtils.isEmpty(arr2),true);
        Assert.assertEquals(CheckUtils.isEmpty(arr3),false);
        Assert.assertEquals(CheckUtils.isEmpty(arr4),true);
    }

    @Test
    public void fun03(){

        Assert.assertEquals(CheckUtils.equals("",""),true);
        Assert.assertEquals(CheckUtils.equals(null,""),false);
        Assert.assertEquals(CheckUtils.equals("","111"),false);
        Assert.assertEquals(CheckUtils.equals("11","11"),true);
    }

    @Test
    public void fun04(){

        Assert.assertEquals(CheckUtils.equals(null,1),false);
        Assert.assertEquals(CheckUtils.equals(22,22),true);


    }
}
