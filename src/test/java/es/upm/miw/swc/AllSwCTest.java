package es.upm.miw.swc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import es.upm.miw.swc.DecimalCollectionTest;
import es.upm.miw.swc.FractionTest;
import es.upm.miw.swc.PointTest;
import es.upm.miw.swc.UserTest;

@RunWith(Suite.class)
@SuiteClasses({
    DecimalCollectionTest.class,
    PointTest.class,
    FractionTest.class,
    UserTest.class
})

public class AllSwCTest {

}
