import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestLab4 {
    //Cau a
    @Test
    public void twoPositive1() {
        Assert.assertEquals(Lab4.findMax(3, 5), 5);
    }

    @Test
    public void twoPositive2() {
        Assert.assertEquals(Lab4.findMax(30 * 5, 20 * 6), 150);
    }

    @Test
    public void twoNegative1() {
        Assert.assertEquals(Lab4.findMax(-2, -19), -2);
    }

    @Test
    public void twoNegative2() {
        Assert.assertEquals(Lab4.findMax(-3, -4 * 2), -3);
    }

    @Test
    public void posiNega() {
        Assert.assertEquals(Lab4.findMax(-3, 15), 15);
    }

    //Cau b
    @Test
    public void testMin1(){
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(Lab4.findMinArray(a),1);
    }

    @Test
    public void testMin2(){
        int a[] = {-1, -2, -3, -4, -5};
        Assert.assertEquals(Lab4.findMinArray(a),-5);
    }

    @Test
    public void testMin3(){
        int a[] = {-3, -2, -1, 0, 1, 2, 3};
        Assert.assertEquals(Lab4.findMinArray(a),-3);
    }

    @Test
    public void testMin4(){
        int a[] = {-99, -70, 0, 100, 9853};
        Assert.assertEquals(Lab4.findMinArray(a),-99);
    }

    @Test
    public void testMin5(){
        int a[] = {70, 80, 90, 100};
        Assert.assertEquals(Lab4.findMinArray(a),70);
    }


    //Cau c
    @Test
    public void testBMI1(){
        Assert.assertEquals(Lab4.BMI(45.00f, 1.48f), "Binh thuong");
    }

    @Test
    public void testBMI2(){
        Assert.assertEquals(Lab4.BMI(53.00f, 1.70f), "Thieu can");
    }

    @Test
    public void testBMI3(){
        Assert.assertEquals(Lab4.BMI(67.00f,1.74f), "Binh thuong");
    }
    @Test
    public void testBMI4(){
        Assert.assertEquals(Lab4.BMI(55.00f,1.50f), "Thua can");
    }

    @Test
    public void testBMI5(){
        Assert.assertEquals(Lab4.BMI(80.88f,1.63f), "Beo phi");
    }

}
