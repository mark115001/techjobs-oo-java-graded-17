package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.xml.namespace.QName;

import static java.lang.System.lineSeparator;
import static java.lang.System.mapLibraryName;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job, test_job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job();
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job instanceof Job);
        assertTrue("Product Message", true);
        assertTrue("ACME", true);
        assertTrue("Desert", true);
        assertTrue("Quality control", true);
        assertTrue("Persistence", true);
        assertEquals("Product tester", test_job2.getName());
        assertEquals("ACME", test_job2.getEmployer().getValue());
        assertEquals("Desert", test_job2.getLocation().getValue());
        assertEquals("Quality control", test_job2.getPositionType().getValue());
        assertEquals("Persistence", test_job2.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job_string_test = new Job("Web Developer", new Employer("LaunchCode"), new Location("STL"), new PositionType( "Back-end developer"), new CoreCompetency("Java"));
        String firstChar = String.valueOf(job_string_test.toString().charAt(0));
        String lastChar = String.valueOf(job_string_test.toString().charAt(job_string_test.toString().length()-1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job_string_test = new Job("Web Developer", new Employer(""), new Location("STL"), new PositionType( ""), new CoreCompetency("Java"));


    }

}

