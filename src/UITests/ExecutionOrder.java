package UITests;
import org.testng.annotations.*;

public class ExecutionOrder {

    // TestNG test components hierarchy
    // Suite -> Test -> Class > Method

    @AfterMethod
    public void m10(){        System.out.println("After Method will repet for 5,6,7 ");    }

    @BeforeSuite
    public void m1(){        System.out.println("Before Suite 1");    }

    @BeforeTest
    public void m2(){        System.out.println("Before Test 2");    }

    @BeforeClass
    public void m3(){        System.out.println("Before Class 3");    }

    @BeforeMethod
    public void m4(){        System.out.println("Before Method will repet for ,5,6,7 ");    }

    @Test
    public void m5(){        System.out.println("Method m5 5");    }

//    @Test
//    public void m6(){        System.out.println("Method m6 6");    }

    @Test
    public void m61(){        System.out.println("Method m61 7");    }

    @AfterSuite
    public void m7(){        System.out.println("After Suite 10");    }

    @AfterTest
    public void m8(){        System.out.println("After Test 8 ");    }

    @AfterClass
    public void m9(){        System.out.println("After Class 9");    }



}